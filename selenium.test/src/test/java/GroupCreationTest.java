import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class GroupCreationTest extends TestBase {

    @Test
    public void groupCreationTest() {

//
//        Go to Groups page
        goToGroupsPage();
//        Fill group Form
        fillGroupForm();
//        Submit group Creations
        submitGroupCreations();
//      return to groups page
        returnToGroupsPage();
    }


}
