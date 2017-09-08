package cuentasBancarias;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class CuentasBancariasTest {

	CuentasBancarias cuentadestino;
	CuentasBancarias cuentaorigen;
	@Before
	public void SetUp(){
		cuentaorigen = new CuentasBancarias(500);
		cuentadestino = new CuentasBancarias();
	}
	
	@Test
	public void queIniciaSinParametros(){
		Assert.assertEquals(0.0,cuentadestino.mostrarFondos(),0);
	}
	@Test
	public void queIniciaConParametros(){
		Assert.assertEquals(500.0, cuentaorigen.mostrarFondos(),0);
	}
	@Test
	public void queTransfieraMontos(){
		cuentaorigen.transferirMontoHacia(cuentadestino,200);
		Assert.assertEquals(200.0, cuentadestino.mostrarFondos(),0);
		Assert.assertEquals(300.0, cuentaorigen.mostrarFondos(),0);
		cuentaorigen.transferirMontoHacia(cuentadestino,100);
		Assert.assertEquals(300.0, cuentadestino.mostrarFondos(),0);
		Assert.assertEquals(200.0, cuentaorigen.mostrarFondos(),0);
		cuentaorigen.transferirMontoHacia(cuentadestino,50);
		Assert.assertEquals(350.0, cuentadestino.mostrarFondos(),0);
		Assert.assertEquals(150.0, cuentaorigen.mostrarFondos(),0);
		boolean ret=cuentaorigen.transferirMontoHacia(cuentadestino,250);
		Assert.assertEquals(false,ret);
		ret=cuentaorigen.transferirMontoHacia(cuentadestino,50);
		Assert.assertEquals(true,ret);
		Assert.assertEquals(400.0, cuentadestino.mostrarFondos(),0);
		Assert.assertEquals(100.0, cuentaorigen.mostrarFondos(),0);
		ret=cuentaorigen.transferirMontoHacia(cuentadestino,100);
		Assert.assertEquals(true,ret);
		Assert.assertEquals(500.0, cuentadestino.mostrarFondos(),0);
		Assert.assertEquals(0.0, cuentaorigen.mostrarFondos(),0);
		
	}
	

}
