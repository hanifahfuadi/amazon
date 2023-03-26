package amazon.Page;


import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LoginPage {
    public static final String OPEN_URL  = "https://www.amazon.com/";
    public static final By BURGER_BUTTOM = By.cssSelector(".hm-icon");
    public static final By ELECTRONICS = By.cssSelector("[data-ref-tag='nav_em_1_1_1_6']");
    public static final By TELEVISIONS_AND_VIDEO = By.xpath("//a[.='Television & Video']");
    public static final By TELEVISIONS = By.xpath("//span[.='Televisions']");
    public static final By THREETWO_INCH_UNDER = By.cssSelector("[aria-label='32 Inches & Under'] .a-icon");
    public static final By SORT_BY = By.cssSelector(".a-dropdown-label");
    public static final By HIGH_TO_LOW = By.id("s-result-sort-select_2");
    public static final By SEARCH_SUBMIT = By.id("twotabsearchtextbox");
    public static final By SEARCH = By.id("nav-search-submit-button");
    public static final By UNDER150 = By.id("high-price");
    public static final By GO = By.cssSelector(".a-button-input");
    public static final By IN2017 = By.xpath("//span[.='2017']");
    public static final By FIRST_PRODUCT = By.cssSelector("[data-component-id='2'] h2:nth-of-type(1) span:nth-of-type(1)");
    public static final By ADD_TO_CART = By.cssSelector("#add-to-cart-button");
    public static final By CHECKOUT = By.cssSelector("[name='proceedToRetailCheckout']");
    public static final By INPUT_EMAIL = By.cssSelector("#ap_email");
    public static final By CONTINUE = By.cssSelector(".a-button-input");
    public static final By INPUT_PASSWORD = By.cssSelector("#ap_password");
    public static final By SIGN_IN = By.cssSelector("#signInSubmit");








}
