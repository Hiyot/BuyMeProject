import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IntroScreen {

    private WebDriver driver;

    public IntroScreen(WebDriver driver) {
        this.driver = driver;

    }

    public void PressLogin(){
        driver.findElement(By.cssSelector("div[span = כניסה / הרשמה]")).click();
        driver.findElement(By.className("text-link theme")).click();

    }
    public void nameAndEmail(){
        driver.findElement(By.id("ember1863")).sendKeys("היות");
        driver.findElement(By.id("ember1870")).sendKeys("hiyoytest95@walla.com");
    }
    public void password(){
        driver.findElement(By.id("valPass")).sendKeys("MyPassword123");
        driver.findElement(By.id("ember1884")).sendKeys("MyPassword123");

    }

}
