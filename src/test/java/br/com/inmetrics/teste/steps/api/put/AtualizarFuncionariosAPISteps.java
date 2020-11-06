package br.com.inmetrics.teste.steps.api.put;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import controller.api.EmpregadoController;
import service.EmpregadoControllerService;
import utils.PropertiesLoader;

public class AtualizarFuncionariosAPISteps {

    EmpregadoControllerService empregadoControllerService;
    EmpregadoController empregadoController;
    PropertiesLoader props;

    static String[] parametros;
    static Response response;
    static String id;

    public AtualizarFuncionariosAPISteps(){
        this.empregadoController = new EmpregadoController();
        this.empregadoControllerService = new EmpregadoControllerService();
        this.props = new PropertiesLoader();
    }

    @Dado("^solicitacao de atualizacao no servico rest API de Testes Inmetrics com informacoes validas$")
    public void solicitacao_de_atualizacao_no_servico_rest_API_de_Testes_Inmetrics_com_informacoes_validas() throws Throwable {
        parametros = empregadoController.getParametrosPost(true);
        id = props.getApiPropertie("id_valido");
    }

    @Dado("^solicitacao de atualizacao no servico rest API de Testes Inmetrics com informacoes invalidas$")
    public void solicitacao_de_atualizacao_no_servico_rest_API_de_Testes_Inmetrics_com_informacoes_invalidas() throws Throwable {
        parametros = empregadoController.getParametrosPost(false);
        id = props.getApiPropertie("id_invalido");
    }

    @Quando("^atualizar um funcionario$")
    public void atualizar_um_funcionario() throws Throwable {
        response = empregadoControllerService.atualizarFuncionario(parametros, id);
    }

    @Entao("^a API retorna status code '(\\d+)'$")
    public void a_API_retorna_status_code(int statusCode) throws Throwable {
        empregadoControllerService.validateStatusCode(response, statusCode);
    }
}
