package application_lacoCondicional;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String args []) {
		
		Scanner leia= new Scanner (System.in); 
		int numero, resp; 
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		leia.close();
		
		if (numero %2 == 0) {
			System.out.print("Esse n�mero � par");
			resp = (int) Math.sqrt(numero);
			System.out.printf(" e a sua raiz quadrada � %d",resp);
		}
		else if (numero %2 != 0) {
			System.out.print("Esse n�mero � impar");
			resp= (int) Math.pow(numero, 2);
			System.out.printf(" e exponencial dele � %d", resp);
			
			
		}
		
		
	}

}
