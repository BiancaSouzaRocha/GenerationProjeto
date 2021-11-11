package LacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String args[]) {
		
		Scanner n = new Scanner (System.in);
		int idade, menores=0, maiores=0; 
		
		System.out.printf("Digite a sua idade: ");
		idade = n.nextInt();
		
			while (idade > -99) {
				if (idade < 21) {
				menores++;
				}
				else if (idade > 50) {
				maiores++;
				}
			System.out.printf("Digite a sua idade: ");
			idade = n.nextInt();
			
		}
			
			n.close();
			System.out.printf("Total de pessoas com menos de 21 anos: %d ",menores); 
			System.out.printf(" e o total de pessoas com mais de 50 anos: %d" ,maiores);
		
	}

}
