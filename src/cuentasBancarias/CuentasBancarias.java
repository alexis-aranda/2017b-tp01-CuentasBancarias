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
		this.fondos=this.fondos-monto;
		destino.fondos=destino.fondos+monto;
	
		
	}
	
	public double mostrarFondos(){
		return this.fondos;
	}
	
	
}
