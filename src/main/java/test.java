import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import static java.util.Collections.swap;

public class test {
    public static void main(String[] args) {
        System.out.println(getPrediction());
    }

    public static String getPrediction(){
        Random r = new Random();
        int choice = r.nextInt(8);
        System.out.println(choice);
        if(choice == 0){
            return "Бесспорно";
        }
        else if(choice == 1){
            return "Определённо да";
        }
        else if(choice == 2){
            return "Вероятнее всего";
        }
        else if(choice == 3){
            return "Хорошие перспективы";
        }
        else if(choice == 4){
            return "Спроси позже";
        }
        else if(choice == 5){
            return "Попробуй снова";
        }
        else if(choice == 6){
            return "Мой ответ — нет";
        }
        else if(choice == 7){
            return "Весьма сомнительно";
        } else{
            return null;
        }


    }
}
