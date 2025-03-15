import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class cssXpathHomework {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFields() {
        open("/automation-practice-form");
        $("#firstName").setValue("Name");
        $("#lastName").setValue("Surname");
        $("#userEmail").setValue("Email@mail.ru");
        $x("//label[@for='gender-radio-2']").click();
        $("#userNumber").setValue("79111111111");
        //$("#dateOfBirthInput").click();
        //$x("//#dateOfBirthInput//.react-datepicker__month-select/option[@value='4']").click();
        //$("//#dateOfBirthInput//.react-datepicker__year-select").click();
        //$x("//.react-datepicker__year-select/option[@value='1945']").click();
        //$x("//#dateOfBirthInput//.react-datepicker__day react-datepicker__day--019").click();
        $x("//label[@for='hobbies-checkbox-1']").click();
        $x("//label[@for='hobbies-checkbox-2']").click();
        $x("//label[@for='hobbies-checkbox-3']").click();
        //$x("//label[@for='form-control-file']").uploadFile(new File("src/test/sources/shutterstock_549067045.jpg"));

        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        $("#currentAddress").setValue("Kaliningrad");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Panipat")).click();

        $("#submit").click();
    }
}

