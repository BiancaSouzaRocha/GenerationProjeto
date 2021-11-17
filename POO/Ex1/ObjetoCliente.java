package POO.Ex1;

public class ObjetoCliente {
	
	public static void main (String args []) {
		
		Cliente in = new Cliente("Bianca", "Rocha", "96590-5253", "Rua João e Maria", "biancasouzarocha90@gmail.com");
		
		System.out.printf("Nome: " + in.getNome());
		System.out.println(" " + in.getSobrenome());
		System.out.println("Telefone para contato: " + in.getTelefone());
		System.out.println("Endereço: " + in.getEndereco());
		System.out.println("E-mail: " +in.getEmail());
		
		
		
		
		
		
		
		
	}

}
;