package ar.edu.tallerweb.CuentaBancaria;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaBancaria {
	@Test
	public void testDeposito(){
		CuentaBancaria cuentaPrueba=new CuentaBancaria(0.0);
		cuentaPrueba.deposito(1500.0);
		Assert.assertTrue(1500.0 == cuentaPrueba.getSaldo());
	}
	@Test
	public void testExtraccion(){
		CuentaBancaria cuentaPrueba=new CuentaBancaria(1500.0);		
		Assert.assertTrue(cuentaPrueba.extraer(80.0)==true);
	}
	@Test
	public void testGetSaldo(){
		CuentaBancaria cuentaPrueba=new CuentaBancaria(0.0);		
		Assert.assertTrue(cuentaPrueba.getSaldo()==0);
	}
}
