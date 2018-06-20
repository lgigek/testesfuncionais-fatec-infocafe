#language: pt
Funcionalidade: Realizar login

  Cenário: Realizar login com usuário existente
    Dado Que o usuário está na página de login
    Quando O usuário realiza login com um usuário existente
    Então O usuário é direcionado para a página inicial

  Cenário: Tentar realizar login com usuário inexistente
    Dado Que o usuário está na página de login
    Quando O usuário realiza login com um usuário inexistente
    Então O usuário é direcionado para a tela de login

  Cenário: Realizar logout
    Dado Que o usuário já está autenticado
    Quando Clica em "Sair"
    Então O usuário é direcionado para a tela de login

  Cenário: Tentar realizar login sem preencher o campo usuário
    Dado Que o usuário está na página de login
    Quando Digita o um valor no campo senha
    E Clica em "Entrar"
    Então O usuário é direcionado para a tela de login
    E É exibida uma mensagem de erro

  Cenário: Tentar realizar login sem preencher o campo senha
    Dado Que o usuário está na página de login
    Quando Digita o um valor no campo usuário
    E Clica em "Entrar"
    Então O usuário é direcionado para a tela de login
    E É exibida uma mensagem de erro

  Cenário: Tentar realizar login sem preencher nenhum campo
    Dado Que o usuário está na página de login
    Quando Clica em "Entrar"
    Então O usuário é direcionado para a tela de login
    E É exibida uma mensagem de erro
