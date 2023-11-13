package OOP_test;

public class test {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
    }
    public static String toBinary(int decimalNumber) {
        double result = 0;
        for(int i = 0; decimalNumber >= 0; i++){
            result = result + ((decimalNumber % 2) * Math.pow(10, i));
            decimalNumber = decimalNumber / 2;
        }
        return String.valueOf(result);
    }

    public static int toDecimal(String binaryNumber) {
        int bin = Integer.parseInt(binaryNumber);;
        double result = 0;
        for(int i = 0; bin >= 0; i++){
            result = result + ((bin % 10) * Math.pow(2, i));
            bin = bin / 10;
        }
        return (int) result;
    }

}
