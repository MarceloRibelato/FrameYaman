package br.com.srbarriga.web.funcionalidades.users.utils;

public enum UserCredentials implements Credentials {

    USUARIO_TESTE("teste"){
        @Override
        public String user() {
            return "6089@teste.com.br";
        }

        @Override
        public String password() {
            return "Yaman123";
        }

        @Override
        public String nome() {
            return "Automação6089";
        }
    }
    ;

    UserCredentials(String value) {
    }
}
