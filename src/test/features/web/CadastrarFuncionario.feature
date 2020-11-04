#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
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

  @Cadastro_Funcionario_003
  Cenario: Cadastrar funcionario com contratacao CLT
    Quando inserir um novo funcionario
    E colocar tipo de contratacao 'CLT'
    Entao funcionario sera cadastrado com sucesso

  @Cadastro_Funcionario_004
  Cenario: Cadastrar funcionario com contratacao CNPJ
    Quando inserir um novo funcionario
    E colocar tipo de contratacao 'CNPJ'
    Entao funcionario sera cadastrado com sucesso