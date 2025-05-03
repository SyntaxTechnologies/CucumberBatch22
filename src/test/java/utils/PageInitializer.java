package utils;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SearchEmployeePage;

public class PageInitializer {

    public static LoginPage loginPage;
    public static AddEmployeePage addEmployeePage;
    public static DashboardPage dashboardPage;
    public static SearchEmployeePage searchEmployeePage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();
        addEmployeePage = new AddEmployeePage();
        dashboardPage = new DashboardPage();
        searchEmployeePage = new SearchEmployeePage();
    }


}
