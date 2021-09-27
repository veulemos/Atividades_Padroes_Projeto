package br.ifba.inf011.veronicalemos.fm;

//CREATOR em Factory Method
public class TrEquilateroFactory extends FiguraFactory {
	
	public TrEquilateroFactory(String nomeFigura) {
		super(nomeFigura);
	}
	
	public TrEquilateroFactory() {
		super();
	}
	
	public FiguraIF createFigura() {
		return new TrEquilatero(this.nomeFigura);
	}

}
