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

    @FindBy(id = "add")
    private WebElement addNewComputer;

    @FindBy(xpath = "//*[@id=\"main\"]/h1")
    private WebElement titleLabel;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]")
    private WebElement divMessageAlert;

    public void searchForComputer(String computerName){
        searchBox.sendKeys(computerName);
        searchSubmit.click();
    }

    public boolean isElementsOnTable() {
        return !tableCategory.findElements(
                By.xpath("//table/tbody/tr/td/a")).isEmpty();
    }

    public void openNewRegisterPager(){
        addNewComputer.click();
    }

    public String sucessMessagePresent(){
        return divMessageAlert.getText();
    }

    public int howManyElementsOnTable() {
         return tableCategory.findElements(
                By.xpath("//table/tbody/tr/td/a")).size();

    }

    public String getTitleText(){
        return titleLabel.getText();
    }

    public void openFirstResultOnTable() {
        tableCategory.findElements(By.xpath("//table/tbody/tr/td/a")).get(0).click();
    }
}
