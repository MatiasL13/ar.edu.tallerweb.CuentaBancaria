package ar.edu.tallerweb.CuentaBancaria;

public class CuentaBancaria {
	private double saldo;
	
	public CuentaBancaria(double saldo){
		this.saldo=saldo;
	}
	
	public boolean deposito(double aDepositar){
		if (aDepositar > 0 ){ 
				this.saldo= this.saldo+aDepositar;
				System.out.println("El Deposito fue exítoso y su saldo quedo en "+this.saldo);
				return true;
		}else{
			System.out.println("Ha ingresado un valor negativo.");
			return false;
		}

	}
	public boolean extraer(double aExtraer){
		if (aExtraer > 0 && aExtraer <= this.saldo ){
			this.saldo= this.saldo - aExtraer;
			System.out.println("Se ha extraido satisfactoriamente: "+aExtraer+" y ahora su saldo quedo en: "+ this.saldo );
			return true;
		}else{
			System.out.println("Ha ingresado un valor negativo o el valor que desea extraer supera al saldo actual en la cuenta.");
			return false;
		}

	}
	public double getSaldo(){
		System.out.println("Su saldo actual es de: "+ this.saldo);
		return this.saldo;
	}
}
