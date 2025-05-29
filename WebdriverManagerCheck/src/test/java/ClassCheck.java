import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassCheck {

	
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		//driver.get(null);
//		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//	
//		
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
		
		
		String str="Kishore";
		str.length();
		int[] arr =new int[5];
		int len=arr.length;
		
		System.out.println("string "+str);
		char[] a=str.toCharArray();
		System.out.println("array "+String.valueOf(a));
		System.out.println(a.getClass().getSimpleName());
//		import org.openqa.selenium.chrome.ChromeOptions;
//		ChromeOptions op= new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
//		WebElement a =driver.findElement(By.xpath("q"));
//		File f= a.getScreenshotAs(OutputType.FILE);
//		
		int i = 123;
		char dg= 'c';
		Integer.parseInt(str);

		
		
		
	}

}
