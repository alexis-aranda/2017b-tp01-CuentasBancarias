package cuentasBancarias;

public class CuentasBancarias {

	private double fondos;
	
	public CuentasBancarias(){
		this.fondos=0;
	}
	
	public CuentasBancarias(double fondos){
		this.fondos=fondos;
	}
	
	public void transferirMontoHacia(CuentasBancarias destino, double monto){
		destino.fondos=200;
	}
	
	public double mostrarFondos(){
		return this.fondos;
	}
	
	
}
