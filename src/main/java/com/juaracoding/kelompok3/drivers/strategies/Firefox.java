package com.juaracoding.kelompok3.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
