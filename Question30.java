package Activity.One;

import java.util.Scanner;
public class Question30 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in); // Scanner class to take the user input
        System.out.print("Please enter a number: ");// asking for user input
        int noOfInputs1 = kb.nextInt();
        System.out.print(sumOFNaturalNo(noOfInputs1));
        kb.close();
    }

    public static int sumOFNaturalNo(int noOfInputs1) {
        int sum=0;
        int count=1;
        while(count <= noOfInputs1){
            sum = sum+count;
            count++;
        }

        return sum;
    }

}
