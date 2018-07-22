package practicing;

import org.testng.annotations.Test;
import practicing.config.BaseSetupTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DeleteComputerTest extends BaseSetupTest {

    @Test
    public void deleteAComputer(){
        createNewRegister();
        searchPage.searchForComputer("Daniel's Computer");
        searchPage.openFirstResultOnTable();
        computerPage.clickDelete();
        assertThat(searchPage.sucessMessagePresent()).isEqualTo("Done! Computer has been deleted");
    }

    public void createNewRegister(){
        searchPage.openNewRegisterPager();
        computerPage.fieldComputerName("Daniel's Computer");
        computerPage.fieldIntroducedDate("1981-09-25");
        computerPage.fieldDiscontinueDate("2078-05-23");
        computerPage.selectCompany("RCA");
        computerPage.clickSubmit();
    }
}
