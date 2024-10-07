package uz.click.appiumautotests.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    //@Value("${appium.url}")
//    @Value("http://127.0.0.1:4723/wd/hub")
//    private String appiumUrl;

    //@Value("${appium.platformName}")
//    @Value("${appium.platformName}")
//    private String platformName;

//    @Value("${appium.deviceName}")
//    private String deviceName;

//    @Value("${appium.app}")
//    private String appPath;

//    @Value("${appium.os_version}")
//    private String osVersion;

    // Getters
    public String getAppiumUrl() {
        // return appiumUrl;
        return "http://127.0.0.1:4723/wd/hub";
    }

    public String getPlatformName() {
        //return platformName;
        return "Android";
    }

    public String getDeviceName() {
       // return deviceName;
        return "Vivo Y22";
    }

    public String getOSVersion() {
        //return osVersion;
        return "12";
    }

    public String getAppPath() {
        return "appPath";
    }
}
