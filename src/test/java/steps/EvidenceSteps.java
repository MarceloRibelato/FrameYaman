package steps;

import br.com.srbarriga.utils.commons.ParametrosEvidenciaFuncionalidade;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;

public class EvidenceSteps {

    private ParametrosEvidenciaFuncionalidade realizandoTesteFuncionalidade;

    public EvidenceSteps() {
        this.realizandoTesteFuncionalidade = new ParametrosEvidenciaFuncionalidade();
    }

    @Dado("^que estou realizando o teste$")
    public void estouRealizandoOTeste(DataTable params) {
        System.out.println("Definindo os parametros da evidencia . . .");
        this.realizandoTesteFuncionalidade.executandoTeste(params);
        System.out.println("Parâmetros de evidência ok");
    }
}
