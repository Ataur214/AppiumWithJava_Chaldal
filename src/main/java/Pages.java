import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Pages {

    private AndroidDriver<AndroidElement> driver;

    public Pages(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
    }
    //WebDriverWait wait = new WebDriverWait(driver, 10);

    public void clicksearchIcon(){
        driver.findElements(By.className("android.widget.TextView")).get(2).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void inputSearchText(String text){
        driver.findElement(By.className("android.widget.EditText")).sendKeys(text);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickItemFormList(){
        List<AndroidElement> itemList = driver.findElements(By.className("android.widget.ImageView"));
        //wait.until(ExpectedConditions.visibilityOf(itemList.get(0)));
        itemList.get(0).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickPlusIcon(){
        for(int i=0;i<=2;i++){
            List<AndroidElement> plusIcon =driver.findElements(By.cssSelector("android.widget.ScrollView android.view.ViewGroup"));
            //wait.until(ExpectedConditions.visibilityOf(plusIcon.get(0)));
            plusIcon.get(0).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public void clickShoppingCart(){
        List<AndroidElement> fycart = driver.findElements(By.cssSelector("android.view.ViewGroup android.widget.TextView"));
        //wait.until(ExpectedConditions.visibilityOf(fycart.get(0)));
        fycart.get(0).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
