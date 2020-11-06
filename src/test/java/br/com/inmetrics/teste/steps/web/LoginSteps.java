package br.com.inmetrics.teste.steps.web;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.web.LoginPage;
import utils.ConfigWeb;
import utils.PropertiesLoader;

public class LoginSteps extends ConfigWeb {

    LoginPage login;
    PropertiesLoader props;

    public LoginSteps(){
        this.login = new LoginPage();
        this.props = new PropertiesLoader();
    }

    @Quando("^inserir credenciais validas$")
    public void inserir_credenciais_validas() throws Throwable {
        String user = props.getWebPropertie("user_inmrobo");
        String pass = props.getWebPropertie("pass_inmrobo");
        login.realizarLogin(user, pass);
    }

    @Entao("^serei logado no sistema$")
    public void serei_logado_no_sistema() throws Throwable {
        login.validaLogin();
    }

    @Quando("^inserir credenciais invalidas$")
    public void inserir_credenciais_invalidas() throws Throwable {
        String user = props.getWebPropertie("user_inmrobo");
        String wrongPass = props.getWebPropertie("wrongPass_inmrobo");
        login.realizarLogin(user, wrongPass);
    }

    @Entao("^o sistema retorna mensagem de erro$")
    public void o_sistema_retorna_mensagem_de_erro() throws Throwable {
        login.validaErroLogin();
    }

}
