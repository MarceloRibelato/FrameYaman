package br.com.srbarriga.utils.commons;

import cucumber.api.DataTable;
import java.util.Map;

/**
 * @author Ronaldo Silva
 */
public class ParametrosEvidenciaFuncionalidade extends BaseTest {

	public void executandoTeste(DataTable params) {
		initializeEvidence();
		for (Map<String, String> map : params.asMaps(String.class, String.class)) {
			setCtNumber(map.get("Numero do CT"));
			setCtName("CT - " + map.get("Numero do CT") + " " + map.get("Nome do CT"));
			setTester(map.get("Nome do executor"));
			setCiclo(map.get("Sprint"));
		}
	}
}
