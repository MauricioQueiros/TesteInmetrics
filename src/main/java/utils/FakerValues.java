package utils;

import com.github.javafaker.Faker;

public class FakerValues {
    Faker faker;

    public FakerValues() {
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
