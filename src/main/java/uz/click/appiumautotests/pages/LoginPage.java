package uz.click.appiumautotests.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Data;

import jakarta.annotation.PostConstruct;

@Data
@Component
public class LoginPage {

    @Autowired
    private AndroidDriver driver;

    @FindBy(id = "com.example:id/username")
    private WebElement usernameInput;

    @FindBy(id = "com.example:id/password")
    private WebElement passwordInput;

    @FindBy(id = "com.example:id/login")
    private WebElement loginButton;

    // инициализация переменных после того, как Spring завершит создание бина и инъекцию его зависимостей.
    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
