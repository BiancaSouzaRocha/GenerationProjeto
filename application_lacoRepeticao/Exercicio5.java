package application_lacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String args []) {
		
		Scanner n = new Scanner (System.in);
		int valor, soma=0;
		
	
		 do {
			System.out.print("Digite um valor no teclado: ");
			valor = n.nextInt(); 
			soma += valor;
		 } while (valor != 0);
	
		n.close();
		System.out.printf("A soma dos n�meros digitados � %d",soma);
		
	}
			
}
