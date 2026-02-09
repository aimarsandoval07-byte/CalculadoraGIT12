package calculadora12;

public class dividir {
	
	public double dividir(int a, int b) {
		if (b == 0) {
			System.out.println("Error division entre 0");
		}
		return (double) a / b;
	}
}
