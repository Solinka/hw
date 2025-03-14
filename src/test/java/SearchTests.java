import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void fillFields() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("User");
        $("#userEmail").setValue("User@mail.ru");
        $("#currentAddress").setValue("Калининград");
        $("#permanentAddress").setValue("Москва");
        $("#submit").click();
        $("#output").shouldHave(text("User"),text("User@mail.ru"),text("Калининград"),text("Москва"));
    }
}
