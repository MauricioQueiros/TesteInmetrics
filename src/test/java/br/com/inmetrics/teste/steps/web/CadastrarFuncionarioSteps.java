package br.com.inmetrics.teste.steps.web;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarFuncionarioSteps {

    @Dado("^que esteja logado no site$")
    public void que_esteja_logado_no_site(DataTable arg1) throws Throwable {
    }

    @Quando("^inserir um novo funcionario$")
    public void inserir_um_novo_funcionario() throws Throwable {
    }

    @Quando("^inserir dados validos$")
    public void inserir_dados_validos() throws Throwable {
    }

    @Entao("^funcionario sera cadastrado com sucesso$")
    public void funcionario_sera_cadastrado_com_sucesso() throws Throwable {
    }

    @Quando("^inserir cpf invalido$")
    public void inserir_cpf_invalido() throws Throwable {
    }

    @Entao("^o sistema retornara um alerta de cpf invalido$")
    public void o_sistema_retornara_um_alerta_de_cpf_invalido() throws Throwable {
    }

    @Quando("^colocar tipo de contratacao (.*)")
    public void colocar_tipo_de_contratacao_CLT(String cpf_cnpj) throws Throwable {
    }

}
