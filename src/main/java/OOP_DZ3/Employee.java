package OOP_DZ3;

public class Employee implements Comparable<Employee> {
    protected String name, department;
    protected int age;
    protected int income;


    public Employee(String name, String department, int age, int income) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.income = income;
    }
    @Override
    public String toString(){
        return ("Имя: " + this.name + " Департамент: " + this.department + " Возраст: " + this.age + " Зарплата в рублях: " + this.income + "\n");
    }

    public int getIncome() {
        return income;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Employee e) {
        return age - e.age;
    }
}
