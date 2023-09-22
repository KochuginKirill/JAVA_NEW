package DZ_Seminar_1;

public class task2 {
    public static void printPrimeNums(){
        boolean isPrime;
        for (int i = 1; i < 12; i++) {
            isPrime = false;
            for (int j = 2; j < i; j++) {
                if ((i%j) == 0)
                {
                    isPrime = true;
                }
            }
            if (isPrime == false)
            {
                System.out.println(i);
            }
        }

    }


    public static void main(String[] args) {
        printPrimeNums();

    }
}


