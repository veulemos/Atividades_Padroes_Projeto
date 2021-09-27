package br.ifba.inf011.veronicalemos.fm;

public enum TipoFigura {
	
	QUADRADO("br.ifba.inf011.fm.QuadradoFactory"),
	CIRCULO("br.ifba.inf011.fm.CirculoFactory"),
	TRIANGULOEQUILATERO("br.ifba.inf011.TrEquilateroFactory");
	
	String className;

	private TipoFigura(String className) {
		this.className = className;
	}
	
	public String getFactoryName() {
		return this.className;
	}

}
