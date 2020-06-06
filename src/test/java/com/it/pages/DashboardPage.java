package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DashboardPage extends BasePage {


    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement ldUserEmail;


    public String getLbUserEmail() {
        return ldUserEmail.getText();
}

}
/*        //Explicit wait - jdem element kogda on vozvrashaetsya
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        FluentWait<WebDriver> driverFluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoreAll(Arrays.asList(NoSuchElementException.class,ExceptionInInitializerError.class));
        //driverFluentWait.until(ExpectedConditions.visibilityOf(ldUserEmail)).getText();
        //Thread.sleep(2000);

        return webDriverWait.until(ExpectedConditions.visibilityOf(ldUserEmail)).getText();*/

