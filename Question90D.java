package Activity.One;

import java.util.Scanner;

public class Question90D {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // Scanner class to take the user input
        System.out.print("Please enter an input: ");// asking for user input
        int noOfInputs = kb.nextInt();
        completePyramid(noOfInputs);

        kb.close();
    }

    public static void completePyramid(int num) {

        int input = num;

        if(num%2==0){
            input = num+1;
        }else{
            input = num;
        }
        int lines = input/2;
        lines = lines+1;
        int i = 0;
        int j = 0;
        for (i = 1; i <= lines; i++) {
            for (j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (i = lines; i >= 1; i--) {
            for (j = 0; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
