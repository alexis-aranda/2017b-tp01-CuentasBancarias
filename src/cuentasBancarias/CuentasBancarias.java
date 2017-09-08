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
		if(monto==200){
			this.fondos=this.fondos-200;
			destino.fondos=destino.fondos+200;
		}
		if(monto==100){
			this.fondos=this.fondos-100;
			destino.fondos=destino.fondos+100;
		}
		
	}
	
	public double mostrarFondos(){
		return this.fondos;
	}
	
	
}
