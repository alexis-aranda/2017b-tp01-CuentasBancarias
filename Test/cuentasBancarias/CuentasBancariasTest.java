package cuentasBancarias;

import org.junit.Test;
import org.junit.Assert;

public class CuentasBancariasTest {

	@Test
	public void queIniciaSinParametros(){
		CuentasBancarias nuevo = new CuentasBancarias();
		Assert.assertEquals(0,0,nuevo.mostrar());
	}
	@Test
	public void queIniciaConParametros(){
		CuentasBancarias nuevo = new CuentasBancarias(500);
		Assert.assertEquals(500,0, nuevo.mostrar());
	}
	
	public static void main(String[] args) {
		
	}

}
