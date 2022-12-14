import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Webinar1 {
    WebDriver wd;


    @BeforeMethod
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/User/Downloads/index%20(1).html");

    }

    @Test
    public void testIndexFile() {
        wd.findElement(By.tagName("li"));
        WebElement item1 = wd.findElement(By.cssSelector("li"));

        List<WebElement> items = wd.findElements(By.cssSelector("li"));
        WebElement item2 = items.get(1);

        wd.findElement(By.cssSelector("#nav li:nth-child(2)"));
        WebElement item3 = items.get(2);

        int i;
        //wd.findElement(By.cssSelector("#nav li:nth-child(i)"));
        wd.findElement(By.cssSelector("#nav li:last-child"));

        wd.findElement(By.tagName("input"));

        wd.findElement(By.className("btn"));
        wd.findElement(By.cssSelector(".btn"));

        //table row
        wd.findElement(By.cssSelector("table#country-table>tbody>tr"));
        wd.findElement(By.cssSelector("#country-table tr:first-child"));
        wd.findElement(By.cssSelector("#country-table tr:nth-child(2)"));
        wd.findElement(By.cssSelector("#country-table tr:nth-child(3)"));
        wd.findElement(By.cssSelector("#country-table tr:last-child"));

        //table element
        wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:first-child"));


        //Home Work
        WebElement elementItem2 = wd.findElement(By.cssSelector("#nav [href='#item2']"));
        System.out.println(elementItem2.getText());


    }

    @Test
    public void testTable(){
        //List<WebElement> elementsRow = wd.findElements(By.cssSelector("tr"));
        List<WebElement> elementsRow = wd.findElements(By.xpath("//tr"));
        List<WebElement> elementsRow1 = wd.findElements(By.xpath("//tr"));
        System.out.println("++++++++++ "+elementsRow1.size());

        List<WebElement> elementsCol = wd.findElements(By.cssSelector("th"));
        System.out.println("++++++++++ "+elementsCol.size());

        //WebElement elementsCol123 = wd.findElement(By.cssSelector("tr:nth-child(3)"));
        WebElement elementsCol123 = wd.findElement(By.xpath("//tr[last()]"));
        System.out.println(elementsCol123.getText());

    }

    @AfterMethod
    public void afterTest(){
        wd.quit();
    }

}
