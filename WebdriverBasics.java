package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebdriverBasics {

    public static void main (String[] args) {

        //Chrome driver

        //System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Surface Laptop\\IdeaProjects\\selenium.new\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();

        //Edge driver

        //System.setProperty("webdriver.edge.driver","C:\\Users\\Surface Laptop\\IdeaProjects\\selenium.new\\edgedriver_win64\\msedgedriver.exe");

         //WebDriver driver = new EdgeDriver();

         //Gecko driver

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Surface Laptop\\IdeaProjects\\selenium.new\\geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

         driver.quit();






        
    }
        }






