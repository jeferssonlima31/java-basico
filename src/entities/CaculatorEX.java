package entities;

public class CaculatorEX {
	public static final double PI = 3.1459;

	public static double circunference(double radius) {
		return 2 * PI * radius;
	}

	public static double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3.0;
	}
}
