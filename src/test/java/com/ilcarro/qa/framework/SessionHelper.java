package com.ilcarro.qa.framework;

import com.ilcarro.qa.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver wd) {
        super(wd);
    }



    public boolean isLoginFormPresent() {
        return isElementPresent(By.cssSelector(".Login_login__right_block__1niYm"));
    }




    public void clickLoginTabOnHeader() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }

    public void login(String email, String password) throws InterruptedException {
        clickLoginTabOnHeader();
        fillLoginForm(new User().setEmail(email).setPassword(password));
        submitForm();
        Thread.sleep(2000);
    }

    public void fillLoginForm(User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

    public void fillRegistrationForm(User user) {
        type(By.cssSelector("#first_name"), user.getfName());
        type(By.cssSelector("#second_name"), user.getlName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());

        click(By.cssSelector("#check_policy"));
    }

    public boolean isSignUpFormPresent() {
        return isElementPresent(By.cssSelector("form.signup__fields"));
    }
}
