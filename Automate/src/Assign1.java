import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

   public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kravikumar\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://demoqa.com/automation-practice-form");
    }



}