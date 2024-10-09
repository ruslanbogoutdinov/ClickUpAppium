package uz.click.appiumautotests.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;

import uz.click.appiumautotests.ClickUpAppiumAutotestsApplication;
import uz.click.appiumautotests.drivers.AndroidDriverManager;
import uz.click.appiumautotests.pages.LoginPage;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ClickUpAppiumAutotestsApplication.class)
public class LoginTest {
    @Autowired
    private AndroidDriverManager androidDriverManager;

    @Autowired
    private LoginPage loginPage;

    @Test
    @DisplayName("Успешная авторизация")
    public void testLogin() {
        step("Выбор языка на начальном экране", () -> {
            loginPage.chooseLanguage();
        });
        step("Ввод номера телефона", () -> {
            loginPage.setPhoneNumber();
        });
        step("Ввод смс кода", () -> {
            loginPage.setSmsCode();
        });
        step("Ввод Пин кода", () -> {
            loginPage.setPinCode("15963");
        });
        sleep(5000);
    }
}
