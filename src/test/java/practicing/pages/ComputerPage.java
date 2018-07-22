package practicing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ComputerPage {

    @FindBy(id = "name")
    private WebElement computerNameField;

    @FindBy(id = "introduced")
    private WebElement introducedDateField;

    @FindBy(id = "discontinued")
    private WebElement discontinuedDateField;

    @FindBy(id = "company")
    private WebElement companyDropBox;

    @FindBy(xpath = "//*[@id=\"main\"]/form/div/input")
    private WebElement submit;

    @FindBy(xpath = "//*[@id=\"main\"]/form/fieldset/div[1]")
    private WebElement nameIsRequired;

    @FindBy(xpath = "//*[@id=\"main\"]/form/div/a")
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

    public void fieldDiscontinueDate(String discontinueDate) {
        discontinuedDateField.sendKeys(discontinueDate);
    }

    public void selectCompany(String company) {
        Select select=new Select(companyDropBox);
        select.selectByVisibleText(company);
    }

    public boolean showErrorOnRequiredFieldName() {
        return nameIsRequired.getAttribute("class").equals("clearfix error");
    }

    public void clickCancel() {
        cancel.click();
    }
}
