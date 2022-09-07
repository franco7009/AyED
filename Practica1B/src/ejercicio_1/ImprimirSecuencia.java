package ejercicio_1;

public class ImprimirSecuencia {
	
	public static void imprimirConFor(int desde, int hasta) {
		for (int i = desde; i <= hasta; i++){
			System.out.println(i);
		}
	}
	
	public static void imprimirConWhile(int desde, int hasta) {
		while(desde <= hasta) {
			System.out.println(desde++);
		}
	}
	
	public static void imprimirConRecursion(int desde, int hasta) {
		if (desde <= hasta) {
			System.out.println(desde++);
			ImprimirSecuencia.imprimirConRecursion(desde, hasta);
		}
	}

}
