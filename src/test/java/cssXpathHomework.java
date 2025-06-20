import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class cssXpathHomework {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen=true;
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFields() {
        open("/automation-practice-form");
        Selenide.executeJavaScript("$('#Advertisement-Section').remove()");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");
        Selenide.executeJavaScript("$('#Ad.Plus-970x250-1').remove()");


        $(".practice-form-wrapper").shouldHave(text("Practice Form"));



        $("#firstName").setValue("Name");
        $("#lastName").setValue("Surname");
        $("#userEmail").setValue("Email@mail.ru");
        //$("label[@for='gender-radio-2']").click();
        $("#gender-radio-2").parent().click();
        $("#userNumber").setValue("79111111111");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1999");
        $(".react-datepicker__month-select").selectOption("July");
       // $(".react-datepicker__month-select").selectOptionByValue("6");
        $(".react-datepicker__day--029:not(.react-datepicker__day--outside-month)").click();
//        $x("//*[@class='react-datepicker__day--029'][not(contains(@class, 'react-datepicker__day--outside-month'))]").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
 //       $x("//label[@for='hobbies-checkbox-1']").click();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $x("//label[@for='hobbies-checkbox-2']").click();
        $x("//label[@for='hobbies-checkbox-3']").click();
        // $("#uploadPicture").uploadFile(new File("src/test/resources/shutterstock_549067045.jpg"));
 $("#uploadPicture").uploadFromClasspath("shutterstock_549067045.jpg");
 $("#currentAddress").setValue("Kaliningrad");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Panipat")).click();
 //       $(byText("Panipat")).click();

        $("#submit").click();
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Name"), text("Surname"));
    }
}




