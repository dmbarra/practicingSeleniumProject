package practicing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    @FindBy(id = "searchbox")
    private WebElement searchBox;

    @FindBy(id = "searchsubmit")
    private WebElement searchSubmit;

    @FindBy(css = "tbody tr")
    private WebElement tableCategory;


    public void searchForComputer(String computerName){
        searchBox.sendKeys(computerName);
        searchSubmit.click();
    }

    public boolean isElementOnTable(String element) {
        return !tableCategory.findElements(
                By.xpath("//td[contains(text(),'" + element + "')]")).isEmpty();
    }
}
