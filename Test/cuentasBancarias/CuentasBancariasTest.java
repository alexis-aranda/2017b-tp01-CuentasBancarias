package cuentasBancarias;

import org.junit.Test;
import org.junit.Assert;

public class CuentasBancariasTest {

	@Test
	public void queInicia(){
		CuentasBancarias nueva = new CuentasBancarias();
		Assert.assertEquals(0,nuevo.mostrar());
	}
	
	public static void main(String[] args) {
		
	}

}
