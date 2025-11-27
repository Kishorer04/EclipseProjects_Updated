package gettingstarted;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileDownload {

	public static void main(String[] args) throws IOException {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		
		Page page = browser.newPage();
		
		page.navigate("https://the-internet.herokuapp.com/download");
		
		// Wait for the download to start
		Download download = page.waitForDownload(()->{
			// Make sure to give the line which triggers the download inside waitForDownload()
			page.locator("//a[text()='testfile.txt']").click();
		});
		
		/*
		System.out.println(download.suggestedFilename());
		System.out.println(download.url());
		System.out.println(download.path());
		*/
		
		// When a file is downloaded using Playwright, it saves the file in a Temporary folder
		// We have to mention the path to store the file permanently, so that it moves the file from the Temporary folder to the path which we mentioned
		// Note: Downloaded files are deleted when the browser context that produced them is closed. And that's why we need to store it in our location
		// Refer: https://playwright.dev/java/docs/downloads
		
		String downloadPath = System.getProperty("user.dir")+"/DownloadFiles/"+download.suggestedFilename();
		
		System.out.println("Download path would be "+downloadPath);
		
		// Wait for the download process to complete and save the downloaded file somewhere
		download.saveAs(Paths.get(downloadPath));
		
		// Assertion 1 check the file extension
		if(downloadPath.endsWith(".txt")) {
			System.out.println("File Extension verified");
		}
		else {
			System.out.println("File Extension verification failed");
			browser.close();
			return;
		}
		
		// Assertion 2 check the file size
		if(Files.size(Paths.get(downloadPath))>0) {   // Can use Path.of() as well
			System.out.println("File size verified");
		}
		else {
			System.out.println("File size not verified");
			browser.close();
			return;
		}
		
		//Assertion 3 check the file content
		String dataFromFile = Files.readString(Paths.get(downloadPath));
		
		if(dataFromFile.contains("test")) {
			System.out.println("File content verified");
		}
		else {
			System.out.println("File content not verified");
			browser.close();
			return;
		}
		
		browser.close();	
	}

}
