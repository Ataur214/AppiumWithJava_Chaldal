import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class Base {

    AndroidDriver<AndroidElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        File appDir = new File("apps");
        File app = new File(appDir, "com.chaldal.poached.apk");


        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

    }

    @Test
    public void Test(){
        System.out.println("I am run");
    }

    @AfterTest
    public void tearDown(){
        if(null != driver){
            driver.quit();
        }
    }
}
