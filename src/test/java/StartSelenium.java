import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {

    WebDriver wd;


    @BeforeMethod
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
    }

    @Test
    public  void testName(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println("Test started");
        System.out.println(elements.size());
        WebElement element1 = wd.findElement(By.linkText("HOME"));
        WebElement element2 = wd.findElement(By.partialLinkText("HO"));
        WebElement element3 = wd.findElement(By.id("root"));
        WebElement element4 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement element5 = wd.findElement(By.cssSelector("#root"));
        //WebElement element6 = wd.findElement(By.cssSelector("[href='/login']#root.navbar-"));

        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[href^='/log']"));
        wd.findElement(By.cssSelector("[href*='g']"));
        wd.findElement(By.cssSelector("[href$='in']"));

        List<WebElement> buttons = wd.findElements(By.cssSelector("button"));

        // wd.findElement(By.cssSelector());
        //wd.findElement(By.cssSelector());
       // wd.findElement(By.cssSelector());
       // wd.findElement(By.cssSelector());

    }

    @Test
    public void testPassword(){

    }

    @AfterMethod
    public void postCondition(){
       // wd.close();
        wd.quit();
    }
}
