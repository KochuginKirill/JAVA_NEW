package DZ_Sertification;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        FileAssist.checkFile("results.txt");

        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\n");

        int quantity;
        String forSplit;
        String[] splited;
        String input;
        ArrayList<Toy> toyArrayList = new ArrayList<>();

        System.out.println("Введите количество игрушек учавствующих в конкурсе");
        System.out.print("Ваш ввод здесь =>");
        input =s.next();
        try {
            quantity = Integer.parseInt(input);
        } catch (NumberFormatException e){
            System.out.println("Вы ввели не число!");
        }
        quantity = Integer.parseInt(input);
        for (int i = 1; i <= quantity; i++) {
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println("Введите даные " + i + "й игрушки в вледующем формате через пробел:");
            System.out.println("индекс вес название");
            System.out.println("(чем выше вес, тем больше шансов у этой игрушки)");
            System.out.println("Пример: 1 4 Робот");
            System.out.print("Ваш ввод здесь =>");
            forSplit = s.next();
            splited = forSplit.split(" ");
            if(splited.length != 3){
                throw new RuntimeException("Вы не ввели корректно три параметра через пробел!");
            }
            try {
                toyArrayList.add(new Toy(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]), splited[2]));
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        for(int i = 1; i <= 10; i++){
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println("Узнаем результаты " + i + "го розыгрыша");
            ToyBoxLottery temp = new ToyBoxLottery();
            for (Toy toy : toyArrayList) {
                toy.getNewChance();
                System.out.print("Результат для " + toy.getName() + ":");
                toy.printChance();
            }
            temp.add(toyArrayList);
            System.out.println("-----------------------------------------");
            System.out.println(i + "й победитель: " + temp.getLotteryWinner());
            FileAssist.addStringToFile("results.txt", i + "й победитель: " + temp.getLotteryWinner() + "\n");
            System.out.println("-----------------------------------------");
        }
        FileAssist.addStringToFile("results.txt", "\n");
    }
}
