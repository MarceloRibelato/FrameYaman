#language: pt
#encoding: UTF-8
#version:1.0
#author: Guilherme.Gomes
#date: 11/02/2020

  @web
  Funcionalidade: Login na aplicação

    @login
    Cenario: Realizar login com usuario valido
      Dado que estou realizando o teste
        | Numero do CT |                      Nome do CT                 | Nome do executor    |  Sprint   |
        | 2-XXX        |               Acessando a pagina home           |  Guilherme Gomes    | Sprint 1  |
      Quando realizo login com o usuario "teste"
      Entao visualizo a mensagem de login com sucesso
