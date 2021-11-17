package Array1;

import java.util.Scanner;

public class Exercicio2 {
	

	public static void main (String args []) {
		
		
		Scanner leia = new Scanner (System.in);
		int [][] notas = new int [3][4]; 
		int soma=0, contador=0;
				
		for (int linha=0; linha<3; linha++ ) {
			for (int coluna=0; coluna<4; coluna++) {
				System.out.print("Digite sua nota do aluno " +linha+ " "); 
				notas[linha][coluna] = leia.nextInt();
				soma = soma + notas[linha][coluna];
				contador++;
				
			}
		}
		
		leia.close();
		System.out.print(soma/contador);
	}

}
