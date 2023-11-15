package Activity.One;

public class Question63 {
    public static void main(String[] args) {
        String[] testArray1 = {
                "Abc",
                "Cde",
                "Efg",
                "Ghi"
        };
        String[] testArray2 = {
                "Zyx",
                "Xwv",
                "Vut",
                "Tsr"
        };
        String[] testArray3 = {
                "Abc",
                "Cde",
                "Efg",
                "Ghi"
        };
        boolean is_True = true;
        for (int i = 0; i < testArray1.length; i++) {
            if (testArray1[i] == testArray2[i]) {
                is_True = true;
            } else {
                is_True = false;
                break;
            }
        }


        for (int i = 0; i < testArray1.length; i++) {
            if (testArray1[i] == testArray3[i]) {
                is_True = true;
            } else {
                is_True = false;
                break;
            }
        }

                for (int i = 0; i < testArray2.length; i++) {
                    if (testArray2[i] == testArray3[i]) {
                        is_True = true;
                    } else {
                        is_True = false;
                        break;

                    }

                }

                if(is_True){
                    System.out.println("Given Arrays are equal.");
            } else{
                    System.out.println("Given Arrays are not equal.");
                }
        }
    }
