#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@web
@CadastroUsuario
Funcionalidade: Testes de Validação de Cadastro de Usuário.

  Contexto:
    Dado que esteja no site
      | Site    |
      | inmrobo |

  @Cadastro_Usuario_001
  @Cadastro_Usuario_Positivo
  Cenario: Cadastrar usuario com sucesso
    Quando clicar em cadastre-se na tela de login
    Entao sera cadastrado um novo usuario

  @Cadastro_Usuario_002
  @Cadastro_Usuario_Negativo
  Cenario: Tentar cadastrar um usuario com menos de 8 caracteres
    Quando clicar em cadastre-se na tela de login
    E tentar cadastrar um usuario com menos de 8 caracteres
    Entao o sistema apresenta um aviso de que o nome do usuario precisa de no minimo 8 caracteres

  @Cadastro_Usuario_003
  @Cadastro_Usuario_Negativo
  Cenario: Tentar cadastrar um usuario com senhas incompativeis
    Quando clicar em cadastre-se na tela de login
    E inserir senhas divergentes nos campos de senha
    Entao o sistema apresenta a mensagem Senhas nao combinam