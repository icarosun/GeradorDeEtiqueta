package sedecti.Identificacao_maquina;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenerateEtiquetaTest {
	
	@Test
	public void valorStringIgualEspaco() {
		assertTrue("Possui valor igual ao espaço", GenerateEtiqueta.valorVazio("    "));
	}

}
