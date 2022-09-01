package cajafuerte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaFuerteTest {
	@Test
	public void queSePuedaAbrirUnaCajaFuerteConUnCodigo() {
		Integer pss = 4815;
		CajaFuerte cf = new CajaFuerte(pss);
		assertNotNull(cf);
	}
	
	@Test
	public void queAlAbrirConPwCorrectaLaCajaFuerteSeAbra() {
		// 1- Creo caja fuerte con código
		// 2- Ingreso código correcto
		// 3- Abro caja fuerte con código
		// 4- Chequeo que esté abierta
		
		Integer codigo = 4815;
		CajaFuerte cf = new CajaFuerte(codigo);
		Boolean valorObtenido = cf.abrir(codigo);
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queAlIntentarAbrirConPssIncorrectaLaCajaFuerteNoSeAbra() {
		// 1- Creo caja fuerte con clave
		// 2- Intento abrir con un código distinto a la clave
		// 3- Verifico que la cf no se abre
		
		Integer codigo = 4815;
		CajaFuerte cf = new CajaFuerte(codigo);
		Integer passwordIncorrecta = 162342;
		Boolean valorObtenido = cf.abrir(passwordIncorrecta);
		assertFalse(valorObtenido);
	}
	
	@Test
	public void queSePuedaCambiarUnaPss() {
		// 1- Creo caja fuerte con código
		// 2- Ingreso la nueva contraseña
		// 3- Repito la nueva contraseña
		// 4- Verifico que pueda abrir la caja fuerte con la nueva contraseña
		
		Integer codigo = 4815;
		CajaFuerte cf = new CajaFuerte(codigo);
		Integer nuevaPss = 162342;
		Boolean valorObtenido = cf.abrir(nuevaPss);
		assertFalse(valorObtenido);
	}
}
