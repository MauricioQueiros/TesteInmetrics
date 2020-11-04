#language:pt
#Author: Mauricio Barbosa de Queiros Junior
#Version: 1.0
@Login
Funcionalidade: Testes de Login.

  Contexto:
    Dado que esteja no site
      | Site    |
      | inmrobo |

  @Login_001
  Cenario: Login efetuado com sucesso
    Quando inserir credenciais validas
    Entao serei logado no sistema

  @Login_002
  Cenario: Login efetuado com sucesso
    Quando inserir credenciais invalidas
    Entao o sistema retorna mensagem de erro