package cajafuerte;

public class CajaFuerte {

	private Integer pss;
	private Boolean abierta;

	public CajaFuerte(Integer pss) {
		this.pss = pss;
		this.abierta = false;
	}

	public Boolean abrir(Integer codigo) {
		if(this.pss.equals(codigo)) {
			this.abierta = true;
		}
		return abierta;
	}

}
