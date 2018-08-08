package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

@Getter
public class SearchPage {
    @FindBy(id = "btnRoundTrip")
    private WebElement btnRoundTrip;

    @FindBy(id = "autocompleteFlightOrigin")
    private WebElement autocompleteFlightOrigin;

    @FindBy(id = "autocomplete-link-item-autocompleteFlightOrigin-1")
    private WebElement autocomplete_01;

    @FindBy(id = "autocompleteFlightDestination")
    private WebElement autocompleteFlightDestination;

    @FindBy(id = "autocomplete-item-autocompleteFlightDestination-1")
    private WebElement autocomplete_02;

    @FindBys({@FindBy(id = "calendarStartDate_group"),@FindBy(className = "form-control")})
    private WebElement calendarStartDate;

    @FindBys({@FindBy(id = "calendarEndDate_group"),@FindBy(className = "form-control")})
    private WebElement calendarEndDate;

    @FindBy(id = "btnSearchTickets")
    private WebElement btnSearchTickets;

    public void selectOrigin(String origem){
        btnRoundTrip.click();
        autocompleteFlightOrigin.sendKeys(origem);
        autocomplete_01.click();
    }

    public void selectDestination(String destination){
        autocompleteFlightDestination.sendKeys(destination);
        autocomplete_02.click();
    }

    public void dateOrigin(String dateOrigin){
        calendarStartDate.click();
        calendarStartDate.clear();
        calendarStartDate.sendKeys(dateOrigin);
    }

    public void dateDestination(String dateDestination){
        calendarEndDate.click();
        calendarEndDate.clear();
        calendarEndDate.sendKeys(dateDestination);
    }
}
