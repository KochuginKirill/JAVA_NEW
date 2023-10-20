package OOP_DZ3;

import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        String[] names = new String[]{"John", "Susan", "Marcus", "Karen", "Michael", "Peter"};
        String[] departments = new String[]{"Sales", "Development", "Testing"};
        Set<Employee> employees = new TreeSet<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            employees.add(new Employee(getRandom(names), getRandom(departments),rand.nextInt((60 - 18) + 1) + 18, rand.nextInt((100000 - 60000) + 1) + 60000));
        }
        System.out.println("По возрастанию возраста");
        System.out.println();
        System.out.println(employees);
        Comparator<Employee> IncomeComparator = (o1, o2) -> o2.getIncome() - o1.getIncome();
        Set<Employee> incomeSort = new TreeSet<>(IncomeComparator);
        for (int i = 0; i < 20; i++) {
            incomeSort.add(new Employee(getRandom(names), getRandom(departments),rand.nextInt((60 - 18) + 1) + 18, rand.nextInt((100000 - 60000) + 1) + 60000));
        }
        System.out.println("По убыванию зарплаты");
        System.out.println();
        System.out.println(incomeSort);
        ArrayList<Employee> DepartmentSort = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            DepartmentSort.add(new Employee(getRandom(names), getRandom(departments),rand.nextInt((60 - 18) + 1) + 18, rand.nextInt((100000 - 60000) + 1) + 60000));
        }
        Collections.sort(DepartmentSort, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getDepartment().compareTo(o2.getDepartment());
            }
        });
        System.out.println("По наименованию отдела");
        System.out.println();
        System.out.println(DepartmentSort);

    }
    public static String getRandom(String[] array) {
        Random r = new Random();
        return array[r.nextInt(array.length)];
    }


}
