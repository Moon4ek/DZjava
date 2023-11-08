package bne;

public class distance {
	public static void main(String[] args) {
        double res = distanse(10,2,3,15);
        System.out.println(res);
    }
    public static double distanse(int x1, int y1, int x2, int y2) {
        double newX1 = x1;
        double newX2 = x2;
        double newY1 = y1;
        double newY2 = y2;
        return Math.sqrt((newY2 - newY1) * (newY2 - newY1) + (newX2 - newX1) * (newX2 - newX1));
    }
}