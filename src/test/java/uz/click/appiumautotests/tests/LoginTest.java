package uz.click.appiumautotests.tests;

import uz.click.appiumautotests.ClickupAppiumAutotestsApplication;
import uz.click.appiumautotests.drivers.AndroidDriverManager;
import uz.click.appiumautotests.pages.LoginPage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// подключение Spring Framework в тесты
@ExtendWith(SpringExtension.class)
// аннотация @SpringBootTest используется в тестах на базе Spring Boot для указания конфигурации приложения,
// которое будет загружаться в тестах. Она позволяет тестам автоматически поднимать контекст Spring,
// что делает возможным тестирование компонентов приложения в среде, максимально приближенной к реальной.
@SpringBootTest(classes = ClickupAppiumAutotestsApplication.class)
public class LoginTest {

    @Autowired
    private AndroidDriverManager androidDriverManager;

    @Autowired
    private LoginPage loginPage;

    @Test
    public void testLogin1() {
        loginPage.login("testUser", "testPassword");
    }

}
