package OOP_DZ2;

import java.util.Scanner;

public class ClientInterface {
    public static void main(String[] args) {
        CreditAccount myCreditAccount = new CreditAccount(0);
        DepositAccount myDepositAccount = new DepositAccount(0);
        FixedAmountAccount myFixedAmountAccount = new FixedAmountAccount(0);
        Scanner s = new Scanner(System.in);
        String userInput;

        while(true){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Введите 1 для того, чтобы показать баланс текущего кредитного счета");
            System.out.println("Введите 2 чтобы добавить сумму на ваш кредитный счет");
            System.out.println("Введите 3 чтобы снять сумму с вашего кредитного счета");
            System.out.println();
            System.out.println("Введите 4 для того, чтобы показать баланс текущего депозитного счета");
            System.out.println("Введите 5 чтобы добавить сумму на ваш депозитный счет");
            System.out.println("Введите 6 чтобы снять сумму с вашего депозитного счета");
            System.out.println();
            System.out.println("Введите 7 для того, чтобы показать баланс текущего фиксированного счета");
            System.out.println("Введите 8 чтобы добавить сумму на ваш фиксированный счет (невозможно!)");
            System.out.println("Введите 9 чтобы снять сумму с вашего фиксированного счета (невозможно!)");
            System.out.println();
            System.out.println("Введите 0 для выхода из программы и очистки данных");
            System.out.println();
            System.out.print("Ваш ввод =>");
            userInput = s.next();
            if(userInput.equals("1")){
                System.out.println("Баланс вашего кредитного счета равен:" + myCreditAccount.get() + " руб.");
                System.out.println("Введите любой символ и нажмите ENTER для продолжения =>");
                s.next();
            }
            if(userInput.equals("2")){
                System.out.print("Введите сумму для добавления на ваш кредитный счет =>");
                myCreditAccount.put(s.nextDouble());
            }
            if(userInput.equals("3")){
                System.out.print("Введите сумму для снятия с вашего кредитного счета =>");
                myCreditAccount.take(s.nextDouble());
            }
            if(userInput.equals("4")){
                System.out.println("Баланс вашего депозитного счета равен:" + myDepositAccount.get() + " руб.");
                System.out.println("Введите любой символ и нажмите ENTER для продолжения =>");
                s.next();
            }
            if(userInput.equals("5")){
                System.out.print("Введите сумму для добавления на ваш депозитный счет =>");
                myDepositAccount.put(s.nextDouble());
            }
            if(userInput.equals("6")){
                System.out.println("Если с последнего снятия прошло меньше двух месяцев, то сумма не спишется");
                System.out.print("Введите сумму для снятия с вашего депозитного счета =>");
                myDepositAccount.take(s.nextDouble());
            }
            if(userInput.equals("7")){
                System.out.println("Баланс вашего депозитного счета равен:" + myFixedAmountAccount.get() + " руб.");
                System.out.println("Введите любой символ и нажмите ENTER для продолжения =>");
                s.next();
            }
            if(userInput.equals("8")){
                System.out.print("Введите сумму для добавления на ваш фиксированный счет (невозможно!) =>");
                myFixedAmountAccount.put(s.nextDouble());
            }
            if(userInput.equals("9")){
                System.out.print("Введите сумму для снятия с вашего фиксированный счета (невозможно!) =>");
                myFixedAmountAccount.take(s.nextDouble());
            }
            if(userInput.equals("0")){
                break;
            }
        }
    }
}
