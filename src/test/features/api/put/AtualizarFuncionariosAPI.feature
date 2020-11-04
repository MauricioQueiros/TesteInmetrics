#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@AtualizarFuncionarioAPI
Funcionalidade: Testes de Validação de Atualizacai de Funcionario via API.

  @Atualizar_Funcionario_API_001
  Cenario: Atualizar funcionario com sucesso
    Dado solicitacao de atualizacao no servico rest API de Testes Inmetrics
      | endpoint |
      |          |
    Quando atualizar um funcionario com informacoes validas
    Entao a api retorna status code '200'

  @Atualizar_Funcionario_API_002
  Cenario: Atualizar funcionario com id invalido
    Dado solicitacao de atualizacao no servico rest API de Testes Inmetrics
      | endpoint |
      |          |
    Quando atualizar um funcionario com id invalido
    Entao a api retorna status code '400'

  @Atualizar_Funcionario_API_003
  Cenario: Atualizar funcionario com id invalido
    Dado solicitacao de atualizacao no servico rest API de Testes Inmetrics
      | endpoint |
      |          |
    Quando atualizar um funcionario com informacoes invalidas
    Entao a api retorna status code '400'