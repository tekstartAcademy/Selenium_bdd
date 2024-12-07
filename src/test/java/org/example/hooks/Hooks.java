package org.example.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.example.base.DriverManager;

public class Hooks {

    @Before
    public void setup() {
        DriverManager.initializeDriver();
    }

    @After
    public void teardown() {
        DriverManager.quitDriver();
    }
}
