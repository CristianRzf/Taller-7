package Punto4;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 1500;
		int Y = 0;
		int resultado;

		try {
			resultado = X / Y;
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("ES UNA INDETERMINACIÓN, NO ES POSIBLE REALIZAR ESTA OPERACIÓN");
		}
	}
}
