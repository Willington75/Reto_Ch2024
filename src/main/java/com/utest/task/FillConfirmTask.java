package com.utest.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.utest.ui.UtestUi.*;
import static com.utest.utils.User.*;


public class FillConfirmTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(USER_PASSWORD.getValue()).into(INP_PASSW),
                Enter.theValue(CONFIRM_PASSWORD.getValue()).into(CONFIRM_PASSW),
                Click.on(BTN_ACCEPPRIVACY),
                Click.on(BTN_ACCEPTERM),
                Click.on(BTN_COMPLETE)
        );


    }

    public static Performable completeRegister() {

        return Instrumented.instanceOf(FillConfirmTask.class).withProperties();
    }
}