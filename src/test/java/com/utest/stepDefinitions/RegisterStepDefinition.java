package com.utest.stepDefinitions;


import com.utest.task.DataRegisterTask;
import com.utest.task.DeviceTask;
import com.utest.task.FillAddressTask;
import com.utest.task.FillConfirmTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegisterStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("the user is in the page utest.com")
    public void the_user_is_in_the_page_utest_com() {
        theActorCalled("User").wasAbleTo(Open.url("https://utest.com"));
    }

    @When("The user inputs data for register")
    public void the_user_inputs_data_for_register() {
        OnStage.theActorInTheSpotlight().attemptsTo(DataRegisterTask.tryRegister());
    }
    @When("The user inputs data of address")
    public void the_user_inputs_data_of_address() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillAddressTask.fillAddress());
    }
    @When("The user inputs data of device")
    public void the_user_inputs_data_of_device() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeviceTask.chooseDevice());
    }
    @Then("User confirm your register")
    public void user_confirm_your_register() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillConfirmTask.completeRegister());
    }

}