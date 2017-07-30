import org.testng.annotations.Test;

/**
 * Created by user1 on 7/23/2017.
 */
public class GroupModificationTests extends TestBase {
    @Test

    public void groupCreationTests() {
        goToGroupsPage();
        selectFirstGroup();
        initGroupModification();
        fillGroupForm();
        submitGroupModification();
        returnToGroupPage();
    }


}
