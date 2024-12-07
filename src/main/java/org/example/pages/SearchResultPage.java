package org.example.pages;

import org.example.base.DriverManager;
import org.openqa.selenium.By;

public class SearchResultPage {

    private By resultStats = By.id("result-stats");

    public boolean isResultsFound() {
        return DriverManager.getDriver().findElement(resultStats).isDisplayed();
    }
}
