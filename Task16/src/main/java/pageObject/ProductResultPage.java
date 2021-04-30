package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductResultPage extends BasePage {

    By searchResults = By.cssSelector(".catalog-grid .goods-tile__title");

    public ProductResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkNameProduct(String data){
        String actualResult = driver.findElements(searchResults).get(0).getText();
        Assert.assertTrue(actualResult.contains(data));
    }
}
