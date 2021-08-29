package entities;
// classe que implementa os calculos do retangulo e a formatação de exibição
public class RetanguloEx01 {
	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

	public String toString() {
		return "----------------------------------------------------\n"+"| "
				+"AREA = " + String.format("%.2f", area())+"| " 
				+ "PERIMETER = " + String.format("%.2f", perimeter())+"| "
				+ "DIAGONAL = " +
				 String.format("%.2f", diagonal())+" |"
				+ "\n----------------------------------------------------";
	}
}
