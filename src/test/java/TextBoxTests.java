import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFields() {
        open("/text-box");
        $("#userName").setValue("User");
        $("#userEmail").setValue("User@mail.ru");
        $("#currentAddress").setValue("Калининград");
        $("#permanentAddress").setValue("Москва");
        $("#submit").click();
        $("#output").shouldHave(text("User"),text("User@mail.ru"),text("Калининград"),text("Москва"));
    }
}
