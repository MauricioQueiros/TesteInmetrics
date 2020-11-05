package br.com.inmetrics.teste.support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.ConfigWeb;

public class Hooks extends ConfigWeb {

    @Before
    public void init(Scenario scenario) throws InterruptedException{
        if(scenario.getSourceTagNames().contains("@web")){
            initDriver();
        }
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.getSourceTagNames().contains("@web")){
            closeDriver();
        }
    }
}