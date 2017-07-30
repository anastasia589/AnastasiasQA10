import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{

    @Test
    public void groupCreationTests() {
        goToGroupsPage();
        initGroupCreation();
        fillGroupForm();
        submitGroupCreation();
        returnToGroupPage();
    }


}
