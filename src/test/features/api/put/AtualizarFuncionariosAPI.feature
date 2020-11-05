#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@AtualizarFuncionarioAPI
Funcionalidade: Testes de Validação de Atualizacai de Funcionario via API.

  @Atualizar_Funcionario_API_001
  Cenario: Atualizar funcionario com sucesso
    Dado solicitacao de atualizacao no servico rest API de Testes Inmetrics com informacoes validas
    Quando atualizar um funcionario
    Entao a API retorna status code '202'

  @Atualizar_Funcionario_API_002
  Cenario: Atualizar funcionario com id invalido
    Dado solicitacao de atualizacao no servico rest API de Testes Inmetrics com informacoes invalidas
    Quando atualizar um funcionario
    Entao a API retorna status code '400'