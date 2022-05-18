package com.browserstack;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.testng.Arquillian;
import org.testng.annotations.Test;

@RunAsClient
public class SampleTest extends Arquillian {

    @Test(dataProvider = Arquillian.ARQUILLIAN_DATA_PROVIDER)
    public void googleSearchTest(@InitialPage Google GooglePage) {
        GooglePage.searchFor("Arquillian Graphene");
    }
}
