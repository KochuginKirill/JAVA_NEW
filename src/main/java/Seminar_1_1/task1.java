package Seminar_1_1;

public class task1 {
    public static int countNTriangle(int n){
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
}

    public static void main(String[] args) {

        System.out.println(countNTriangle(4));

    }
}
