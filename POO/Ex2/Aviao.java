package POO.Ex2;

public class Aviao {
	
	private String CompanhiaAerea;
	private String Destino; 
	private String Situacao; 
	private int Assento;
	
	
	public Aviao (String CompanhiaAerea, String Destino, String Situacao, int Assento)
	{
		this.CompanhiaAerea= CompanhiaAerea;
		this.Destino = Destino; 
		this.Situacao = Situacao; 
		this.Assento = Assento;
	}


	public String getCompanhiaAerea() {
		return CompanhiaAerea;
	}


	public void setCompanhiaAerea(String companhiaAerea) {
		CompanhiaAerea = companhiaAerea;
	}


	public String getDestino() {
		return Destino;
	}


	public void setDestino(String destino) {
		Destino = destino;
	}


	public String getSituacao() {
		return Situacao;
	}


	public void setSituacao(String situacao) {
		Situacao = situacao;
	}


	public int getAssento() {
		return Assento;
	}


	public void setAssento(int assento) {
		Assento = assento;
	}



	
	
	


	
	
	
	
	
	
	
	
	
	
	 

}
