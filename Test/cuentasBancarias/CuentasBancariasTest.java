package cuentasBancarias;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class CuentasBancariasTest {

	CuentasBancarias cuentadestino;
	CuentasBancarias cuentaorigen;
	@Before
	public void SetUp(){
		cuentaorigen = new CuentasBancarias();
		cuentadestino = new CuentasBancarias();
	}
	
	@Test
	public void queIniciaSinParametros(){
		CuentasBancarias cuentaorigen = new CuentasBancarias();
		Assert.assertEquals(0,0,cuentaorigen.mostrarFondos());
	}
	@Test
	public void queIniciaConParametros(){
		CuentasBancarias cuentaorigen = new CuentasBancarias(500);
		Assert.assertEquals(500,0, cuentaorigen.mostrarFondos());
	}
	
	public void queTransfieraMontos(){
		cuentaorigen.transferirMontoHacia(cuentadestino,200);
		Assert.assertEquals(200,0, cuentadestino.mostrarFondos());
		Assert.assertEquals(300,0, cuentaorigen.mostrarFondos());
	}
	
	public static void main(String[] args) {
		
	}

}
