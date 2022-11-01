package stepDefinitions;

import com.driverUtils.AppiumServer;
import com.driverUtils.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverManager {


    @Before
    public void startUp() throws Exception{
	    System.out.println("Before from HOOK's");
	    AppiumServer.Start();
	    setUp();

    }

    @After
    public void tearDown(){
        System.out.println("After from HOOK's");
        quitDriver();
        AppiumServer.Stop();
    }
}
