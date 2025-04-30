package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        //it is my pre condition
        openBrowserAndLaunchApplication();
    }


    @After
    public void end(){
        //it is my post condition
        closeBrowser();
    }

}
