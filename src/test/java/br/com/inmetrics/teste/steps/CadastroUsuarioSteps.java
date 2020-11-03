package br.com.inmetrics.teste.steps;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroUsuarioSteps {

    @Dado("^que esteja no site$")
    public void que_esteja_no_site(DataTable arg1) throws Throwable {
        System.out.println("dado");
    }


    @Quando("^clicar em cadastre-se na tela de login$")
    public void clicar_em_cadastre_se_na_tela_de_login() throws Throwable {
        System.out.println("quando");
    }

    @Entao("^sera cadastrado um novo usuario$")
    public void sera_cadastrado_um_novo_usuario() throws Throwable {
        System.out.println("entao");
    }

    @Before
    public void init(){
        System.out.println("Aqui Before");
    }

    @After
    public void tearDown(){
        System.out.println("Aqui After");
    }
}
