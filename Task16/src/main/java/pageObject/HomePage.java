package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(css = "input.search-form__input")
    private WebElement searchInput;
    @FindBy(css = "button.search-form__submit")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage openPage() {
        driver.get("https://rozetka.com.ua/");
        return this;
    }

    public ProductResultPage searchProduct(String searchText){
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(searchText);
        searchButton.click();
        return new ProductResultPage(driver);
    }
}
