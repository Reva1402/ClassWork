package Activity.One;

import java.util.Scanner;

public class Question90F {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // Scanner class to take the user input
        System.out.print("Please enter an input: ");// asking for user input
        int noOfInputs = kb.nextInt();
        numberIncrement(noOfInputs);

        kb.close();
        }

    public static void numberIncrement(int num){

        int input = num;
        int number = 1;

        for(int i =1; i<=input;i++){
            for(int j =1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }System.out.println();
        }

    }
}
