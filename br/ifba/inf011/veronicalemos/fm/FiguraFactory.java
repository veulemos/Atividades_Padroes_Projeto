package br.ifba.inf011.veronicalemos.fm;

import java.util.HashMap;
import java.util.Map;

// CREATOR em um Factory Method
public abstract class FiguraFactory {
	protected String nomeFigura;
	
	public static void createFigFactory() {
		
		TrEquilateroFactory trEq = new TrEquilateroFactory();
		QuadradoFactory qd = new QuadradoFactory();
		CirculoFactory circ = new CirculoFactory();
		Map<String, FiguraFactory> figurasFactory = new HashMap<>();
		figurasFactory.put("Triângulo Equilátero", trEq);
		figurasFactory.put("Quadrado", qd);
		figurasFactory.put("Círculo", circ);
	}
	
	/*public static FiguraFactory getFactory(String factoryName) {
		if(factoryName.equalsIgnoreCase("QUADRADO"))
			return new QuadradoFactory();
		else if(factoryName.equalsIgnoreCase("TRIANGULOEQUILATERO"))
			return new TrEquilateroFactory();
		else if(factoryName.equalsIgnoreCase("CIRCULO"))
			return new CirculoFactory();
		else 
			return null;
	}*/
	
	public FiguraFactory() {
		this.nomeFigura = " ";
	}
	
	public FiguraFactory(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
	
	public abstract FiguraIF createFigura();
	
	public FiguraIF getFigura() {
		FiguraIF fig = this.createFigura();
		fig.descricao(this.nomeFigura);
		return fig;
	}
	
	public FiguraIF getFigura(String nomeFigura) {
		FiguraIF fig = this.createFigura();
		fig.descricao(nomeFigura);
		return fig;
	}

}
