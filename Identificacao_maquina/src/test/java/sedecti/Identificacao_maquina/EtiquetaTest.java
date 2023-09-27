package sedecti.Identificacao_maquina;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import org.junit.Test;
import java.util.Date; 

public class EtiquetaTest {
	private final Etiqueta etiqueta = new Etiqueta("SEPLAN", "123", "", "DETI", "", "");
	
	@Test
	public void tomboDeEtiquetaTemValor() {
		assertTrue("Possui valor diferente de NULO", etiqueta.getTombo() != null && !etiqueta.getTombo().trim().isEmpty());
	}
	
	@Test
	public void secretariaTemValor() {
		assertTrue("Possui valor diferente de NULO", etiqueta.getSecretaria() != null && !etiqueta.getSecretaria().trim().isEmpty());
	}
	
	@Test
	public void departamentoTemValor() {
		assertTrue("Possui valor diferente de NULO", etiqueta.getSetor() != null && !etiqueta.getSetor().trim().isEmpty());
	}
	
	@Test
	public void formatoDeDataBrasileiro () {
		Date data = new Date();
		
		SimpleDateFormat formatoBrasil = new SimpleDateFormat("dd/MM/yyyy");
		assertEquals(formatoBrasil.format(data), etiqueta.getDataFormatoBrasil());
	}
 
}
