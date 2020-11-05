package br.com.inmetrics.teste.steps.api.get;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import service.EmpregadoControllerService;
import utils.PropertiesLoader;

public class ListarFuncionariosAPISteps {

    EmpregadoControllerService empregadoControllerService;
    PropertiesLoader props;

    static Response response;
    static String id;


    public ListarFuncionariosAPISteps(){
        this.empregadoControllerService = new EmpregadoControllerService();
        this.props = new PropertiesLoader();
    }

    @Dado("^solicitacao de listagem de todos os funcionarios no servico rest API de Testes Inmetrics$")
    public void solicitacao_de_listagem_de_todos_os_funcionarios_no_servico_rest_API_de_Testes_Inmetrics() throws Throwable {
        response = empregadoControllerService.getAllUsers();
    }

    @Quando("^realizar o request$")
    public void realizar_o_request() throws Throwable {
        //Request sendo realizado na linha 21 dest classe
        System.out.println("Request realizado com sucesso");
    }

    @Quando("^realizar o GET$")
    public void realizar_o_GET() throws Throwable {
        response = empregadoControllerService.getUsersById(id);
    }

    @Dado("^solicitacao de listagem de um funcionario no servico rest API de Testes Inmetrics com id valido$")
    public void solicitacao_de_listagem_de_um_funcionario_no_servico_rest_API_de_Testes_Inmetrics_com_id_valido() throws Throwable {
        id = props.getApiPropertie("id_valido");
    }

    @Dado("^solicitacao de listagem de um funcionario no servico rest API de Testes Inmetrics com id invalido$")
    public void solicitacao_de_listagem_de_um_funcionario_no_servico_rest_API_de_Testes_Inmetrics_com_id_invalido() throws Throwable {
        id = props.getApiPropertie("id_invalido");
    }

    @Entao("^o servico retorna status code '(\\d+)'$")
    public void o_servico_retorna_status_code(int statusCode) throws Throwable {
        empregadoControllerService.validateStatusCode(response, statusCode);
    }
}
