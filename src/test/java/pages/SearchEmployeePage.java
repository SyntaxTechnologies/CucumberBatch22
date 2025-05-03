package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SearchEmployeePage extends CommonMethods {

    @FindBy(id = "empsearch_id")
    public WebElement empIdSearchField;

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement empNameSearchField;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;

    public SearchEmployeePage(){
        PageFactory.initElements(driver,this);
    }

}
