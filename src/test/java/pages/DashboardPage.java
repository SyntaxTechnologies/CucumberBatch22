package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement addEmployeeOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

}
