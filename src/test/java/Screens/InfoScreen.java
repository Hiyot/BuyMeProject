package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class InfoScreen {

    private WebDriver driver;

    public InfoScreen(WebDriver driver){
        this.driver = driver;
    }
    public void clickSomeoneElse(){
        driver.findElement(By.className("text")).click();
    }
    public void receiverName(){
        String expectedName = "לינור";
        driver.findElement(By.id("ember3225")).sendKeys("לינור");
        Assert.assertEquals(driver.findElement(By.id("ember3225")), expectedName);
    }
    public void eventReason(){
        Select event = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div/div[1]/form/div[2]/div[2]/label/div/div[1]/span")));
        event.selectByVisibleText("ולנטיין");
    }
    public void blessingMessage(){
        WebElement blessed = driver.findElement(By.cssSelector("textarea[rows=\"4\"]"));
        blessed.clear();
        blessed.sendKeys("תודה עלייך אוהבת אותך יותר מכל אחד אחר מאי ליטל סיס!");
    }
    public void uploadPictureAndSend(){
        driver.findElement(By.className("media-circle-btn ember-view bm-media-upload")).sendKeys("C:\\Users\\netan\\Desktop\\Thank-You-My-love.jpg");
        driver.findElement(By.id("ember3246")).click();
    }
    public void receiverInfo() {
        driver.findElement(By.className("check")).click();
        driver.findElement(By.className("circle")).click();
        driver.findElement(By.id("sms")).sendKeys("0529090909");
    }
    public void senderInfo(){
       WebElement sender= driver.findElement(By.id("ember3393"));
       sender.clear();
       sender.sendKeys("0529090909");
       driver.findElement(By.id("ember3414")).sendKeys("0523232323");
       driver.findElement(By.id("ember3398")).click();
    }

    public void addingCreditCard(){
        driver.findElement(By.className("label bm-subtitle-1")).click();
        driver.findElement(By.id("Track2CardNo")).sendKeys("1111222233334444");
        Select yesr = new Select(driver.findElement(By.className("chosen-single chosen-default")));
        yesr.selectByIndex(3);
        Select month = new Select(driver.findElement(By.className("chosen-single")));
        month.selectByIndex(2);
        driver.findElement(By.id("cvv")).sendKeys("232");
        driver.findElement(By.name("userData1")).sendKeys("היות איילין");
       WebElement submit = driver.findElement(By.id("personalId"));
       submit.sendKeys("198981981");
       submit.submit();
       driver.findElement(By.className("check")).click();
       driver.findElement(By.className("label"));
       String expected = "היות איילין";
       Assert.assertEquals(driver.findElement(By.name("userData1")), expected);
    }



    }

