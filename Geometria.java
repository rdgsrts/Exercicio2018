import java.util.ArrayList;


public class Geometria {
	public static void main(String[] args) {
		ArrayList<Geometria>figuras = new ArrayList<>();
		
		figuras.add(new Losango(""));
		figuras.add(new Triangulo(""));
		figuras.add(new Quadrado(""));
		figuras.add(new Circulo(""));
		
		for(Figuras fig:figuras){
		
		
					System.out.println(fig.getLosango());
					System.out.println(fig.getTriangulo());
					System.out.println(fig.getQuadrado());
					System.out.println(fig.getCirculo());
		
		
			}
		}
	}

}
