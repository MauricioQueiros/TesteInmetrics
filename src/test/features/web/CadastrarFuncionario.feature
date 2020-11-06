#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@web
@CadastroFuncionario
Funcionalidade: Testes de Validação de Cadastro de Funcionario.

  Contexto:
    Dado que esteja logado no site
      | Site    |
      | inmrobo |

  @Cadastro_Funcionario_001
  Cenario: Cadastrar funcionario com sucesso
    Quando inserir um novo funcionario
    E inserir dados validos
    Entao funcionario sera cadastrado com sucesso

  @Cadastro_Funcionario_002
  Cenario: Cadastrar funcionario com cpf invalido
    Quando inserir um novo funcionario
    E inserir cpf invalido
    Entao o sistema retornara um alerta de cpf invalido