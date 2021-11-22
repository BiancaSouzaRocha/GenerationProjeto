package applicatioon_poo.application03;

public class ProdutoEletronico {
	
	String nome; 
	String marca; 
	String cor;
	boolean ligar;
	int valor; 
	

	public void mostrar () {
		System.out.println("--------- ASSISTÊNCIA TÉCNICA -----------");
		System.out.println("Tipo do produto: " + nome);
		System.out.println("A marca do seu produto é: "+ marca);
		System.out.println("Cor do produto: " + cor);
		System.out.println("O produto está ligado? " + ligar);
		System.out.println("Valor a ser pago pelo serviço: R$ "+ valor);
		System.out.println("-----------------------------------------");

	}
	
	public void ligado () {
		if (this.ligar == true) {
			System.out.println (nome + " está pronto para uso!");
		} else {
			System.out.println (nome + "ainda está em manutenção");
		}
	}
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public boolean isLigar() {
		return ligar;
	}


	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


}
