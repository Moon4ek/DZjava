package bne;

public class LastDignits {

	public static void main(String[] args){
        System.out.println(lastDigit(3572));  
        System.out.println(lastDigit(-947));  
    }

    public static int lastDigit(int number){
        
        int absoluteNumber = Math.abs(number);

        
        int lastDigit = absoluteNumber % 10;

        return lastDigit;
    }
}
