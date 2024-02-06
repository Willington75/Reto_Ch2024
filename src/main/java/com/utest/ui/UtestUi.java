package com.utest.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestUi {

    public static final Target BTN_JOIN = Target.the("Button Join").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INP_FIRSTNAME = Target.the("Input First Name").located(By.id("firstName"));
    public static final Target INP_LASTNAME = Target.the("Input Last Name").located(By.id("lastName"));
    public static final Target INP_EMAIL = Target.the("Input Email ").located(By.id("email"));
    public static final Target DATE_MONTH1 = Target.the("Input Month").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target DATE_DAY1 = Target.the("Input Day").located(By.xpath("//select[@id='birthDay']"));
    public static final Target DATE_YEAR1 = Target.the("Input Year").located(By.xpath("//select[@id='birthYear']"));
    public static final Target BTN_NEXTLOCATION = Target.the("Next Location").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INP_CODPOSTAL = Target.the("Input CodePostal").located(By.xpath("//input[@name='zip']"));
    public static final Target BTN_NEXTDEVICE = Target.the("Next Device").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INP_MOBILE = Target.the("Choose Mobile").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[4]"));
    public static final Target INP_MOBILE2 = Target.the("Choose Mobile").located(By.xpath("//div[contains(text(), 'Apple')]"));
    public static final Target INP_MODEL = Target.the("Choose Model").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[5]"));
    public static final Target INP_MODEL2 = Target.the("Choose Mobile").located(By.xpath("//*[contains(text(),'iPhone 4')]"));
    public static final Target INP_SYSTEM = Target.the("Choose System").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[6]"));
    public static final Target INP_SYSTEM2 = Target.the("Choose Mobile").located(By.xpath("//*[contains(text(),'iOS 11.1.1')]"));
    public static final Target BTN_LASTSTEP = Target.the("Choose Pass").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INP_PASSW = Target.the("Input Password").located(By.id("password"));
    public static final Target CONFIRM_PASSW = Target.the("Confirm Password").located(By.id("confirmPassword"));
    public static final Target BTN_ACCEPTERM = Target.the("Button Terminos").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target BTN_ACCEPPRIVACY = Target.the("Button Prvate").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[2]"));
    public static final Target BTN_COMPLETE = Target.the("Button Complete").located(By.id("laddaBtn"));
}