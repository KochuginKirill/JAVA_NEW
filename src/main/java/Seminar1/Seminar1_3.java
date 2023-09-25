package Seminar1;

public class Seminar1_3 {
    public static void main(String[] args) {
        /*
        Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        а остальные - равны ему.
         */
        int[] arr2 = {3,2,2,3,2,3,2,3};
        int val = 3;
        int tp = arr2.length;
        for (int i = 0; i < tp; i++) {
            if (arr2[i] == val){
                tp = arr2.length;
                for (int j = tp-1; j > 0; j--) {
                    if (arr2[j] != val){
                        int temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                        tp--;
                        break;
                    }
                    tp--;
                }
            }
        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k]);
        }

    }
}
