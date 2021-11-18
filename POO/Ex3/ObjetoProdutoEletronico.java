package POO.Ex3;

public class ObjetoProdutoEletronico {
	
	public static void main (String [] args ) {
		
		ProdutoEletronico p1 = new ProdutoEletronico (); 
		
			p1.setNome("Celular");
			p1.setCor ("Preto");
			p1.setMarca("Samsung");
			p1.setValor(450);
			p1.setLigar(true);
			
			
			p1.mostrar(); 
			p1.ligado();
			
		
	}

}
