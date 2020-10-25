package com.ilcarro.qa.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase {
    public HeaderHelper(WebDriver wd) {
        super(wd);
    }
    public boolean isSignUpTabPresentInHeader() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void clickLogout() {
        click(By.xpath("//a[contains(., 'logOut')]"));
    }

    public void clickSignUp() {
        click(By.cssSelector("[href='/signup']"));
    }

    public void addCar() {
        click(By.cssSelector(".header__nav [href='/car']"));
    }
}
