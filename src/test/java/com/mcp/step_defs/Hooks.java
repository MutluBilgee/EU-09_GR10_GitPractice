package com.mcp.step_defs;

import com.mcp.utilities.ConfigReader;
import com.mcp.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){

        Driver.get().navigate().to(ConfigReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();

    }

}
