package LacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String args []) {
		
		Scanner n= new Scanner (System.in);
		int x, t=0, q=0; 
		
		do {
			System.out.print("Digite um valor: ");
			x = n.nextInt(); 
			q++;
			
			if (x%3 == 0) {
				t = t+x;
				
			}
			
		} while (x != 0);
		 		
		
		n.close();
		System.out.printf ("A m�dia dos valores multiplos de tr�s � %d", t/q);
		
		
	}	
	
}
