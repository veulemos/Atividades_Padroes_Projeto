package br.ifba.inf011.veronicalemos.fm;

//CONCRETEPRODUCT  em um Factory Method
public class TrEquilatero implements FiguraIF {
	
	String nomeFigura;
	String figura;
	
	public TrEquilatero(String nomeFigura) {
		this.setFigura(nomeFigura);
	}
	
	private void setFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
	
	public String getNomeFigura() {
		return nomeFigura;
	}
	
	private void imprimir() {
		//System.out.println("A figura é: " + this.nomeFigura);
		System.out.println("A figura é: " + this.figura);
	}
	
	@Override
	public void descricao(String nomeFigura) {
		this.figura = nomeFigura;
		if(nomeFigura.equalsIgnoreCase(this.getNomeFigura()))
			this.imprimir();
		
	}

}
