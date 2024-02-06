package com.utest.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.utest.ui.UtestUi.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class DeviceTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INP_MOBILE),
                WaitUntil.the(INP_MOBILE2, isClickable()),
                Click.on(INP_MOBILE2),
                Click.on(INP_MODEL),
                Click.on(INP_MODEL2),
                Click.on(INP_SYSTEM),
                Click.on(INP_SYSTEM2),
                Click.on(BTN_LASTSTEP)
        );

    }

    public static Performable chooseDevice() {

        return Instrumented.instanceOf(DeviceTask.class).withProperties();
    }
}
