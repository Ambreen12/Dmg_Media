package com.dmg_media.step_definitions;


import com.dmg_media.utils.Driver;
import io.cucumber.java.After;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks {

    @After
     public  void afterTests(Scenario scenario){
        if(scenario.isFailed()){
            byte[]screenShots= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShots,"image/png",scenario.getName());

        }
      //  Driver.closeDriver();

    }
}

