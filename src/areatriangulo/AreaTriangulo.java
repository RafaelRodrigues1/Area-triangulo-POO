package areatriangulo;

/**
 * @author RafaelRodrigues1
 */
public class AreaTriangulo {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo();
		t1.insereLados();
		System.out.print("Os lados do t1 s�o: ");
		t1.mostraLados();
		double areaT1 = t1.calculaArea();
		System.out.printf("A Area do tri�ngulo t1 �: %.3f\n", areaT1);

	}

}
