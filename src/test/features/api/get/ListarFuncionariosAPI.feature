#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@ListarFuncionarioAPI
Funcionalidade: Testes de Validação de Listagem de Funcionarios via API.

  @Listar_Funcionario_API_001
  Cenario: Listar todos os funcionarios com sucesso.
    Dado solicitacao de listagem de todos os funcionarios no servico rest API de Testes Inmetrics
    Quando realizar o request
    Entao o servico retorna status code '200'

  @Listar_Funcionario_API_002
  Cenario: Listar funcionario com id valido.
    Dado solicitacao de listagem de um funcionario no servico rest API de Testes Inmetrics com id valido
    Quando realizar o GET
    Entao o servico retorna status code '202'

  @Listar_Funcionario_API_003
  Cenario: Listar funcionario com id invalido.
    Dado solicitacao de listagem de um funcionario no servico rest API de Testes Inmetrics com id invalido
    Quando realizar o GET
    Entao o servico retorna status code '400'