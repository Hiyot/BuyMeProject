import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Sanity {
    public static WebDriver driver;

    @BeforeClass
    public void beforeAll(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://buyme.co.il/");
        DriverSingleton.getDriverInstance();


    }
@Test
    public void introTest(){
        IntroScreen introScreen = new IntroScreen(driver);
        introScreen.PressLogin();
        introScreen.nameAndEmail();
        introScreen.password();



    }
}
