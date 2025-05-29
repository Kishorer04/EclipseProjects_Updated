package quikr;

import org.openqa.selenium.By;

public class PageObject {
  
	By search_box = By.xpath("//input[@id='query']");
	By search_box1= By.xpath("//input[@id='query']");
	By seach_button= By.xpath("//button[@id='submitSearch']");
	By hover = By.xpath("//*[@id='subHeader']/li[3]/a");
	By click_item = By.xpath("//span[text()='DSLR cameras']");
	By click_filter = By.xpath("//a[text()='Price - Low to High']");
	By click_specific = By.xpath("/html/body/div[7]/div[1]/div[2]/div/div[2]/div/div[4]/div[2]/div/div[1]/div[1]/a/div/section[2]/div[2]/ul/li[3]/button");
	By amount= By.xpath("//label[@class='sc-dxhf6u-0 hoLrKb sc-jj9qsf-1 jPDsvr']");
	By ad_id = By.xpath("//span[text()='361863176']");
	By brand = By.xpath("//span[text()='Nikon']");	
}
