import java.util.Scanner;

class EvenNumbersSum {
        public static void main(String args[]) {
                System.out.print("Enter n:");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int evenSum = 0;
                for (int i = 1; i < n; i++) {
                        if (i % 2 == 0) {
                                evenSum += i;
                        }
                }
                System.out.println("The sum of even numbers from 1 to " + n + " is " + evenSum);
        }
}