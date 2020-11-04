#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@ListarFuncionarioAPI
Funcionalidade: Testes de Validação de Listagem de Funcionarios via API.

  @Listar_Funcionario_API_001
  Cenario: Listar todos os funcionarios com sucesso.
    Dado solicitacao de listagem de todos os funcionarios no servico rest API de Testes Inmetrics
      | endpoint |
      |          |
    Quando realizar o request
    Entao a api retorna status code '200'

  @Listar_Funcionario_API_002
  Cenario: Listar funcionario com id valido.
    Dado solicitacao de listagem de um funcionario no servico rest API de Testes Inmetrics
      | endpoint |
      |          |
    Quando realizar o request com informacoes validas
    Entao a api retorna status code '200'

  @Listar_Funcionario_API_003
  Cenario: Listar funcionario com id invalido.
    Dado solicitacao de listagem de um funcionario no servico rest API de Testes Inmetrics
      | endpoint |
      |          |
    Quando realizar o request com informacoes invalidas
    Entao a api retorna status code '400'