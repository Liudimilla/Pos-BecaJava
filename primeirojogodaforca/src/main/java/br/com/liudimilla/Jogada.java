package br.com.liudimilla;

import java.util.Scanner;

public class Jogada {
	public static void main(String[] args) {
	String palavraChave = "milla";
	String letrasUsadas = "";
	String palavraAdivinhada = "";
	int MAX_TENTATIVAS = 7;

	
	//public void BuscarLetra
	for(int i = 0;i<palavraChave.length(); i++){
		palavraAdivinhada += " _ ";
		
		for(int tentativas = 0; ;tentativas++) {
			if(tentativas == MAX_TENTATIVAS) {
 				System.out.printf("Foram 7 tentativas...A palavra era '%s'",palavraChave);
				System.exit(0);
			}
			System.out.printf("Rodada %d. Ate agora adivinhada: %s. (Proxima letra ?%n", tentativas, palavraAdivinhada);
			
			char letraTentada = new Scanner(System.in).next().charAt(0);
			if(letrasUsadas.indexOf(letraTentada) >= 0) {
				System.out.printf("Voce ja tentou a letra %c. %n", letraTentada);
			}else {
				letrasUsadas += letraTentada;
				
				if(palavraChave.indexOf(letraTentada) >= 0) {
					palavraAdivinhada = "";
					
					//public void aparecerLetrar
					for(int j = 0; j < palavraChave.length();j++) {
						palavraAdivinhada += letrasUsadas.indexOf(palavraChave.charAt(j)) >= 0 ? palavraChave.charAt(j): " _ ";
					}
					if(palavraAdivinhada.contains(" _ ")) {
					System.out.printf("Acentou essa %s letra.%n", letraTentada);
				} else {
					System.out.printf("Parabens! A palavra adivinhada era '%s'",palavraAdivinhada);
					System.exit(0);
				}
					} else { 
					System.out.printf("Nao ha essa letra %c na palavra.", letraTentada);
				}
			}
		
		}
	}
	}
}

