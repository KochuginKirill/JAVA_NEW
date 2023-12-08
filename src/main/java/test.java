
public class test {
    public static void main(String[] args) {
        System.out.println(isFloat("1.25"));
    }

    public static float isFloat(String input) {
        float result = Float.NaN;
        try{
            result = Float.parseFloat(input);
        } catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public static double expr(int[] intArray, int d) {
        if(intArray.length < 8){
            System.out.println("У вводного массива отсутствуем элемент с индексом 8");
            return Double.NaN;
        }
        if(d == 0){
            System.out.println("Деление на ноль невозможно");
            return Double.NaN;
        }
        double result = (double) intArray[8] / d;
        System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + result);
        return result;
    }


}

