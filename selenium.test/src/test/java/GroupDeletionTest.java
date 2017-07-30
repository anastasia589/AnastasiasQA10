import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupDeletionTest extends TestBase {


    @Test
    public void groupDeletionTest() {

        goToGroupsPage();
        selectGroup();
        deleteGroup();
        returnToGroupsPage();
    }

}
