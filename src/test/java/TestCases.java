import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCases extends BaseTests{

    @Test
    public void searchItem(){
        page.clicksearchIcon();
        page.inputSearchText("toothbrush");
        page.clickItemFrommList();
        page.clickPlusIcon();
        page.clickShoppingCart();
        var assertText = page.removeItemFromCart();
        Assert.assertEquals(assertText, "Nothing to see here");
    }
}
