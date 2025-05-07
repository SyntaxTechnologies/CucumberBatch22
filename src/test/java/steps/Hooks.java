package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        //it is my pre condition
        openBrowserAndLaunchApplication();
    }


    @After
    public void end(Scenario scenario){
        //scenario class holds the complete information about the execution
        //it is my post condition
        byte[] pic;

        if(scenario.isFailed()) {
            pic = takeScreenshot("failed/"+scenario.getName());
        }else {
            pic = takeScreenshot("passed/"+scenario.getName());
        }

        //to attach the screenshot in the report
        scenario.attach(pic,"image/png",scenario.getName());
        closeBrowser();
    }

}
