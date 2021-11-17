package Array1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String args []) {
		
		Scanner leia = new Scanner (System.in);
		int[] media =  new int [4];
		int notas=0; 
		
		for (int x=0 ; x < 4; x++) {
			System.out.println("Digite sua nota: ");
			media[x]=leia.nextInt();
			notas = notas + media[x];
			
		}
		
		leia.close();
		System.out.println("A média das notas digitadas foi "+notas/4);
			
		
	}

}
