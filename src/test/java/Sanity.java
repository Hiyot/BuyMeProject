import org.openqa.selenium.WebDriver;

public class Sanity {
    public static WebDriver driver;

    public void introTest(){
        IntroScreen introScreen = new IntroScreen(driver);
        introScreen.PressLogin();
    }
}
