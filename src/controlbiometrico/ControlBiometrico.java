package controlbiometrico;

public class ControlBiometrico {
	private String nombreDelDispositivo;
	private Integer cantidadDeUsuariosQueSePuedenRegistrar;
	private Usuario usuariosRegistrados[];
	 

	public ControlBiometrico(String nombreDelDispositivo, Integer cantidadDeUsuariosQueSePuedenRegistrar) {
		this.nombreDelDispositivo = nombreDelDispositivo;
		this.cantidadDeUsuariosQueSePuedenRegistrar = cantidadDeUsuariosQueSePuedenRegistrar;
		this.usuariosRegistrados = new Usuario[cantidadDeUsuariosQueSePuedenRegistrar];
	}

	public Boolean registrarUsuario(Usuario nuevo) {
		for(int i = 0; i < usuariosRegistrados.length; i++) {
			if(this.usuariosRegistrados[i] == null) {
				this.usuariosRegistrados[i] = nuevo;
				return true;
			}
		}
		return false;
	}

	public Usuario obtenerUsuarioPorNumeroDeUsuario(Integer numeroDeUsuario) {
		Usuario usuarioBuscado = null;
		for(int i = 0; i < usuariosRegistrados.length; i++) {
			if(this.usuariosRegistrados[i] != null && this.usuariosRegistrados[i].getNumeroDeUsuario() == numeroDeUsuario) {
				usuarioBuscado = this.usuariosRegistrados[i];
			}
		}
		return usuarioBuscado;
	}

	public Usuario obtenerUsuarioGerenteDeMayorSueldo() {
		Usuario buscado = null;
		for(int i = 0; i < usuariosRegistrados.length; i++) {
			if(this.usuariosRegistrados[i] != null && this.usuariosRegistrados[i + 1] != null && this.usuariosRegistrados[i].getTipoDeEmpleado() == TipoDeEmpleado.GERENTE && this.usuariosRegistrados[i + 1].getTipoDeEmpleado() == TipoDeEmpleado.GERENTE) {
				if(this.usuariosRegistrados[i + 1].getSueldo() > this.usuariosRegistrados[i].getSueldo()) {
					buscado = this.usuariosRegistrados[i + 1];
				}
			}
		}
		return buscado;
	}
	
//	public Usuario obtenerUsuarioGerenteDeMayorSueldo() {
//		Usuario buscado = null;
//		for(int i = 0; i < usuariosRegistrados.length; i++) {
//			if(this.usuariosRegistrados[i] != null && this.usuariosRegistrados[i].getTipoDeEmpleado() == TipoDeEmpleado.GERENTE) {
//				for(int j = 0; j < usuariosRegistrados.length - 1; j++) {
//					if(this.usuariosRegistrados[j + 1].getSueldo() > this.usuariosRegistrados[j].getSueldo()) {
//						buscado = this.usuariosRegistrados[j + 1];
//					}
//				}
//				
//			}
//		}
//		return buscado;
//	}
}