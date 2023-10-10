package DZ_Semiar_6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ITOG {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> newNumber = phoneBook.get(name);
        if (newNumber != null) {
            newNumber.add(phoneNum);
        } else {
            newNumber = new ArrayList<>();
            newNumber.add(phoneNum);
            phoneBook.put(name, newNumber);
        }
    }

    public ArrayList<Integer> find(String name) {
        if(phoneBook.get(name) == null){
            ArrayList<Integer> newNumber = new ArrayList<Integer>();
            return newNumber;
        } else{
            return phoneBook.get(name);
        }

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int userInput;
        while(true){
            System.out.println("Введите 1 для добавления номера");
            System.out.println("Введите 2 для поиска номера");
            System.out.println("Введите 3 для печати телефонной книги в консоль");
            System.out.println("Введите 4 для завершения работы");
            System.out.println("Введите здесь =>");
            userInput = s.nextInt();
            if()

        }

    }
}
