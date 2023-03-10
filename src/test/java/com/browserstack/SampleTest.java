package com.browserstack;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.testng.Arquillian;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


@RunAsClient
public class SampleTest extends Arquillian {

    @Browser1
    @Drone
    private static WebDriver browser1;

    @Browser2
    @Drone
    private static WebDriver browser2;

    @Browser3
    @Drone
    private static WebDriver browser3;

    //same test on different Browsers
    @Test(dataProvider = Arquillian.ARQUILLIAN_DATA_PROVIDER)
    public void googleSearchTest1(@Browser1 @InitialPage Google GooglePage) {
        GooglePage.searchFor("Samsung s8");
    }

    @Test(dataProvider = Arquillian.ARQUILLIAN_DATA_PROVIDER)
    public void googleSearchTest2(@Browser2 @InitialPage Google GooglePage) {
        GooglePage.searchFor("Samsung s9");
    }

    @Test(dataProvider = Arquillian.ARQUILLIAN_DATA_PROVIDER)
    public void googleSearchTest3(@Browser3 @InitialPage Google GooglePage) {
        GooglePage.searchFor("Samsung s21");
    }
}
