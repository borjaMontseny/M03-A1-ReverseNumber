import java.util.Scanner;

public class Main { // borjaMontseny DAW2 M3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A1 - Reverse Number\n");

		Scanner sc = new Scanner(System.in);

		int numeroIntroducido = 0;

		do {
			System.out.print("Número: ");
			numeroIntroducido = sc.nextInt();
			System.out.println(anunciarResultado(esReversible(numeroIntroducido)) + "\n");
		} while (numeroIntroducido != 0);

		sc.close();

	}

	public static int revertirNumero(int numero) {
		int[] digitos = new int[String.valueOf(numero).length()];
		int indice = 0;

		while (numero > 0) {
			digitos[indice] = numero % 10;
			numero = numero / 10;
			indice++;
		}

		int numeroRevertido = 0;
		for (int i = 0; i < digitos.length; i++) {
			numeroRevertido = numeroRevertido * 10 + digitos[i];
		}

		return numeroRevertido;
	}

	public static boolean esReversible(int numero) {

		int sumaNumeros = numero + revertirNumero(numero);

		if (sumaNumeros % 2 == 1) {
			return true; // És impar, és reversible
		} else {
			return false; // És par, no reversible
		}
	}

	public static String anunciarResultado(boolean resultado) {
		if (resultado) {
			return "SI";
		} else {
			return "NO";
		}
	}

}
