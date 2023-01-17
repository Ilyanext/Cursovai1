package Cursovailite;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    static int numbersOfEmployee;
    static int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        numbersOfEmployee++;
        id = +numbersOfEmployee;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public static int getNumbersOfEmployee() {
        return numbersOfEmployee;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "Ф.И.О.: " + fullName  +
                ", отдел: " + department +
                ", зарплата: " + salary+ " руб.";
    }
}
