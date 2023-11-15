package Activity.One;

public class Question75 {
    public static void main(String[] args) {

        int[] arrayOne = {2,7,5,9,23,45,1,12,18,10};
        int sum = 35;
        System.out.println("Given Sum value is: "+sum);
        combinationOfSum(arrayOne, sum);
    }

    public static void combinationOfSum(int[] givenArray, int value) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int sum = value;
        int length = givenArray.length;

        for(i=0;i<length-3;i++){
            for(j=i+1; j<length-2;j++){
                for(k=j+1;k<length-1;k++){
                    for(l=k+1;l<length;l++){
                        if (givenArray[i] + givenArray[j] + givenArray[k]+givenArray[l]==sum){
                            System.out.println("Combination of 4 elements whose sum is: "+givenArray[i]+"+"+givenArray[j]+"+"+givenArray[k]+"+"+givenArray[l]+" = "+value);
                        }
                    }
                }
            }
        }


        }
    }


