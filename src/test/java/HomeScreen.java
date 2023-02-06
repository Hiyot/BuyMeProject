import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeScreen {
    private WebDriver driver;

    public  HomeScreen(WebDriver driver){
        this.driver = driver;
    }

    public void selectPrice(){
        Select priceRange = new Select(driver.findElement(By.className("selected-text")));
        priceRange.selectByVisibleText("עד 99 ש\"ח");
    }

    public void selectRegion(){
        Select region = new Select(driver.findElement(By.xpath("/html/body/div[5]/div/header/div[3]/div/div/form/label[2]/div/div[1]/span")));
        region.deselectByIndex(3);
    }
    public void selectCategory(){
        Select category = new Select(driver.findElement(By.cssSelector("span[title=\"קטגוריה\"]")));
        category.selectByVisibleText("גיפט קארד לתרבות ופנאי");
    }

    public void findMePresent(){
     driver.findElement(By.id("ember1295")).click();

    }



}
