import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTicketService {

    WebDriver wd;

    @BeforeMethod
    public void startTicketServiceLogin(){
        wd = new ChromeDriver();
        wd.navigate().to("https://ticket-service-69443.firebaseapp.com/login");

    }

    @Test
    public void testTicketServiceLogin(){
        WebElement elementFieldEmail = wd.findElement(By.cssSelector("input[placeholder='Email']"));
        System.out.println(elementFieldEmail.getTagName());

        System.out.println(elementFieldEmail.getAttribute("class"));
        System.out.println(elementFieldEmail.getLocation());
        System.out.println(elementFieldEmail.isDisplayed());
        System.out.println(elementFieldEmail.isEnabled());
        System.out.println(elementFieldEmail.isSelected());
        System.out.println("===================================");
        wd.findElement(By.cssSelector("input[placeholder='Email']"));

        //WebElement elementButtonLogin = wd.findElement(By.cssSelector("button[class='form-btn w-100'][type='submit']"));
        WebElement elementButtonLogin = wd.findElement(By.xpath("//button[@class='form-btn w-100'and @type='submit']"));
        System.out.println(elementButtonLogin.getText());
        Assert.assertEquals(elementButtonLogin.getText(),"Login");

        //WebElement elementButtonRegister = wd.findElement(By.cssSelector("div[class='col-12'] button[class='form-btn mb-4 w-100']"));
        WebElement elementButtonRegister = wd.findElement(By.xpath("//div[@class='col-12']//button[@class='form-btn mb-4 w-100']"));
        System.out.println(elementButtonRegister.getText());
        Assert.assertEquals("Register",elementButtonRegister.getText());

        //WebElement elementButtonLoginWCode = wd.findElement(By.cssSelector("div[class='col-12'] button[class='form-btn w-100']"));

        WebElement elementButtonLoginWCode = wd.findElement(By.xpath("//div[@class='col-12']/button"));
        System.out.println(elementButtonLoginWCode.getText());
        Assert.assertTrue(elementButtonLoginWCode.getText().equals("Login with invitation code"));

        WebElement elementButtonLoginWCode1 = wd.findElement(By.xpath("//div[@class='col-12']/button"));
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }


}
