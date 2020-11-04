package br.com.inmetrics.teste.steps.web;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class CadastroUsuarioSteps {

    LoginPage login;

    public CadastroUsuarioSteps(){
        this.login = new LoginPage();
    }

    @Dado("^que esteja no site$")
    public void que_esteja_no_site(DataTable arg1) throws Throwable {
        login.acessLoginPage("http://www.inmrobo.tk/accounts/login/");
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

    @Quando("^tentar cadastrar um usuario com menos de 8 caracteres$")
    public void tentar_cadastrar_um_usuario_com_menos_de_caracteres() throws Throwable {
    }

    @Entao("^o sistema apresenta um aviso de que o nome do usuario precisa de no minimo 8 caracteres$")
    public void o_sistema_apresenta_um_aviso_de_que_o_nome_do_usuario_precisa_de_no_minimo_caracteres() throws Throwable {
    }

    @Quando("^inserir senhas divergentes nos campos de senha$")
    public void inserir_senhas_divergentes_nos_campos_de_senha() throws Throwable {
    }

    @Entao("^o sistema apresenta a mensagem Senhas nao combinam$")
    public void o_sistema_apresenta_a_mensagem_Senhas_nao_combinam() throws Throwable {
    }

}
