package ar.edu.tallerweb.CuentaBancaria;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaBancaria {
	@Test
	public void testDeposito(){
		System.out.println("Test Deposito");
		CuentaBancaria cuentaPrueba=new CuentaBancaria(0.0);
		cuentaPrueba.deposito(1500.0);
		Assert.assertTrue(1500.0 == cuentaPrueba.getSaldo());
		cuentaPrueba.deposito(-1520);
		Assert.assertTrue(-1520 != cuentaPrueba.getSaldo());
	}
	@Test
	public void testExtraccion(){
		System.out.println("Test Extraccion");
		CuentaBancaria cuentaPrueba=new CuentaBancaria(1500.0);		
		Assert.assertTrue(cuentaPrueba.extraer(80.0)==true);
		Assert.assertTrue(cuentaPrueba.extraer(1420.0)==true);
		Assert.assertTrue(cuentaPrueba.extraer(10)==false);
	}
	@Test
	public void testGetSaldo(){
		System.out.println("Test Consulta Saldo");
		CuentaBancaria cuentaPrueba=new CuentaBancaria(0.0);		
		Assert.assertTrue(cuentaPrueba.getSaldo()==0);
	}
}
