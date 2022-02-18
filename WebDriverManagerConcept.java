import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class WebDriverManagerConcept {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.get("https://www.nopcommerce.com/");
        Thread.sleep(3000);
        takeScreenshot("Demo_nopcommerce");
        driver.close();

    }


            public static void takeScreenshot(String filename)throws IOException {

                File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(file,new File( "Screenshot 2022-02-18 145202"+filename+".jpg"));
                driver.close();

    }
}


