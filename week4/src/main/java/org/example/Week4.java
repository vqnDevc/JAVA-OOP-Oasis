package org.example;

public class Week4 {
    /**
     * Calulator max in 2 number.
     *
     * @param a : number 1
     * @param b : number 2
     * @return : result
     */
    public static int max2Int(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Find min int in array.
     *
     * @param array : array number int
     * @return : min of array
     */
    public static int minArray (int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    /**
     * Caculate BMI.
     *
     * @param weight : weight of man
     * @param height : height of man
     * @return : status
     */
    public static String calculateBMI(double weight, double height){
        double BMI = weight / (height * height);
        BMI = Math.round(BMI * 10.0) / 10.0;
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else if (BMI < 23) {
            return "Bình thường";
        } else if (BMI < 25) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}