#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@EditarFuncionario
Funcionalidade: Testes de Validação de Edicao de Funcionario.

  Contexto:
    Dado que esteja logado no site
      | Site    |
      | inmrobo |

  @Editar_Funcionario_001
  Cenario: Editar funcionario com sucesso
    Quando pesquisar um funcionario existente
    E realizar a edicao de seus dados
    Entao os dados do funcionario serao atualizados