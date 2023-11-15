package Activity.One;

public class Question32 {
    public static void main(String[] args) {
        int a =0;
        int b= 1;
        int count =0;
        int series = 15;
        System.out.println("Fibonacci Series till " + series + " times:");
        while(count<series){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b=c;
            count++;
        }

    }
}
