package steps;

import br.com.srbarriga.utils.commons.BaseTest;
import br.com.srbarriga.web.funcionalidades.LoginFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class LoginSteps extends BaseTest {

    LoginFuncionalidade loginFuncionalidade;

    public LoginSteps(){
        this.loginFuncionalidade = new LoginFuncionalidade();
    }

    @E("^realizo login com o usuario \"([^\"]*)\"$")
    public void realizoLoginComUsuario(String usuario) throws Throwable {
        this.loginFuncionalidade.loginAplicacao(usuario);

    }

    @Entao("^visualizo a mensagem de login com sucesso$")
    public void visualizoAMensagemDeLoginComSucesso() {
        Assert.assertTrue(this.loginFuncionalidade.retornaMensagemDeSucesso());
    }
}
