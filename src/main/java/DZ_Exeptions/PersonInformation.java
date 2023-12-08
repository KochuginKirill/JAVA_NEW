package DZ_Exeptions;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

public class PersonInformation {

    public static void main(String[] args) {
        addNewPerson();
    }



    static void checkFile(String pathToFile){
        String line = "empty";
        try {
            File file = new File(pathToFile + ".txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан"); }
            else {
                BufferedReader bufReader =
                        new BufferedReader(new FileReader(file));
                System.out.println("Файл уже существует");
                line = bufReader.readLine();
                bufReader.close(); }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Первая строчка в файле " + line);
        }
    }

    static void addStringToFile(String pathToFile, String newText){
        Path path = Paths.get(pathToFile);
        try {
            Files.write(path, newText.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Данные успешно добавлены");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String[] getStringInput(String input) {
        if(Objects.equals(input, "")){
            throw new RuntimeException("Вы ничего не ввели");
        }
        String[] fragmentInput = input.split(" ");
        if (fragmentInput.length != 6){
            throw new RuntimeException("Вы не ввели корректно 6 типов данных, сверьтесь с условием. \n" +
                    "Вы ввели:" + fragmentInput.length);
        }
        String surname = null;
        String name = null;
        String fatherName = null;
        String date = null;
        String number = null;
        String gender = null;
        for (int i = 0; i < fragmentInput.length; i++) {
            if(fragmentInput[i].contains(".")) {
                String[] fragmentdate = fragmentInput[i].split("\\.");
                if (fragmentdate.length != 3) {
                    System.out.println(fragmentdate.length);
                    System.out.println(Arrays.toString(fragmentdate));
                    System.out.println("Дата введена некорректно, ваш ввод: " + fragmentInput[i]);
                    System.out.println("Ожидаемый ввод: dd.mm.yyyy");
                    System.out.println("Попробуйте снова");
                    throw new RuntimeException("Incorrect date");
                }
                int day;
                try {
                    day = Integer.parseInt(fragmentdate[0]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("День был введен некорректно");
                    System.out.println("Ваш ввод: "+fragmentdate[0]);
                    throw new RuntimeException("Incorrect day");
                }
                int month;
                try {
                    month = Integer.parseInt(fragmentdate[1]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("Месяц был введен некорректно");
                    System.out.println("Ваш ввод: "+fragmentdate[1]);
                    throw new RuntimeException("Incorrect month");
                }
                int year;
                try {
                    year = Integer.parseInt(fragmentdate[2]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("Год был введен некорректно");
                    System.out.println("Ваш ввод: "+fragmentdate[2]);
                    throw new RuntimeException("Incorrect year");
                }
                if (day < 0 || day > 31) {
                    System.out.println("Некорректное значение, день вашего рождения не может быть: " + day);
                    throw new RuntimeException("Incorrect day");
                }
                if (month < 0 || month > 12) {
                    System.out.println("Некорректное значение, месяц вашего рождения не может быть: " + month);
                    throw new RuntimeException("Incorrect month");
                }
                if (year < 1900 || year > Calendar.getInstance().get(Calendar.YEAR)) {
                    System.out.println("Некорректное значение, год вашего рождения не может быть: " + year);
                    throw new RuntimeException("Incorrect year");
                }
                date = fragmentInput[i];
            }else if(fragmentInput[i].matches("[0-9]+")){
                String[] fragmenNumber = fragmentInput[i].split("");
                for (String s : fragmenNumber) {
                    try{
                        int test = Integer.parseInt(s);
                    } catch (Exception e){
                        e.printStackTrace();
                        throw new RuntimeException("Телефон введен некорректно. Проблемный элемент:" + s);
                    }
                    number = fragmentInput[i];
                }
            }else if (fragmentInput[i].equalsIgnoreCase("m") ||
                    fragmentInput[i].equalsIgnoreCase("f")){
                gender = fragmentInput[i];
            }else if (surname == null){
                surname =fragmentInput[i];
                try{
                    name = fragmentInput[++i];
                } catch (ArrayIndexOutOfBoundsException e){
                    throw new ArrayIndexOutOfBoundsException("После фамилии должно идти имя через пробел.");
                }
                try{
                    fatherName = fragmentInput[++i];
                } catch (ArrayIndexOutOfBoundsException e){
                    throw new ArrayIndexOutOfBoundsException("После имени должно идти отчество через пробел.");
                }
            }
        }
        String[] check = {surname , name , fatherName , date , number , gender};
        for (String s : check) {
            if(s == null){
                System.out.println("Ваш ввод:" + Arrays.toString(check));
                throw new RuntimeException("Некорректный ввод, сверьтесь с условием.");
            }
        }
        String[] strings = {surname, Arrays.toString(check)};
        return strings;
    }

    static void addNewPerson(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        int userInput;
        String inputString;
        String[] userStrings;
        while(true){
            System.out.println("____________________________________________");
            System.out.println("Введите 1 для добавления нового человека \n" +
                    "и создания отдельно txt файла");
            System.out.println("Введите 2 для закытия программы и сохранения данных");
            System.out.print("Ввод =>");
            try {
                userInput = Integer.parseInt(scanner.next());
            } catch (Exception e){
                e.printStackTrace();
                System.out.println("Вы ввели не целое число");
                break;
            }
            if(userInput != 1 && userInput != 2){
                System.out.println("Вы ввели число не равное 1 или 2");
            }

            if(userInput == 1) {
                System.out.println("_________________________________________________________________");
                System.out.println("Введите в консоль одной строчкой через пробел, \n"+
                        "в любом порядке следующие элементы: ");
                System.out.println("<Фамилия> <Имя> <Отчество> <датаРождения> <номерТелефона> <пол>\n"+
                        "(Фамилия, имя и отчество вводятся поочередно в том же порядке. \n" +
                        "В отличии от других элементов)");
                System.out.println("дата вводится в формате: дд.мм.гггг");
                System.out.println("телефонные номера вводятся через слитно");
                System.out.println("Пол: либо f, либо m");
                System.out.println();
                System.out.println("Образец:");
                System.out.println("25.5.1995 88216666666 Иванов Иван Иванович m");
                System.out.println("_________________________________________________________________");

                System.out.print("Введите вашу строку =>");
                inputString = scanner.next();
                userStrings = getStringInput(inputString);
                checkFile(userStrings[0]);
                addStringToFile(userStrings[0] + ".txt",userStrings[1] +  "\n");
                break;
            }
            if(userInput == 2){
                break;
            }
        }
    }
}
