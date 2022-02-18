import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistraionPage {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","C:\\Users\\Surface Laptop\\IdeaProjects\\selenium.new\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        //Navigate to webpage

        driver.get("https://demo.nopcommerce.com/");


        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.id("gender-female")).click();

        driver.findElement(By.id("FirstName")).sendKeys("rubina");
        driver.findElement(By.id("LastName")).sendKeys("desai");
        driver.findElement(By.id("Email")).sendKeys("pdipak1213@yahoo.com");
        driver.findElement(By.name("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("Altivar71");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Altivar71");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("13");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("February");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1989");
        driver.findElement(By.id("register-button")).click();


        driver.close();




    }
}
