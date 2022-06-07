
public class Quadrado {
	public static double area(double lado) {
		if(lado <0) {
			throw new IllegalArgumentException("Lado deve possuir valor positivo");
		}
		double areaQuadrado = lado*lado;
		return areaQuadrado;
	}
}
