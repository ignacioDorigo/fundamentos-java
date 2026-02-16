package ahorcado;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {

		int vidas = 10;
		String palabraSecreta = "argentina";

		String pistas = crearPistaInicial(palabraSecreta);
		boolean gano = false;

		Scanner scan = new Scanner(System.in);

		while (vidas > 0 && gano == false) {
			System.out.println("----------- INTENTO " + vidas + " ----------------");
			System.out.println("VIDAS:" + vidas);
			if (palabraSecreta.equals(pistas)) {
				gano = true;
				break;
			} else {
				System.out.println("CANTIDAD LETRAS:" + pistas.length());
				System.out.println("PALABRA SECRETA: " + pistas);
				System.out.print("INGRESE UNA LETRA: ");
				String ingresoUsuario = scan.next();
				char letraUsuario = ingresoUsuario.toLowerCase().charAt(0);
				String intento = adivinar(palabraSecreta, pistas, letraUsuario);
				if (intento.equals(pistas)) {
					System.out.println("ERROR--> Letra equivocada o Repetida");
					vidas = vidas - 1;
				} else {
					System.out.println("ACIERTO--> LA LETRA "+letraUsuario+" ESTA EN LA PALABRA");
					pistas = intento;
				}

			}

		}
		scan.close();
		System.out.println("----------GAME OVER----------");
		if (gano) {
			System.out.println("GANASTE");
		} else if (vidas == 0) {
			System.out.println("PERDISTE, TE QUEDASTE SIN VIDAS");

		}
	}

	public static String crearPistaInicial(String palabraSecreta) {
		String nueva = "";
		for (int i = 0; i < palabraSecreta.length(); i++) {
			nueva = nueva + "_";
		}

		return nueva;
	}

	public static String adivinar(String palabraSecreta, String pista, char letraUsuario) {
		String nueva = "";
		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (letraUsuario == palabraSecreta.charAt(i)) {
				nueva = nueva + letraUsuario;
			} else {
				nueva = nueva + pista.charAt(i);
			}
		}
		return nueva;

	}

}
