package Assinment08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Ass1 {
    private static WebDriver driver;
    private static WebDriver fireDriver;
    private static WebDriver driver2;
    private static WebDriver driver3;

    @BeforeTest
    public static void openChrom () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dvora.W10N-LNX-DVORAD\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    /*@Test
    public static void openFirefox (){
        System.setProperty("webdriver.firefox.fireDriver", "C:\\Users\\Dvora.W10N-LNX-DVORAD\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        fireDriver = new FirefoxDriver();
        fireDriver.get("https://www.jdn.co.il/");

    }*/


    @Test (priority = 1)
    public static void refreshPage (){
        driver = new ChromeDriver();
        driver.get("https://www.jdn.co.il/");
        String title = "JDN - חדשות המגזר החרדי";
        driver.navigate().refresh();
        String compare = driver.getTitle();
        System.out.println(compare);
        if (compare.equalsIgnoreCase(title)) {
            System.out.println("equal");
        } else {
            System.out.println("different");
        }
        String url = driver.getCurrentUrl();
        String containing = url + compare;
        System.out.println(containing);
        driver.quit();
    }

    @Test (priority = 2)
    public static void googleTranslate (){
        driver2 = new ChromeDriver();
        driver2.get("https://translate.google.com/");
        System.out.println(driver2.findElement(By.className("er8xn")));
        System.out.println(driver2.findElement(By.tagName("textarea")));
        driver2.findElement(By.tagName("textarea")).sendKeys("שלום");
    }

    @Test
    public static void amazon (){
        driver3 = new ChromeDriver();
        driver3.get("https://www.amazon.com/");
        System.out.println(driver3.getTitle());
        WebElement amazonSearch = driver3.findElement(By.id("twotabsearchtextbox"));
        amazonSearch.sendKeys("Leather shoes");
        driver3.findElement(By.id("nav-search-submit-button")).click();
    }

}
