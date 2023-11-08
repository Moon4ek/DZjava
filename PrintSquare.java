package bne;

public class PrintSquare {

	public static void main(String[] args) {
		int min = 3;
        int max = 7;

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}