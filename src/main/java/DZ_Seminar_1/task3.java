package DZ_Seminar_1;

public class task3 {
    public static int calculate(char op, int a, int b) {
        if(op == '+'){
            return a+b;
        }
        if(op == '-'){
            return a-b;
        }
        if(op == '/'){
            return a/b;
        }
        if(op == '*'){
            return a*b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(calculate('/', 2,2));
    }
}
