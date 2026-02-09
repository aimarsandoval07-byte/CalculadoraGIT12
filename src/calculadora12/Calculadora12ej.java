package calculadora12;

public class Calculadora12ej {

		public int sumar(int a, int b) {
			return a + b;
		}
		public int potencia(int base, int exponente) {
			 int resultado = 1;
			 for (int i = 0; i < exponente; i++) {
				 resultado *= base;
			 }
			 return resultado;
		}
		public int modulo(int a, int b) {
			 return a % b;
		}
}
