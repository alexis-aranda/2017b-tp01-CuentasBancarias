package cuentasBancarias;

import org.junit.Test;

import org.junit.Assert;

public class CuentaBancariaTest {

	@Test
	public void queInicia() {
		CuentaBancaria c= new CuentaBancaria();
		Assert.assertEquals(0, c.mostrar(),0);
		
	}

}
