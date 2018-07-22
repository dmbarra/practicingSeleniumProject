package practicing;

import org.testng.annotations.Test;
import practicing.config.BaseSetupTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateNewRegister extends BaseSetupTest {

    @Test
    public void createNewRegister(){
        searchPage.openNewRegisterPager();
        computerPage.fieldComputerName("Daniel's Computer");
        computerPage.fieldIntroducedDate("1981-09-25");
        computerPage.fieldDiscontinueDate("2078-05-23");
        computerPage.selectCompany("RCA");
        computerPage.clickSubmit();
        assertThat(searchPage.isSucessMessagePresent()).isEqualTo("Done! Computer Daniel's Computer has been created");
    }

    @Test
    public void validRequiredFieldToCreateNewRegister(){
        searchPage.openNewRegisterPager();
        computerPage.fieldComputerName("");
        computerPage.clickSubmit();
        assertThat(computerPage.showErrorOnRequiredFieldName()).isTrue();
    }
}
