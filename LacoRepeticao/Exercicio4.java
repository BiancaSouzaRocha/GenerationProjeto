package LacoRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String args []) {
		
		Scanner n = new Scanner (System.in);
		int idade, sexo, humor=0, totalDePessoas=0, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0,
		outrosCalmos=0, pessoasNervosasMais40=0, pessoasCalmasMais18=0; 
		
		
		
		while (totalDePessoas<1) {
			
			System.out.print ("Digite a sua idade: ");
			idade = n.nextInt();
			System.out.print ("Digite o seu sexo (1 - feminino, 2- masculino e 3 - outro): ");
			sexo = n.nextInt();
			System.out.print("Digite se você é calmo (1), nervoso (2) ou  agressivo (3): "); 
			humor = n.nextInt();
			totalDePessoas++;
			
					
			if (humor==1) {
				pessoasCalmas++;
			}
			if ((sexo == 1) && (humor==2)) {
				mulheresNervosas++;
			}
			if ((sexo==2) && (humor==3)) {
				homensAgressivos++;	
			}
			if ((sexo==3) && (humor==1)){
				outrosCalmos++;
			}	
			if ((humor==2) && (idade >= 40)) {
				pessoasNervosasMais40++;
			}
			if ((humor==1) && (idade <=18)) {
				pessoasCalmasMais18++;
				
			}
		}
		
		    n.close();
			System.out.printf("Número de pessoas calmas: %d",pessoasCalmas);
			System.out.printf("\nNúmero de mulheres nervosas: %d",mulheresNervosas);
			System.out.printf("\nNúmero de homens agressivos: %d",homensAgressivos);
			System.out.printf("\nNúmero de outros calmos: %d",outrosCalmos);
			System.out.printf("\nNúmero de pessoas nervosas com mais de 40 anos: %d",pessoasNervosasMais40);
			System.out.printf("\nNúmero de pessoas calmas com menos de 18 anos: %d",pessoasCalmasMais18);
		
		
	}

}
