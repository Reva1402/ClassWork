package Activity.One;

import java.util.Scanner;

public class Question90G {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // Scanner class to take the user input
        System.out.print("Please enter an input: ");// asking for user input
        int noOfInputs = kb.nextInt();
        palindromeNumber(noOfInputs);

        kb.close();
    }

    public static void palindromeNumber(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    }

