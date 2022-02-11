import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsConcept {


    public static void main (String[] args) throws InterruptedException {

        System.out.println("Webdriver.chrome.driver,C:\\Users\\Surface Laptop\\IdeaProjects\\selenium.new\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        //Navigate to webpage

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

         driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.name("Email")).sendKeys("rubina13@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("Altivar71");
        driver.findElement(By.className("buttons")).click();


         driver.quit();



    }
}
