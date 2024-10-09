package uz.click.appiumautotests.config;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;

import org.aeonbits.owner.ConfigFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;

@Configuration
public class AppiumConfig {
    private final ApplicationConfig applicationConfig;

    public AppiumConfig() {
        this.applicationConfig = ConfigFactory.create(ApplicationConfig.class, System.getProperties());
    }

    @Bean
    public AndroidDriver androidDriver() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
            .setAutomationName(ANDROID_UIAUTOMATOR2)
            .setPlatformName(applicationConfig.getPlatformName())
            .setDeviceName(applicationConfig.getDeviceName())
            .setPlatformVersion(applicationConfig.getOSVersion())
            .setApp(applicationConfig.getAppPath())
            .setAppPackage(applicationConfig.getAppPackage())
            .setAppActivity(applicationConfig.getAppActivity());

        AndroidDriver driver = new AndroidDriver(new URL(appConfig.getAppiumUrl()), options);
        WebDriverRunner.setWebDriver(driver);
        
        return driver;

        // return new AndroidDriver(new URL(applicationConfig.getAppiumUrl()), options);
    }
    
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
