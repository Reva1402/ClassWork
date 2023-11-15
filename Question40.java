package Activity.One;

public class Question40 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 0;
        int series = 15;
        fibonacciSeries(a,b,count,series);
        System.out.println();
        int q=2;
        int e=4;
        int numOftimes = 0;
        int times = 20;
        fibonacciSeries(q,e,numOftimes,times);



        } public static void fibonacciSeries(int a, int b, int count, int series){
        do {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        } while (count < series);

    }
    }

