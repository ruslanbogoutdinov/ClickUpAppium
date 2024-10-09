package uz.click.appiumautotests.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import lombok.Data;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Data
@Component
public class LoginPage {

    @Autowired
    private AndroidDriver driver;


    private final SelenideElement
            englishBtn = $(By.id("dev.air.com.ssdsoftwaresolutions.clickuz:id/btnEnglish")),
            numberField = $(By.id("dev.air.com.ssdsoftwaresolutions.clickuz:id/etMobileNumber")),
            nextBtn = $(By.id("dev.air.com.ssdsoftwaresolutions.clickuz:id/btnNext")),
            codeField = $(By.id("dev.air.com.ssdsoftwaresolutions.clickuz:id/etCode"));

    public void chooseLanguage() {
        englishBtn.click();
    }
    public void setPhoneNumber() {
        numberField.sendKeys("977192070");
    }
    public void setSmsCode() {
        codeField.sendKeys("123456");
    }
    public void setPinCode(String numbers) {
        for (int i = 0; i < numbers.length(); i++) {
            char digit = numbers.charAt(i);
            String xpath = String.format("//*[@text='%s']", digit);
            $x(xpath).click();
        }
    }
}
