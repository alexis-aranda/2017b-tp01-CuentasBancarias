package cuentasBancarias;

import org.junit.Test;
import org.junit.Assert;

public class CuentasBancariasTest {

	@Test
	public void queInicia(){
		CuentasBancarias nuevo = new CuentasBancarias();
		Assert.assertEquals(0,0,nuevo.mostrar());
		CuentasBancarias nuevo = new CuentasBancarias(500);
		Assert.assertEquals(500,nuevo.mostrar());
	}
	
	
	public static void main(String[] args) {
		
	}

}
