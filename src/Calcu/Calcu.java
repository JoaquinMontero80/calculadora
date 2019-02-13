package Calcu;

public class Calcu {
	private int num1;
	private int num2;
	
	public Calcu ( int a, int b ) {
		num1 = a;
		num2 = b;
	}
	
	public int suma () {
		int resul = num1 + num2;
		return resul;
	}
	
	public int resta() {
		int resul = num1 - num2;
		return resul;
	}
	
	public int multiplicar() {
		int resul = num1 * num2;
		return resul;
	}
	
	public int dividir() {
		int resul = num1 / num2;
		return resul;
	}

}
