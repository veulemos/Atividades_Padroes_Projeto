package br.ifba.inf011.veronicalemos.fm;

public class Aplicacao {
	
	public void rodar()  throws InterruptedException{
		
		FiguraIF[] figuraGeo = new FiguraIF[3];
		
		figuraGeo[0] = (new QuadradoFactory("Quadrado")).createFigura();
		figuraGeo[1] = (new TrEquilateroFactory("Triangulo Equil�tero")).createFigura();
		figuraGeo[2] = (new CirculoFactory("C�rculo")).createFigura();
		
		figuraGeo[0].descricao("Quadrado");
		figuraGeo[1].descricao("Tri�ngulo Equil�tero");
		figuraGeo[2].descricao("C�rculo");
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Aplicacao().rodar();

	}

}
