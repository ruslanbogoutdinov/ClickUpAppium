package uz.click.appiumautotests.drivers;

import io.appium.java_client.android.AndroidDriver;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class AndroidDriverManager {

    private final AndroidDriver driver;

    @Autowired
    public AndroidDriverManager(AndroidDriver driver) {
        this.driver = driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
