package practicing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage {

    @FindBy(id = "name")
    private WebElement computerNameField;

    @FindBy(id = "introduced")
    private WebElement introducedDateField;

    @FindBy(id = "discontinued")
    private WebElement discontinuedDateField;

    @FindBy(id = "company")
    private WebElement companyCheckBox;

    @FindBy(xpath = "//*[@id=\"main\"]/form/div/input")
    private WebElement submit;

    //TODO discovery xpath
    @FindBy(xpath = "")
    private WebElement cancel;

    public void fieldComputerName(String computerName) {
        computerNameField.sendKeys(computerName);
    }

    public void fieldIntroducedDate(String introducedDate) {
        introducedDateField.sendKeys(introducedDate);
    }

    public void clickSubmit() {
        submit.click();
    }
}
