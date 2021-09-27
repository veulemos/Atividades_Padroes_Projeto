package br.ifba.inf011.veronicalemos.fm;
// CREATOR em Factory Method
public class QuadradoFactory extends FiguraFactory {
	
	public QuadradoFactory(String nomeFigura) {
		super(nomeFigura);
	}
	
	public QuadradoFactory() {
		super();
	}
	
	public FiguraIF createFigura() {
		return new Quadrado(this.nomeFigura);
	}

}
