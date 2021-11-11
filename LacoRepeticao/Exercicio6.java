package LacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String args []) {
		
		Scanner n= new Scanner (System.in);
		int x, t=0, q=0; 
		
		do {
			System.out.print("Digite um valor: ");
			x = n.nextInt(); 
			
			if ((x%3 == 0) && (x != 0)) {
				t = t+x;
				q++;
				
			}
			
		} while (x != 0);
		 		
		
		n.close();
		System.out.printf ("A média dos valores multiplos de três é %d", t/q);
		
		
	}	
	
}
