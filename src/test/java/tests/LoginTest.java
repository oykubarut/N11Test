package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        driver.get("https://www.n11.com/giris-yap");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("oykubarut@hotmail.com","yanlissifre");

        Assert.assertTrue(loginPage.isLoginSuccessful(),"Giriş Başarılı!");

    }
    @Test
    public void testInvalidLogin() {
        driver.get("https://www.n11.com/giris-yap");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("oykubarut@hotmail.com","yanlissifre");

        Assert.assertTrue(loginPage.isLoginInvalid(), "Giriş Başarısız!");


    }
}

