package POO.Ex2;

public class ObjetoAviao {

	public static void main(String[] args) {
		
		Aviao in = new Aviao ("Avianca", "Bras�lia", "Na pista para decolagem", 15); 
		
		
		System.out.println("------- DADOS DA SUA VIAGEM ---------");
		System.out.println("Companhia Aerea: " +in.getCompanhiaAerea());
		System.out.println("Destino: " +in.getDestino());
		System.out.println("Situa��o do voo: " + in.getSituacao());
		System.out.println("N�mero da sua poltrona: " + in.getAssento());
		
		

	}

}
