import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
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
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickItemFrommList(){
        List<AndroidElement> itemList = driver.findElements(By.className("android.widget.ImageView"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        itemList.get(2).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickPlusIcon(){
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            List<AndroidElement> plusIcon =driver.findElements(By.className("android.widget.ScrollView"));
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            plusIcon.get(0).click();
    }

    public void clickShoppingCart(){
        List<AndroidElement> fycart = driver.findElements(By.cssSelector("android.view.ViewGroup android.widget.TextView"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fycart.get(0).click();
    }

    public String removeItemFromCart(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<AndroidElement> plusIcon =driver.findElements(By.className("android.widget.ScrollView"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        plusIcon.get(0).click();
        WebElement text =driver.findElement(By.xpath("//android.widget.TextView[@text='Nothing to see here']"));
        return text.getText();
    }
}
