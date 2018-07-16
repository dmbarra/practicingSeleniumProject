package practicing;

import org.testng.annotations.Test;
import practicing.config.BaseSetupTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class searchComputerTest extends BaseSetupTest {

    @Test
    public void searchForAComputer(){
        searchPage.searchForComputer("ACE");
        assertThat(searchPage.isElementOnTable("ACE")).isTrue();
    }
}
