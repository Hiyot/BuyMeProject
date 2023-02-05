import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PickBusiness {

    private WebDriver driver;

    public PickBusiness(WebDriver driver){
        this.driver = driver;
    }
    public void chooseBusiness(){
        driver.findElement(By.className("product-card-bg")).click();
    }
    public void enterPrice(){
       driver.findElement(By.id("ember2332")).sendKeys("200");
    }
    public void pressClick(){
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div/div[2]/div/ul/li/div/div/div[3]/form/div[2]/button/span")).click();
    }
}
