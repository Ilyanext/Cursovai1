package Cursovailite;

private class EmployeeBook {
    private String fullName;
    private int department;
    private int salary;
    static int numbersOfEmployee = 0;
    private int id = 0;

    public EmployeeBook(String fullName, int department, int salary, int id) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    EmployeeBook[] employee = new EmployeeBook[10];




}

