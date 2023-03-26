package step_definitions;
import io.cucumber.java.Before;

import static net.serenitybdd.core.Serenity.getDriver;

public class Hooks {

    @Before
    public void openBrowser(){
        getDriver().close();
        getDriver().quit();
    }
}
