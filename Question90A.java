package Activity.One;

import java.util.Scanner;

public class Question90A {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in); // Scanner class to take the user input
        System.out.print("Please enter an input: ");// asking for user input
        int userNum = kb.nextInt();
        System.out.println(reversePyramidNumber(userNum));
        kb.close();

    }

    public static String reversePyramidNumber(int userNum) {
        if (userNum < 1) {
            System.out.println("Not a valid input.");
        } else {
            int i = 0;
            int j = 0;

            for (i =0; i<= userNum;i++) {
                for (j = i; j >=0;j--) {
                    System.out.print(userNum-j);
                }
                System.out.println();
            }
        }
        return "";

    }

}
