package com.bitrix24.step_definitions;

import com.bitrix24.Utilities.Driver;
import com.bitrix24.pages.ActiveStreamPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class TaskTabStepDefinitions {
    ActiveStreamPage activeStreamPage = new ActiveStreamPage();
    @Then("User click on Task Tab")
    public void user_click_on_task_tab()  {
        activeStreamPage.taskTab.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }




    @Then("User Click on High Priority Checkbox")
    public void user_click_on_high_priority_checkbox() {
       activeStreamPage.highPriorityCheckbox.click();
        Assert.assertTrue(activeStreamPage.highPriorityCheckbox.isSelected());
    }


    @When("User click on Visual Editor")
    public void userClickOnVisualEditor() {
        activeStreamPage.visualEditor.click();
    }

    @Then("The Editor Text-bar displays")
    public void theEditorTextBarDisplays() {
        Assert.assertTrue(activeStreamPage.editorTextbar.isDisplayed());
    }
}
