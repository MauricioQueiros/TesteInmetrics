package br.com.inmetrics.teste.steps.web;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

    @Quando("^inserir credenciais validas$")
    public void inserir_credenciais_validas() throws Throwable {
    }

    @Entao("^serei logado no sistema$")
    public void serei_logado_no_sistema() throws Throwable {
    }

    @Quando("^inserir credenciais invalidas$")
    public void inserir_credenciais_invalidas() throws Throwable {
    }

    @Entao("^o sistema retorna mensagem de erro$")
    public void o_sistema_retorna_mensagem_de_erro() throws Throwable {
    }

}
