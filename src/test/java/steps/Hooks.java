package steps;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {
    @Before
    public void setUp() {
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = String.valueOf(true);
    }
    @After
    public void tearDown(io.cucumber.java.Scenario scenario) {
//        if (scenario.isFailed()) {
//            File screenshot = com.codeborne.selenide.Screenshots.takeScreenShotAsFile();
//            try {
//                java.nio.file.Files.copy(screenshot.toPath(), java.nio.file.Paths.get("screenshots/" + scenario.getName() + ".png"));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        closeWebDriver();
    }
}