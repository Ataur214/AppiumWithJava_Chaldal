import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCases extends BaseTests{

    @Test
    public void searchItem(){
        page.clicksearchIcon();
        page.inputSearchText("toothbrush");
        page.clickItemFormList();
        page.clickPlusIcon();
        page.clickShoppingCart();
    }
}
