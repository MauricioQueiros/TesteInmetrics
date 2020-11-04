#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@ExcluirFuncionario
Funcionalidade: Testes de Validação de Exclusao de Funcionario.

  Contexto:
    Dado que esteja logado no site
      | Site    |
      | inmrobo |

  @Excluir_Funcionario_001
  Cenario: Excluir funcionario com sucesso
    Quando pesquisar um funcionario existente
    E realizar sua exclusao
    Entao o sistema retornara mensagem de excluido com sucesso