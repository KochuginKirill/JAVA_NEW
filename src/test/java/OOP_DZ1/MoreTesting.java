package OOP_DZ1;

import java.util.Scanner;

public class MoreTesting {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        if(arr == null) throw new RuntimeException("В метод передан null");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                arr[i] = new String[]{"0"};
            }
            for (int j = 0; j < arr[i].length; j++) {
                int val = 0;
                if(arr[i][j] == null){
                    arr[i][j] = "0";
                }
                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    System.out.println("Ошибка преобразование в целочисленный тип");
                }
                sum += val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
            String[][] testArray = {
                    {"a", null, "7"},
                    null,
                    {null}
            };
        System.out.println(sum2d(testArray));
    }

}

