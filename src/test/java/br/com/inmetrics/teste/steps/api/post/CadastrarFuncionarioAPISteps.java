package br.com.inmetrics.teste.steps.api.post;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarFuncionarioAPISteps {

    @Dado("^solicitacao de cadastro no servico rest API de Testes Inmetrics$")
    public void solicitacao_de_cadastro_no_servico_rest_API_de_Testes_Inmetrics(DataTable arg1) throws Throwable {
    }

    @Quando("^cadastrar um novo funcionario com informacoes validas$")
    public void cadastrar_um_novo_funcionario_com_informacoes_validas() throws Throwable {
    }

    @Entao("^a api retorna status code '(\\d+)'$")
    public void a_api_retorna_status_code(int arg1) throws Throwable {
    }

    @Quando("^cadastrar um novo funcionario com informacoes invalidas$")
    public void cadastrar_um_novo_funcionario_com_informacoes_invalidas() throws Throwable {
    }
}
