#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@CadastroFuncionarioAPI
Funcionalidade: Testes de Validação de Cadastro de Funcionario via API.

  @Cadastro_Funcionario_API_001
  Cenario: Cadastrar funcionario com sucesso
    Dado solicitacao de cadastro no servico rest API de Testes Inmetrics
      | endpoint |
      |          |
    Quando cadastrar um novo funcionario com informacoes validas
    Entao a api retorna status code '200'

  @Cadastro_Funcionario_API_002
  Cenario: Cadastrar funcionario com sucesso
    Dado solicitacao de cadastro no servico rest API de Testes Inmetrics
      | endpoint |
      |          |
    Quando cadastrar um novo funcionario com informacoes invalidas
    Entao a api retorna status code '400'