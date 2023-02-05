import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class IntroScreen {

    private WebDriver driver;

    public IntroScreen(WebDriver driver) {
        this.driver = driver;

    }

    public void PressLogin(){
        driver.findElement(By.xpath("/html/body/div[5]/div/header/div[1]/div/ul[1]/li[3]/a/span")).click();
        driver.findElement(By.className("text-link theme")).click();

    }
    public void nameAndEmail(){
        driver.findElement(By.id("ember1863")).sendKeys("היות");
        driver.findElement(By.id("ember1870")).sendKeys("hiyoytest95@walla.com");

        String expectedName = "היות";
        String actualName = driver.findElement(By.id("ember1863")).getText();
        Assert.assertEquals(actualName ,expectedName );


        String expectedEmail = "hiyoytest95@walla.com";
        String actualEmail = driver.findElement(By.id("ember1870")).getText();
        Assert.assertEquals(actualEmail , expectedEmail);

    }
    public void password(){
        driver.findElement(By.id("valPass")).sendKeys("MyPassword123");
        driver.findElement(By.id("ember1884")).sendKeys("MyPassword123");
        String expectedPassword = "MyPassWord123";
        String actualPassword = driver.findElement(By.id("valPass")).getText();
        Assert.assertEquals(actualPassword , expectedPassword);
    }

    public void approveCheckBox(){
        driver.findElement(By.className("fill")).click();
        driver.findElement(By.className("label")).click();
    }

}
