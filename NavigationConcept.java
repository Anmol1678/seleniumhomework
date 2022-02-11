import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {


    public static void main (String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","C:\\Users\\Surface Laptop\\IdeaProjects\\selenium.new\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Thread.sleep(4000);

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //Navigate to webpage
        driver.get("https://www.nopcommerce.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.get("https://www.gumtree.com/");
        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println(driver.getTitle());

        driver.navigate().forward();
        System.out.println(driver.getTitle());


        driver.quit();








    }
 }
