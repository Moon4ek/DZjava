package bne;

public class hypotenuse {
	public static void main(String[] args) {
        double res = hypotenuce(4.0, 3.0);
        System.out.println(res);
    }
    public static double hypotenuce(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }}