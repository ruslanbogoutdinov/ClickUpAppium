package uz.click.appiumautotests.config;

import org.aeonbits.owner.Config;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface ApplicationConfig extends Config {
    @Key("appium_url")
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    String getAppiumUrl();

    @Key("platform_name")
    @DefaultValue("Android")
    String getPlatformName();

    @Key("device_name")
    @DefaultValue("Android Test Device")
    String getDeviceName();

    @Key("os_version")
    @DefaultValue("10")
    String getOSVersion();

    @Key("app_path")
    @DefaultValue("/Users/ruslan/IdeaProjects/Click/clickup-appium-autotests/app-staging-debug.apk")
    String getAppPath();

    @Key("app_package")
    @DefaultValue("dev.air.com.ssdsoftwaresolutions.clickuz")
    String getAppPackage();

    @Key("app_activity")
    @DefaultValue("uz.click.evo.ui.mainrouter.MainRouterActivity")
    String getAppActivity();
}
