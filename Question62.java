package Activity.One;

import java.util.Arrays;

public class Question62 {
    public static void main(String[] args) {

        int[][] matrixOne = {{2, 5, 6, 42, 15, 46}, {6, 56, 23, 3, 2, 1}};
        int[][] matrixTwo = {{450, 90, 28, 87, 67, 35}, {12, 54, 12,24, 34, 30}};
        System.out.println("Matrix One Array is: " + Arrays.deepToString(matrixOne));
        System.out.println("Matrix Two Array is: " + Arrays.deepToString(matrixTwo));
        int newRows = matrixOne.length;
        int newColumns = matrixOne[0].length;


        int[][] addedMatrix = new int[newRows][newColumns];
        int i = 0;
        int j = 0;
        for (i = 0; i < matrixOne.length; i++) {
            for (j = 0; j < matrixOne[0].length; j++) {
                addedMatrix[i][j] = (matrixOne[i][j] + matrixTwo[i][j]);
            }

        }
//        int[][] addedNewMatrix = new int[addedMatrix.length][addedMatrix[0].length];
//
//        for (int k = 0; k < addedMatrix.length; k++) {
//            for (int p = 0; p < addedNewMatrix[0].length; p++) {
//                addedNewMatrix[k] = addedMatrix[k];
//                System.out.print(addedNewMatrix[k][p]+" ");
//            }

           System.out.println("Added Matrix Array is: " + Arrays.deepToString(addedMatrix));
        }
    }




