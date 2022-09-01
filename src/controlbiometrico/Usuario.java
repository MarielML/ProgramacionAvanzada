package controlbiometrico;

public class Usuario {
	private Integer numeroDeUsuario;
	private String apellido;
	private TipoDeEmpleado tipoDeEmpleado;
	private Integer sueldo;
	
	public Usuario(Integer numeroDeUsuario, String apellido, TipoDeEmpleado tipoDeEmpleado, Integer sueldo) {
		this.numeroDeUsuario = numeroDeUsuario;
		this.apellido = apellido;
		this.tipoDeEmpleado = tipoDeEmpleado;
		this.sueldo = sueldo;
	}

	public Integer getNumeroDeUsuario() {
		return numeroDeUsuario;
	}

	public void setNumeroDeUsuario(Integer numeroDeUsuario) {
		this.numeroDeUsuario = numeroDeUsuario;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TipoDeEmpleado getTipoDeEmpleado() {
		return tipoDeEmpleado;
	}

	public void setTipoDeEmpleado(TipoDeEmpleado tipoDeEmpleado) {
		this.tipoDeEmpleado = tipoDeEmpleado;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}
}
