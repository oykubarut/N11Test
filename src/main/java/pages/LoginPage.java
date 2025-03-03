package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    //Constructor - Yapıcı method
    public LoginPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    //Web elementlerini tanımlama
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButtonField = By.id("loginButton");

    //emaili alan method
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButtonField).click();
    }

    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.n11.com/");
    }

    public boolean isLoginInvalid() {
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.n11.com/giris-yap");
    }

    // Login işlemi için tek bir metod
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

}
