package com.mcp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends BasePage{

    @FindBy(id = "pagetitle")
    public WebElement subtitle;

    @FindBy(xpath = "//button[.='Add']")
    public WebElement addBtn;

}
