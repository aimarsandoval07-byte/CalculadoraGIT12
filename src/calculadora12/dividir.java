package calculadora12;

public class dividir {
	
	public double dividir(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir entre cero");
		}
		return (double) a / b;
	}
}
