package sedecti.Identificacao_maquina;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratePDFTest {
	
	private final Etiqueta etiqueta = new Etiqueta("SEPLAN", "123", "", "DETI", "", "");
	
	@Test
	public void gerarNomeArquivoPDF() {
		assertEquals(GeneratePDF.generateNomeArquivo(etiqueta), "SEPLAN_123");
	}
}
