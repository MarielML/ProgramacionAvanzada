package cuenta;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTestDos {

	@Test
	public void queAlCrearLaCuentaSuSaldoSeaCero(){
		Double ve = 0.0;
		Cuenta cuenta = new Cuenta(0.0); //Preparación
		Double vo = cuenta.getSaldo(); //Ejecución
		Assert.assertEquals(ve, vo);//Contrastación
	}
	
	@Test
	public void queAlAgregarSaldoALaCuentaElMismoSeIncremente() {
		Double ve = 100.0;
		Double monto = 100.0;
		Cuenta cuenta = new Cuenta(0.0);
		cuenta.depositar(monto);
		Double vo = cuenta.getSaldo();
		Assert.assertEquals(ve, vo);
	}

	@Test
	public void queAlRetirarSaldoACuentaElMismoSeDecremente() {
		Double ve = 50.0;
		Double deposito = 100.0;
		Double extraccion = 50.0;
		Cuenta cuenta = new Cuenta(0.0);
		cuenta.depositar(deposito);
		cuenta.extraer(extraccion);
		Double vo = cuenta.getSaldo();
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	public void queNopuedoExtraerUnMontoSuperiorAlSaldoDeLaCuenta() {
		Double ve = 100.0;
		Double deposito = 100.0;
		Double extraccion = 200.0;
		Cuenta cuenta = new Cuenta(0.0);
		cuenta.depositar(deposito);
		cuenta.extraer(extraccion);
		Double vo = cuenta.getSaldo();
		Assert.assertEquals(ve, vo);
	}

	@Test
	public void queNoPuedoDepositarValorNegativo() {
		Double ve = 0.0;
		Double deposito = -100.0;
		Cuenta cuenta = new Cuenta(0.0);
		cuenta.depositar(deposito);
		Double vo = cuenta.getSaldo();
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	public void queNoPuedoExtraerValorNegativo() {
		Double ve = 0.0;
		Double extraccion = -100.0;
		Cuenta cuenta = new Cuenta(0.0);
		cuenta.extraer(extraccion);
		Double vo = cuenta.getSaldo();
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	public void queSePuedaTranferirDineroAOtraCuenta() {
		Double veCuentaOrigen = 150.0;
		Double veCuentaDestino = 50.0;
		Double deposito = 200.0;
		Double extraccion = 50.0;
		Cuenta cuentaOrigen = new Cuenta(0.0);
		Cuenta cuentaDestino = new Cuenta(0.0);
		cuentaOrigen.depositar(deposito);
		cuentaOrigen.tranferir(cuentaDestino, extraccion);
		Double voOrigen = cuentaOrigen.getSaldo();
		Double voDestino = cuentaDestino.getSaldo();
		Assert.assertEquals(veCuentaOrigen, voOrigen);
		Assert.assertEquals(veCuentaDestino, voDestino);
	}
	
	@Test
	public void queNoSePuedaTranferirMontoNegativoAOtraCuenta() {
		Double veCuentaOrigen = 200.0;
		Double veCuentaDestino = 0.0;
		Double deposito = 200.0;
		Double extraccion = -50.0;
		Cuenta cuentaOrigen = new Cuenta(0.0);
		Cuenta cuentaDestino = new Cuenta(0.0);
		cuentaOrigen.depositar(deposito);
		cuentaOrigen.tranferir(cuentaDestino, extraccion);
		Double voOrigen = cuentaOrigen.getSaldo();
		Double voDestino = cuentaDestino.getSaldo();
		Assert.assertEquals(veCuentaOrigen, voOrigen);
		Assert.assertEquals(veCuentaDestino, voDestino);
	}
	
	@Test
	public void queNoSePuedaTranferirSinMontoSufuciente() {
		Double veCuentaOrigen = 200.0;
		Double veCuentaDestino = 0.0;
		Double deposito = 200.0;
		Double extraccion = 500.0;
		Cuenta cuentaOrigen = new Cuenta(0.0);
		Cuenta cuentaDestino = new Cuenta(0.0);
		cuentaOrigen.depositar(deposito);
		cuentaOrigen.tranferir(cuentaDestino, extraccion);
		Double voOrigen = cuentaOrigen.getSaldo();
		Double voDestino = cuentaDestino.getSaldo();
		Assert.assertEquals(veCuentaOrigen, voOrigen);
		Assert.assertEquals(veCuentaDestino, voDestino);
	}
}
