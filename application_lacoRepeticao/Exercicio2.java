package application_lacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main (String args[]) {
		
		
		
		Scanner x = new Scanner (System.in);
		int par = 0, impar =0, valor;
		
		
		System.out.print ("Digite um valor: ");
		valor = x.nextInt();
		
		
		for (int n=0; n<10; n++) {
			
			if (valor%2 == 0) {
				par++;
			}
			
			else if (valor%2 !=0) {
				impar++;
					
			}	
			
			System.out.print("Digite um valor: ");
			valor = x.nextInt();
			
		}	
			x.close(); 
		 
			System.out.printf("O total de n�meros pares � de %d",par);
			System.out.printf(" e o total de n�meros impares � de %d",impar);
	}
}
