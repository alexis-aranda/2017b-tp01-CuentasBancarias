package cuentasBancarias;

public class CuentasBancarias {

	private double fondos;
	
	public CuentasBancarias(){
		this.fondos=0;
	}
	
	public CuentasBancarias(double fondos){
		this.fondos=fondos;
	}
	
	public boolean transferirMontoHacia(CuentasBancarias destino, double monto){
		if(monto>this.fondos)
			return false;
		this.fondos=this.fondos-monto;
		destino.fondos=destino.fondos+monto;
		return true;
	}
	
	public double mostrarFondos(){
		return this.fondos;
	}
	
	
}
