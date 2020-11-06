package br.com.inmetrics.teste.steps.web;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.web.CadastrarFuncionarioPage;
import pageobjects.web.LoginPage;
import utils.PropertiesLoader;
import utils.Urls;

public class CadastrarFuncionarioSteps {

    LoginPage login;
    CadastrarFuncionarioPage cadastrarFuncionarioPage;
    PropertiesLoader props;

    public CadastrarFuncionarioSteps(){
        this.login = new LoginPage();
        this.cadastrarFuncionarioPage = new CadastrarFuncionarioPage();
        this.props = new PropertiesLoader();
    }

    @Dado("^que esteja logado no site$")
    public void que_esteja_logado_no_site(DataTable arg1) throws Throwable {
        String user = props.getWebPropertie("user_inmrobo");
        String pass = props.getWebPropertie("pass_inmrobo");
        login.acessLoginPage(Urls.INM_ROBO);
        login.realizarLogin(user, pass);
        login.validaLogin();
    }

    @Quando("^inserir um novo funcionario$")
    public void inserir_um_novo_funcionario() throws Throwable {
        cadastrarFuncionarioPage.clicarNovoFuncionario();
    }

    @Quando("^inserir dados validos$")
    public void inserir_dados_validos() throws Throwable {
        cadastrarFuncionarioPage.inserirDadosCadastrais();
        cadastrarFuncionarioPage.enviarCadastro();
    }

    @Entao("^funcionario sera cadastrado com sucesso$")
    public void funcionario_sera_cadastrado_com_sucesso() throws Throwable {
        cadastrarFuncionarioPage.validarCadastro();
    }

    @Quando("^inserir cpf invalido$")
    public void inserir_cpf_invalido() throws Throwable {
        cadastrarFuncionarioPage.inserirCpfInvalido();
    }

    @Entao("^o sistema retornara um alerta de cpf invalido$")
    public void o_sistema_retornara_um_alerta_de_cpf_invalido() throws Throwable {
        cadastrarFuncionarioPage.validarAlerta();
    }

    @Quando("^colocar tipo de contratacao (.*)")
    public void colocar_tipo_de_contratacao_CLT(String cpf_cnpj) throws Throwable {
    }

}
