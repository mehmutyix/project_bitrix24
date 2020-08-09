package com.bitrix24.pages;

import com.bitrix24.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStreamPage {
    public ActiveStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskTab;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckbox;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditor;

    @FindBy(xpath = "//div[@style='width: 100%; opacity: inherit;']")
    public WebElement editorTextbar;





}
