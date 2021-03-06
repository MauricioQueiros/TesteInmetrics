package br.com.inmetrics.teste.steps.web;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.web.EditarFuncionarioPage;

public class EditarFuncionarioSteps {

    EditarFuncionarioPage editarFuncionarioPage;

    public EditarFuncionarioSteps(){
        this.editarFuncionarioPage = new EditarFuncionarioPage();
    }

    @Quando("^pesquisar um funcionario existente$")
    public void pesquisar_um_funcionario_existente() throws Throwable {
        editarFuncionarioPage.serchEmployee();
    }

    @Quando("^realizar a edicao de seus dados$")
    public void realizar_a_edicao_de_seus_dados() throws Throwable {
        editarFuncionarioPage.clickEdit();
        editarFuncionarioPage.editEmployee();
    }

    @Entao("^os dados do funcionario serao atualizados$")
    public void os_dados_do_funcionario_serao_atualizados() throws Throwable {
        editarFuncionarioPage.validarSucesso();
    }

}
