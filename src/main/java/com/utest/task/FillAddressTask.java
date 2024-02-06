package com.utest.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.utest.ui.UtestUi.*;
import static com.utest.utils.User.*;



public class FillAddressTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INP_CODPOSTAL),
                Enter.theValue(COD_POSTAL.getValue()).into(INP_CODPOSTAL),
                Click.on(BTN_NEXTDEVICE)
        );

    }

    public static Performable fillAddress() {

        return Instrumented.instanceOf(FillAddressTask.class).withProperties();
    }
}

