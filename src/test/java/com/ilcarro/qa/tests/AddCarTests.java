package com.ilcarro.qa.tests;

import com.ilcarro.qa.model.Car;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddCarTests extends TestBase {
    @BeforeClass
    public void ensurePreconditions() throws InterruptedException {

        if (!app.session().isUserLoggedIn()) {
            app.session().login("testerZXC+1@zxc.com", "1234567Aa");
        }

    }

    @Test
    public void testFormLetTheCarWork() throws InterruptedException {
        app.header().addCar();
        // app.header().click(By.cssSelector(".let-carwork-style_let_car__location__30BIh"));

        app.car().fillAddCarForm(new Car()
                .setCountry("Israel")
                .setAddress("Hrtzel 1")
                .setDistance("500")
                .setSerialNumber("654-111-211")
                .setBrand("Honda")
                .setModel("Civic")
                .setYear("2015")
                .setEngine("HC123456789HC")
                .setFuelConsumption("6.5")
                .setFuel("petrol")
                .setTransmission("full drive")
                .setWd("4WD")
                .setHorsepower("149")
                .setTorque("120")
                .setDoors("5")
                .setSeats("5")
                .setClasss("C")
                .setAbout("Very good car")
                .setFeature("new one, non smoking, navigator, baby chair")
                .setPrice("55"));
        app.car().submitForm();
    }

    @Test(dataProvider = "validCarFromCSV", dataProviderClass = DataProvider.class)
    public void testFormLetTheCarWorkFromCSV(Car car) throws InterruptedException {
        app.header().addCar();
        // app.header().click(By.cssSelector(".let-carwork-style_let_car__location__30BIh"));
        app.car().fillAddCarForm(car);
        app.car().submitForm();
    }

}
