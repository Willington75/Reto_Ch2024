package com.utest.task;

import com.utest.ui.UtestUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static com.utest.ui.UtestUi.*;
import static com.utest.utils.User.*;


public class DataRegisterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_JOIN),
                Enter.theValue(FIRSTNAME.getValue()).into(INP_FIRSTNAME),
                Enter.theValue(LASTNAME.getValue()).into(INP_LASTNAME),
                Enter.theValue(EMAIL.getValue()).into(INP_EMAIL),
                SelectFromOptions.byValue("number:11").from(UtestUi.DATE_MONTH1),
                SelectFromOptions.byValue("number:26").from(UtestUi.DATE_DAY1),
                SelectFromOptions.byValue("number:1988").from(UtestUi.DATE_YEAR1),
                Click.on(BTN_NEXTLOCATION)
        );
    }

    public static Performable tryRegister() {

        return Instrumented.instanceOf(DataRegisterTask.class).withProperties();
    }
}
