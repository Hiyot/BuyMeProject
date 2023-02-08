import Screens.HomeScreen;
import Screens.InfoScreen;
import Tools.DriverSingleton;
import Screens.IntroScreen;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import java.time.Duration;

import static Tools.Constant.getData;
import static com.aventstack.extentreports.Status.INFO;

public class Sanity {
    private static WebDriver driver;
    private static WebDriverWait wait;
    static ExtentReports extentReports;

   private static ExtentSparkReporter htmlReporter;

   private static ExtentTest test;

    @BeforeClass
    public void beforeAll() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentReports = new ExtentReports();
        htmlReporter = new ExtentSparkReporter("C:\\Users\\netan\\IdeaProjects\\BuyMeProject\\extent.html");
        extentReports.attachReporter(htmlReporter);
        test = extentReports.createTest("BuyMeProject", "BeforeAll Class");
        test.log(INFO, "Will Run First");
        driver.get("https://buyme.co.il/");
        String type = getData("browserType");
        String url = getData("URL");
        driver.get(url);


        @Test
        public void introTest(){
            IntroScreen introScreen = new IntroScreen(driver);
            introScreen.PressLogin();
            introScreen.nameAndEmail();
            introScreen.password();
            test.log(INFO, "Register to BuyMe website ");
        }

        @Test
        public void selectionTest(){

            HomeScreen homeScreen = new HomeScreen(driver);
            homeScreen.selectPrice();
            homeScreen.selectRegion();
            homeScreen.selectCategory();
            homeScreen.findMePresent();
            test.log(INFO, "Filtering user preference");
        }

        @Test
        public void pickBusiness(){
            PickBusiness pickBusiness = new PickBusiness(driver);
            pickBusiness.chooseBusiness();
            pickBusiness.enterPrice();
            pickBusiness.pressClick();
            test.log(INFO, "User choosing a gift to send");
        }
        @AfterClass
        public void informationTest(){
            InfoScreen infoScreen = new InfoScreen(driver);
            infoScreen.clickSomeoneElse();
            infoScreen.receiverName();
            infoScreen.eventReason();
            infoScreen.blessingMessage();
            infoScreen.blessingMessage();
            test.log(INFO, "User will add receiver info and send the gift ");
            extentReports.flush();
            driver.quit();


        }
    }
    }
