package cuentasBancarias;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class CuentasBancariasTest {

	CuentasBancarias cuentaorigen;
	CuentasBancarias cuentadestino;
	@Before
	public void SetUp(){
		cuentaorigen = new CuentasBancarias();
		cuentadestino = new CuentasBancarias();
	}
	
	@Test
	public void queIniciaSinParametros(){
		Assert.assertEquals(0,0,cuentaorigen.mostrarFondos());
	}
	@Test
	public void queIniciaConParametros(){
		CuentasBancarias cuenta1 = new CuentasBancarias();
		Assert.assertEquals(500,0, cuenta1.mostrarFondos());
	}
	
	public void queIniciaSinParametros(){
		Assert.assertEquals(0,0,cuentaorigen.transferirMontoHacia(cuentadestino));
	}
	
	public static void main(String[] args) {
		
	}

}
