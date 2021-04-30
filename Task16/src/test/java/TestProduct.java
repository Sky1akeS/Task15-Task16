import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.BasePage;
import pageObject.HomePage;

public class TestProduct extends BasePage {

    @DataProvider(name = "productNameInput")
    public static Object[][]  productData() {
        return new Object[][]{
                {"Материнская плата"},
                {"Процессор"},
                {"Оперативная память"}
        };
    }

    @Test(dataProvider = "productNameInput")
    public void test(String data){
        HomePage homePage = new HomePage(driver);
        homePage.openPage()
                .searchProduct(data)
                .checkNameProduct(data);
    }
}
