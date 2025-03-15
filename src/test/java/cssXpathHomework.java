import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
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
        //$()
        $("#userNumber").setValue("79111111111");
        $x("//label[@for='hobbies-checkbox-1']").click();
        $x("//label[@for='hobbies-checkbox-2']").click();
        $x("//label[@for='hobbies-checkbox-3']").click();
        //$x("//label[@for='form-control-file']").click();
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Merrut")).click();
        $("#currentAddress").setValue("Kaliningrad");
    }
}

