package Activity.One;

import java.util.Scanner;

public class Question90C {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // Scanner class to take the user input
        System.out.print("Please enter an input: ");// asking for user input
        int noOfInputs = kb.nextInt();
        starPrint(noOfInputs);

        kb.close();
    } public static void starPrint(int num){

        int input = num;
        for(int i = 0; i<input;i++){
            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<input-i;k++){
                System.out.print("* ");
            }System.out.println();
        }


    }
}
