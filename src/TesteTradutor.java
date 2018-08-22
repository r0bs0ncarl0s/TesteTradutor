import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TesteTradutor {

	private Tradutor t;	
	
	@Before
	public void inicializarTradutor() {
		t = new Tradutor();
	}

	@Test
	public void tradutorSemPalavras() {
		assertTrue(t.estaVazia());
	}

	@Test
	public void traduzirFrase() {
		try {
			t.setarIdioma(Constantes.IDX_INGLES);
			assertEquals(t.traduzir("guerra").concat(Constantes.SEPARADOR_FRASE).concat(t.traduzir("é")).concat(Constantes.SEPARADOR_FRASE).concat(t.traduzir("ruim")), t.traduzir("guerra é ruim"));
		} catch (TradutorException e) {			
			e.printStackTrace();
		}
	}
	
	@Test
	public void traduzirFraseParaIngles() {
		try {
			t.setarIdioma(Constantes.IDX_INGLES);
			assertEquals("the war is bad", t.traduzir("a guerra é ruim"));
		} catch (TradutorException e) {			
			e.printStackTrace();
		}
	}
	
	@Test
	public void traduzirFraseParaFrances() {
		try {
			t.setarIdioma(Constantes.IDX_FRANCES);
			assertEquals("à la guerre et mauvais", t.traduzir("a guerra é ruim"));
		} catch (TradutorException e) {			
			e.printStackTrace();
		}
	}
	
	@Test
	public void traduzirFraseParaAlemao() {
		try {
			t.setarIdioma(Constantes.IDX_ALEMAO);
			assertEquals("zu krieg und schlecht", t.traduzir("a guerra é ruim"));
		} catch (TradutorException e) {			
			e.printStackTrace();
		}
	}
}
