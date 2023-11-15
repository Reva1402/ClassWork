package Activity.One;

public class Question74 {
    public static void main(String[] args) {

        int[] arrayOne = {2, 7, 8, 6, 4, 1, 3, 0, 5};
        int sum = 9;
        System.out.println("Target Value is: " + sum);
        combinationTwo(arrayOne, sum);


    }

    public static void combinationTwo(int[] givenArray, int value) {

        int target = value;
        int i = 0;
        int j = 0;

        for (i = 0; i < givenArray.length - 1; i++) {
            for (j = i + 1; j < givenArray.length; j++) {
                if (givenArray[i] + givenArray[j] == target) {
                    System.out.println("The two elements who sum is target value are: " + givenArray[i] + "+" + givenArray[j] + "=" + target);
                }
            }
        }
    }
}
