package bne;

public class PrintGridd {
	public static void main(String[] args) {
		
printGrid(4, 6);
}

public static void printGrid(int rows, int columns) {
    int value = 1;

    for (int row = 1; row <= rows; row++) {
        for (int col = 0; col < columns; col++) {
            System.out.print(value + " ");
            value += rows;
        }
        value = row + 1;
        System.out.println();
    }
}

}

			
			

