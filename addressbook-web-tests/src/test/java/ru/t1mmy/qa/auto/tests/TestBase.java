package ru.t1mmy.qa.auto.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.t1mmy.qa.auto.appmanager.ApplicationManager;

/**
 * Created by t1mmy on 16.01.2017.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);


    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod
    public void tearDown() {
        app.stop();
    }
    
}
