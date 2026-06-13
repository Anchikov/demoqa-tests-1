import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class FirstTest {

    @BeforeEach // В JUnit 5 это аналог @BeforeMethod из TestNG
    public void setUp() {
        Configuration.timeout = 10000;
        // Здесь будет настройка Selenide
    }

    @Test
    public void userCanOpenDemoQa() {
        open("https://demoqa.com");
        //$(".main-header").shouldHave(text("Elements"));
        // ... остальные проверки
    }
}