package Assinment08;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ass2 {
    private static WebDriver edgeDriver;


    @BeforeClass
    public static void openEdge () {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Dvora.W10N-LNX-DVORAD\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        edgeDriver = new EdgeDriver();
    }
    @Test
    public static void ass4 (){
        edgeDriver.get("https://www.kidichic.co.il/");
        WebElement button = (edgeDriver.findElement(By.id("INDmenu-btn")));
        System.out.println(button);
        button.click();
        edgeDriver.quit();
    }

    @Test
    public static void seleniumTest (){
        edgeDriver.get("http://www.seleniumhq.org/");
        edgeDriver.manage().window().maximize();
        WebElement search = edgeDriver.findElement(By.tagName("input"));
        System.out.println(search);
        search.sendKeys("selenium");


    }
}
