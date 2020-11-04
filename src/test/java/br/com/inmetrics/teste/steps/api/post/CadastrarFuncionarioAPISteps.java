package br.com.inmetrics.teste.steps.api.post;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import pageobjects.api.EmpregadoControllerPage;
import service.EmpregadoControllerService;

public class CadastrarFuncionarioAPISteps {

    EmpregadoControllerService empregadoControllerService;
    EmpregadoControllerPage empregadoControllerPage;

    static String[] parametros;
    static Response response;

    public CadastrarFuncionarioAPISteps(){
        this.empregadoControllerService = new EmpregadoControllerService();
        this.empregadoControllerPage = new EmpregadoControllerPage();
    }

    @Dado("^solicitacao de cadastro no servico rest API de Testes Inmetrics com informacoes validas$")
    public void solicitacao_de_cadastro_no_servico_rest_API_de_Testes_Inmetrics_com_informacoes_validas() throws Throwable {
        parametros = empregadoControllerPage.getParametrosPost(true);
    }

    @Dado("^solicitacao de cadastro no servico rest API de Testes Inmetrics com informacoes invalidas$")
    public void solicitacao_de_cadastro_no_servico_rest_API_de_Testes_Inmetrics_com_informacoes_invalidas() throws Throwable {
        parametros = empregadoControllerPage.getParametrosPost(false);
    }

    @Quando("^cadastrar um novo funcionario$")
    public void cadastrar_um_novo_funcionario_com_informacoes_validas() throws Throwable {
        response = empregadoControllerService.cadastrarUsuario(parametros);
    }

    @Entao("^a api retorna status code '(\\d+)'$")
    public void a_api_retorna_status_code(int statusCode) throws Throwable {
        empregadoControllerService.validateStatusCode(response, statusCode);
    }

}
