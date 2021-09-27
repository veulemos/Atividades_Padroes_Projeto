package br.ifba.inf011.veronicalemos.fm;

//CREATOR em Factory Method
public class CirculoFactory extends FiguraFactory {
	public CirculoFactory(String nomeFigura) {
		super(nomeFigura);
	}
	
	public CirculoFactory() {
		super();
	}
	
	public FiguraIF createFigura() {
		return new Circulo(this.nomeFigura);
	}

}
