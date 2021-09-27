package br.ifba.inf011.veronicalemos.fm;

//CONCRETEPRODUCT  em um Factory Method
public class Circulo implements FiguraIF {
	String nomeFigura;
	String figura;
	public Circulo(String nomeFigura) {
		this.setFigura(nomeFigura);
	}
	
	private void setFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
	
	public String getNomeFigura() {
		return nomeFigura;
	}
	
	private void imprimir() {
		System.out.println("A figura é: " + this.figura);
	}
	
	@Override
	public void descricao(String nomeFigura) {
		//this.setFigura(nomeFigura);
		this.figura = nomeFigura;
		if(nomeFigura.equalsIgnoreCase(this.getNomeFigura()))
			this.imprimir();
		
	}

}
