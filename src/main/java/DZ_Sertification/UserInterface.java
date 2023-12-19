package DZ_Sertification;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\n");

        int quantity;
        String forSplit;
        String[] splited;
        String input;
        ToyBox toys = new ToyBox();

        System.out.println("Введите количество игрушек учавствующих в конкурсе");
        System.out.println("Ваш ввод здесь =>");
        input =s.next();
        try {
            quantity = Integer.parseInt(input);
        } catch (Exception e){
            e.printStackTrace();
        }
        quantity = Integer.parseInt(input);
        for (int i = 1; i <= quantity; i++) {
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println("Введите даные " + i + "й игрушки в вледующем формате через пробел:");
            System.out.println("индекс вес название");
            System.out.println("Пример: 1 4 Робот");
            System.out.println("Ваш ввод здесь =>");
            input =s.next();
            forSplit = s.next();
            splited = forSplit.split(" ");
            if(splited.length != 3){
                throw new RuntimeException("Вы не ввели корректно три параметра через пробел!");
            }
            try {
                toys.add(new Toy(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]), splited[2]));
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
