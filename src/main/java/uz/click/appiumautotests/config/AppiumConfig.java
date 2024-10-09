package uz.click.appiumautotests.config;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;
import static io.appium.java_client.remote.MobilePlatform.ANDROID;

@Configuration
public class AppiumConfig {

    private final ApplicationConfig appConfig;

    public AppiumConfig(ApplicationConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Bean
    public AndroidDriver androidDriver() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                //.setPlatformName(appConfig.getPlatformName())
                .setDeviceName("Vivo")
                .setApp("/Users/doni/Desktop/QAclick/app-staging-debug.apk")
                .setAutomationName(ANDROID_UIAUTOMATOR2)
                .setPlatformName("Android")
                .setPlatformVersion("10")
                .setAppPackage("dev.air.com.ssdsoftwaresolutions.clickuz")
                .setAppActivity("uz.click.evo.ui.mainrouter.MainRouterActivity");


//        return new AndroidDriver(new URL(appConfig.getAppiumUrl()), options);
        AndroidDriver driver = new AndroidDriver(new URL(appConfig.getAppiumUrl()), options);
        WebDriverRunner.setWebDriver(driver);
        return driver;
    }
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
