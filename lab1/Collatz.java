/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /**
     * Uses the Collatz sequence to determine the next number:
     * If the number is 1, the sequence is over
     * If the number is even, the next number is number / 2
     * If the number is odd, the next number is 3 * number + 1
     */
    public static int nextNumber(int n) {
        if(n == 1){
            return n;
        } else if (n % 2 == 0){
            return n/2;
        } else {
            return 3 * n + 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

