package controlbiometrico;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControlBiometricoTest {
	@Test
	public void queSePuedaCrearUnControlBiometrico() {
		String nombreDelDispositivo = "CB";
		Integer cantidadDeUsuariosQueSePuedenRegistrar = 10;
		ControlBiometrico cb = new ControlBiometrico(nombreDelDispositivo, cantidadDeUsuariosQueSePuedenRegistrar);
		assertNotNull(cb);
	}
	
	@Test
	public void queSePuedaRegistrarUnUsuario() {
		String nombreDelDispositivo = "CB";
		Integer cantidadDeUsuariosQueSePuedenRegistrar = 10;
		ControlBiometrico cb = new ControlBiometrico(nombreDelDispositivo, cantidadDeUsuariosQueSePuedenRegistrar);
		Integer numeroDeUsuario = 5;
		String apellido = "Marmol";
		TipoDeEmpleado tipoDeEmpleado = TipoDeEmpleado.GERENTE;
		Integer sueldo = 500000;
		Usuario nuevo = new Usuario(numeroDeUsuario, apellido, tipoDeEmpleado, sueldo);
		Boolean valorObtenido = cb.registrarUsuario(nuevo);
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queSePuedaObtenerUnUsuarioPorSuNumeroDeUsuario() {
		String nombreDelDispositivo = "CB";
		Integer cantidadDeUsuariosQueSePuedenRegistrar = 10;
		ControlBiometrico cb = new ControlBiometrico(nombreDelDispositivo, cantidadDeUsuariosQueSePuedenRegistrar);
		Integer numeroDeUsuario = 5;
		String apellido = "Marmol";
		TipoDeEmpleado tipoDeEmpleado = TipoDeEmpleado.GERENTE;
		Integer sueldo = 500000;
		Usuario nuevo = new Usuario(numeroDeUsuario, apellido, tipoDeEmpleado, sueldo);
		cb.registrarUsuario(nuevo);
		Usuario obtenido = cb.obtenerUsuarioPorNumeroDeUsuario(numeroDeUsuario);
		assertNotNull(obtenido);
	}
	
	@Test
	public void queSePuedaObtenerElUsuarioGerenteDeMayorSueldo() {
		String nombreDelDispositivo = "CB";
		Integer cantidadDeUsuariosQueSePuedenRegistrar = 10;
		ControlBiometrico cb = new ControlBiometrico(nombreDelDispositivo, cantidadDeUsuariosQueSePuedenRegistrar);
		Integer numeroDeUsuario = 5;
		String apellido = "Marmol";
		TipoDeEmpleado tipoDeEmpleado = TipoDeEmpleado.GERENTE;
		Integer sueldo = 500000;
		Integer sueldo2 = 800000;
		Usuario nuevo = new Usuario(numeroDeUsuario, apellido, tipoDeEmpleado, sueldo);
		Usuario nuevo2 = new Usuario(numeroDeUsuario, apellido, tipoDeEmpleado, sueldo2);
		cb.registrarUsuario(nuevo);
		cb.registrarUsuario(nuevo2);
		Integer vo = cb.obtenerUsuarioGerenteDeMayorSueldo().getSueldo();
		assertEquals(vo, sueldo2);
	}		
}
