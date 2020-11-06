package br.com.inmetrics.teste.steps.web;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.web.ExcluirFuncionarioPage;

public class ExcluirFuncionarioSteps {

    ExcluirFuncionarioPage excluirFuncionarioPage;

    public ExcluirFuncionarioSteps(){
        this.excluirFuncionarioPage = new ExcluirFuncionarioPage();
    }

    @Quando("^pesquisar um funcionario existente para exclusao$")
    public void pesquisar_um_funcionario_existente_para_exclusao() throws Throwable {
        excluirFuncionarioPage.serchEmployee();
    }

    @Quando("^realizar sua exclusao$")
    public void realizar_sua_exclusao() throws Throwable {
        excluirFuncionarioPage.clickDelete();
    }

    @Entao("^o sistema retornara mensagem de excluido com sucesso$")
    public void o_sistema_retornara_mensagem_de_excluido_com_sucesso() throws Throwable {
        excluirFuncionarioPage.validarEclusao();
    }

}
