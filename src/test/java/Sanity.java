import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Sanity {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void beforeAll(){
        driver= DriverSingleton.getDriverInstance();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://buyme.co.il/");

    }
@Test
    public void introTest(){
        IntroScreen introScreen = new IntroScreen(driver);
        introScreen.PressLogin();
        introScreen.nameAndEmail();
        introScreen.password();
    }

    @Test
    public void selectionTest(){

        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.selectPrice();
        homeScreen.selectRegion();
        homeScreen.selectCategory();
        homeScreen.findMePresent();
    }

    @Test
    public void pickBusiness(){
        PickBusiness pickBusiness = new PickBusiness(driver);
        pickBusiness.chooseBusiness();
        pickBusiness.enterPrice();
        pickBusiness.pressClick();
    }
    @Test
    public void informationTest(){
        IntroScreen infoscreen = new IntroScreen(driver);
        infoscreen.

    }
}
