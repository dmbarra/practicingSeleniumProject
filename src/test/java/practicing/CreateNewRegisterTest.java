package practicing;

import org.junit.Test;
import practicing.config.BaseSetupTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateNewRegisterTest extends BaseSetupTest {

    @Test
    public void createNewRegister(){
        searchPage.openNewRegisterPager();
        computerPage.fieldComputerName("Daniel's Computer");
        computerPage.fieldIntroducedDate("1981-09-25");
        computerPage.fieldDiscontinueDate("2078-05-23");
        computerPage.selectCompany("RCA");
        computerPage.clickSubmit();
        assertThat(searchPage.sucessMessagePresent()).isEqualTo("Done! Computer Daniel's Computer has been created");
    }

    @Test
    public void validRequiredFieldToCreateNewRegister(){
        searchPage.openNewRegisterPager();
        computerPage.fieldComputerName("");
        computerPage.clickSubmit();
        assertThat(computerPage.showErrorOnRequiredFieldName()).isTrue();
    }

    @Test
    public void cancelCreationOfNewRegister(){
        searchPage.openNewRegisterPager();
        computerPage.fieldComputerName("Daniel's Computer");
        computerPage.fieldIntroducedDate("1981-09-25");
        computerPage.fieldDiscontinueDate("2078-05-23");
        computerPage.selectCompany("RCA");
        computerPage.clickCancel();
        assertThat(searchPage.sucessMessagePresent()).isNotEqualTo("Done! Computer Daniel's Computer has been created");
    }
}
