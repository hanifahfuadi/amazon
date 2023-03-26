package step_definitions.Amazon;

import io.cucumber.java.en.Given;
import amazon.Page.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class AmazonStepDefs {
    @Given("Open WebPage")
    public void userOpen() throws InterruptedException {
        getDriver().get(LoginPage.OPEN_URL);
    }

    @Then("Navigate the site")
    public void navigateTheSite() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.BURGER_BUTTOM));
        getDriver().findElement(LoginPage.BURGER_BUTTOM).click();
    }

    @Then("Select Electronics")
    public void selectElectronics() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.ELECTRONICS));
        getDriver().findElement(LoginPage.ELECTRONICS).click();
    }

    @Then("Select Television & Video")
    public void selectTelevisionVideo() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.TELEVISIONS_AND_VIDEO));
        getDriver().findElement(LoginPage.TELEVISIONS_AND_VIDEO).click();
    }

    @Then("Select the Televisions")
    public void selectTheTelevisions() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.TELEVISIONS));
        getDriver().findElement(LoginPage.TELEVISIONS).click();
    }

    @Then("Select {int} inches & under")
    public void selectInchesUnder(int arg0) throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.THREETWO_INCH_UNDER));
        getDriver().findElement(LoginPage.THREETWO_INCH_UNDER).click();
    }

    @Then("Sort by")
    public void sortBy() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.SORT_BY));
        getDriver().findElement(LoginPage.SORT_BY).click();
    }

    @Then("Sort by high to low")
    public void sortByHighToLow() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.HIGH_TO_LOW));
        getDriver().findElement(LoginPage.HIGH_TO_LOW).click();
    }

    @Then("Search LG LED TV")
    public void searchLGLEDTV() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.IN2017));
        getDriver().findElement(LoginPage.IN2017).click();
        getDriver().findElement(LoginPage.SEARCH_SUBMIT).sendKeys("LG LED TV");
        getDriver().findElement(LoginPage.SEARCH).click();
    }

    @When("Select under ${int} and {int} model")
    public void selectUnder$AndModel(int arg0, int arg1) throws InterruptedException {
        getDriver().findElement(LoginPage.UNDER150).sendKeys("150");
        getDriver().findElement(LoginPage.GO).click();

    }

    @Then("Select first product in list")
    public void selectFirstProductInList() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.FIRST_PRODUCT));
        getDriver().findElement(LoginPage.FIRST_PRODUCT).click();
    }

    @Then("Click add to list")
    public void clickAddToList() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.ADD_TO_CART));
        getDriver().findElement(LoginPage.ADD_TO_CART).click();
    }

    @Then("Sign in")
    public void signIn() throws InterruptedException {
        getDriver().findElement(LoginPage.CHECKOUT).click();
        getDriver().findElement(LoginPage.INPUT_EMAIL).sendKeys("anything@gmail.com");
        getDriver().findElement(LoginPage.CONTINUE).click();

    }

    @Then("Password")
    public void password() throws InterruptedException {
        getDriver().findElement(LoginPage.INPUT_PASSWORD).sendKeys("Admin123$");
        getDriver().findElement(LoginPage.SIGN_IN).click();
    }

}