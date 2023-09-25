package Seminar1;

public class Seminar1_2 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                count++;
            } else{
                if (max < count){
                    max = count;
                    count = 0;
                }
            }
        }
        if (max > count) {
            System.out.println(max);
        }
        else {
            System.out.println(count);
        }

    }

    }



