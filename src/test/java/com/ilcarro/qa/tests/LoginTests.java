package com.ilcarro.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    //tests for logintn
    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.session().isLoginFormPresent()) {
            if(app.session().isUserLoggedIn()){
                app.header().clickLogout();
            }
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() throws InterruptedException {
        //aa@bb109.com
        //aa@bb110.com
        //fillLoginForm
        app.session().login("aa@bb109.com","1Aaaaaaaa");
        
        //Assert userLoggedIn
    }

}
