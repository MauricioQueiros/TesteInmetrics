package br.com.inmetrics.teste.support;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{

    @Before
    public void init(){
        System.out.println("Aqui Before");
    }

    @After
    public void tearDown(){
        System.out.println("Aqui After");
    }
}