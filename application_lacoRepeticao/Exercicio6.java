package application_lacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String args []) {
		
		Scanner n= new Scanner (System.in);
		int valor, total=0, quantidade=0; 
		
		do {
			System.out.print("Digite um valor: ");
			valor = n.nextInt(); 
			
			if ((valor%3 == 0) && (valor != 0)) {
				total = total+valor;
				quantidade++;		
			}
			
		} while (valor != 0);
		 		
		
		n.close();
		System.out.printf ("A média dos valores multiplos de três é %d", total/quantidade);
		
		
	}	
	
}
