import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BaseTests {

    private AndroidDriver<AndroidElement> driver;
    protected Pages page;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        File appDir = new File("apps");
        File app = new File(appDir, "com.chaldal.poached.apk");

        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
        caps.setCapability("platformName","Android");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        page = new Pages(driver);
    }

    @AfterTest
    public void tearDown(){
        if(null != driver){
            driver.quit();
        }
    }
}
