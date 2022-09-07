package cuenta;

public class Cuenta {

	private Double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double monto) {
		if(monto >= 0.0) {
			this.saldo += monto;
		}
	}

	public void extraer(Double monto) {
		if(monto <= this.saldo && monto >= 0) {
			this.saldo -= monto;
		}
	}

	public void tranferir(Cuenta cuentaDestino, Double monto) {
		if(monto <= this.saldo) {
			this.extraer(monto);
			cuentaDestino.depositar(monto);
		}	
	}
}
