package com.mcp.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private Driver(){}

    private static WebDriver driver;

    public static WebDriver get(){

        if(driver==null){

          String browser = ConfigReader.get("browser");

          switch (browser){
              case "chrome":
                  WebDriverManager.chromedriver().setup();
                  driver=new ChromeDriver();
              break;

              case "firefox":
                  WebDriverManager.chromedriver().setup();
                  driver=new FirefoxDriver();
                  break;

              case "safari":
                  WebDriverManager.chromedriver().setup();
                  driver=new SafariDriver();
                  break;
          }

        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
