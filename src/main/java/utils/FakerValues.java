package utils;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class FakerValues {
    Faker faker;
    private boolean	comPontos = true;

    public FakerValues() {
        this.faker = new Faker();
    }

    public String getName(int lenghtName) {
        int i = 0;
        String name = "";

        while(i<1) {
            name = faker.name().firstName();
            if(name.length()==lenghtName) {i++;}
        }
        return name;
    }

    public String getPass() {
        return faker.idNumber().valid();
    }

    public String getCargo(){
        return faker.job().position();
    }

    public String getSalario(){
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "1.000,00");
        list.add(1, "2.000,00");
        list.add(2, "3.000,00");
        list.add(3, "4.000,00");
        list.add(4, "5.000,00");
        list.add(5, "6.000,00");

        return list.get(randomiza(5));
    }

    public String getSexoApi(){
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "m");
        list.add(1, "f");
        list.add(2, "i");

        return list.get(randomiza(2));
    }

    public String getSexoWeb(){
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Masculino");
        list.add(1, "Feminino");
        list.add(2, "Indiferente");

        return list.get(randomiza(2));
    }

    public String getCltOuPj(){
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "clt");
        list.add(1, "pj");

        return list.get(randomiza(1));
    }

    public String cpf() {

        int n = 9;
        int n1 = randomiza(n);
        int n2 = randomiza(n);
        int n3 = randomiza(n);
        int n4 = randomiza(n);
        int n5 = randomiza(n);
        int n6 = randomiza(n);
        int n7 = randomiza(n);
        int n8 = randomiza(n);
        int n9 = randomiza(n);
        int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

        d1 = 11 - (mod(d1, 11));

        if (d1 >= 10)
            d1 = 0;

        int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

        d2 = 11 - (mod(d2, 11));

        String retorno = null;

        if (d2 >= 10)
            d2 = 0;
        retorno = "";

        if (comPontos)
            retorno = "" + n1 + n2 + n3 + '.' + n4 + n5 + n6 + '.' + n7 + n8 + n9 + '-' + d1 + d2;
        else
            retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

        return retorno;
    }

    private int randomiza(int n) {
        int ranNum = (int) (Math.random() * n);
        return ranNum;
    }

    private int mod(int dividendo, int divisor) {
        return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
    }

}
