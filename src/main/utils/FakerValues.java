package br.com.inmetrics.automacao.utils;

import com.github.javafaker.Faker;

public class FakeValuesForTest {

    Faker faker;

    public FakeValuesForTest() {
        this.faker = new Faker();
    }

    public String getName(int lenghtName) {
        int i = 0;
        String name = "";

        while(i<1) {
            name = faker.name().firstName();
            if(name.length()>=lenghtName) {i++;}
        }
        return name;
    }

    public String getPass() {
        return faker.idNumber().valid();
    }

}