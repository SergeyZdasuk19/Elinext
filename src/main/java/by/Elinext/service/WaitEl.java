package by.Elinext.service;

import by.Elinext.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEl {
    private static final int WAIT_TIMEOUT_SECONDS = 20;
    private static final int WAIT_TIMEOUT_M_SECONDS = 1000;


    public static WebElement $visibility(String by) {
        return new WebDriverWait(DriverSingleton.getDriver(), WAIT_TIMEOUT_SECONDS, WAIT_TIMEOUT_M_SECONDS)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(by)));
    }

    public static WebElement $menu(String by) {
        return new WebDriverWait(DriverSingleton.getDriver(), WAIT_TIMEOUT_SECONDS, WAIT_TIMEOUT_M_SECONDS)
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//li[@class=\"dropdown\"]//a[text() ='" + by.trim() + "']")));
    }
}
