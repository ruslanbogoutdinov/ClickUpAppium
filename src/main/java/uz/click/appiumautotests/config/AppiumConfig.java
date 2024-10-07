package uz.click.appiumautotests.config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
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
                .setApp("/Users/ruslan/IdeaProjects/QA_GURU_ADV/clickup-appium-autotests/app-staging-debug.apk")
                .setAutomationName(ANDROID_UIAUTOMATOR2)

                .setPlatformName("Android")
                .setPlatformVersion("10")
                .setAppPackage("dev.air.com.ssdsoftwaresolutions.clickuz")
                .setAppActivity("uz.click.evo.ui.mainrouter.MainRouterActivity");

//        options.setAutomationName(ANDROID_UIAUTOMATOR2)
//                .setPlatformName(ANDROID)
//                .setDeviceName(localMobileConfig.getDeviceName())
//                .setPlatformVersion(localMobileConfig.getOSVersion())
//                .setApp(getAppPath())
//                .setAppPackage("org.wikipedia.alpha")
//                .setAppActivity("org.wikipedia.main.MainActivity");

        return new AndroidDriver(new URL(appConfig.getAppiumUrl()), options);
    }
}
