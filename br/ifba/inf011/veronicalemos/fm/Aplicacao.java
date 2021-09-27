package br.ifba.inf011.veronicalemos.fm;

public class Aplicacao {
	
	public void rodar()  throws InterruptedException{
		
		FiguraIF[] figuraGeo = new FiguraIF[3];
		
		figuraGeo[0] = (new QuadradoFactory("Quadrado")).createFigura();
		figuraGeo[1] = (new TrEquilateroFactory("Triangulo Equilátero")).createFigura();
		figuraGeo[2] = (new CirculoFactory("Círculo")).createFigura();
		
		figuraGeo[0].descricao("Quadrado");
		figuraGeo[1].descricao("Triângulo Equilátero");
		figuraGeo[2].descricao("Círculo");
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Aplicacao().rodar();

	}

}
