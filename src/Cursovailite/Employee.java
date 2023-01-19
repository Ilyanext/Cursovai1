package Cursovailite;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    static int numbersOfEmployee = 0;
    private int id = 0;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = numbersOfEmployee++;
    }

//    public void EmployeeDontDepatment (String fullName, int salary, int id) {
//        this.fullName = fullName;
//        this.salary = salary;
//        this.id = id;
//    }

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
                "Ф.И.О.: " + fullName +
                ", отдел: " + department +
                ", зарплата: " + salary + " руб.";
    }
}
