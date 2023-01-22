package Cursovailite;

public class Main {
    public static void counting(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void print() {
        System.out.println("==================");
    }

    public static int sum(Employee employee[]) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }

    public static Employee minSalary(Employee employee[]) {
        int smolSalary = employee[0].getSalary();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (smolSalary > employee[i].getSalary()) {
                smolSalary = employee[i].getSalary();
                j = i;
            }
        }
        return employee[j];
    }

    public static Employee maxSalary(Employee employee[]) {
        int bigSalary = employee[0].getSalary();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (bigSalary < employee[i].getSalary()) {
                bigSalary = employee[i].getSalary();
                j = i;
            }
        }
        return employee[j];
    }

    public static double averageSalary(Employee employee[]) {
        double average = sum(employee) / Employee.getNumbersOfEmployee();
        return average;
    }

    public static void printEmployee(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }

    public static void indexing(Employee employee[]) {
        int proindex = 7; // in %
        for (int i = 0; i < employee.length; i++) {
            int totalSalary = employee[i].getSalary() * (proindex + 100) / 100;
            employee[i].setSalary(totalSalary);
            System.out.println(employee[i]);
        }
    }

    public static void depatmenSort(Employee employee[], int employeeDepatmen) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == employeeDepatmen) {
                System.out.println("Сотрудник: " + employee[i].getFullName() + ", Id = " + employee[i].getId() + ", зарплата: " + employee[i].getSalary());

            }
        }
    }

    public static void minSalaryDepatmen(Employee employee[], int employeeDepatmen) {
        int minSalary = employee[0].getSalary();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == employeeDepatmen) {
                if (minSalary > employee[i].getSalary()) {
                    minSalary = employee[i].getSalary();
                    j = i;
                }
            }
        }
        System.out.println(employee[j] + " имеет маленькую зарплату.");
    }

    public static void maxSalaryDepatmen(Employee employee[], int employeeDepatmen) {
        int maxSalary = employee[0].getSalary();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == employeeDepatmen) {
                if (maxSalary < employee[i].getSalary()) {
                    maxSalary = employee[i].getSalary();
                    j = i;
                }
            }
        }
        System.out.println(employee[j] + " имеет большую зарплату.");
    }

    public static int totalSalaryDepatmen(Employee[] employee, int employeeDepatmen) {
        int totalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == employeeDepatmen) {
                totalSalary += employee[i].getSalary();
            }
        }
        return totalSalary;
    }

    public static int averageSalaryDepatmen(Employee employee[], int employeeDepatmen) {
        int j = 0;
        int average = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == employeeDepatmen) {
                j++;
            }
        }
        average = totalSalaryDepatmen(employee, employeeDepatmen) / j;
        return average;
    }

    public static void indexSalaryDepatmen(Employee employee[], int employeeDepatmen, int indexDepatmen) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == employeeDepatmen) {
                int totalSalary = employee[i].getSalary() * (indexDepatmen + 100) / 100;
                employee[i].setSalary(totalSalary);
                System.out.println(employee[i] + "- зарплата проиндексирована.");
            }
        }
    }

    public static void employeeWithMinSalary(Employee employee[], int mySalary) {
        System.out.println("ЗП меньше, чем у меня: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < mySalary) {
                System.out.println(employee[i] + ", Id: " + employee[i].getId());
            }

        }
    }

    public static void employeeWithMaxSalary(Employee employee[], int mySalary) {
        System.out.println("ЗП больше, чем у меня: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() >= mySalary) {
                System.out.println(employee[i] + ", Id: " + employee[i].getId());
            }

        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Филиппов Владимир Андреевич", 1, 25000);
        employee[1] = new Employee("Шестью Игорь Михайлович", 2, 35000);
        employee[2] = new Employee("Комисаров Саид Ильич", 3, 15000);
        employee[3] = new Employee("Мишустин Валерий Григорьевич", 4, 20000);
        employee[4] = new Employee("Карманова Анастасия Сергеевна", 5, 50000);
        employee[5] = new Employee("Белякова Анна Александровна", 1, 17000);
        employee[6] = new Employee("Тролин Кирилл Владимирович", 2, 34000);
        employee[7] = new Employee("Поздняков Владислав Алексеевич", 3, 28000);
        employee[8] = new Employee("Бородин Владимир Сергеевич", 4, 19000);
        employee[9] = new Employee("Кулякова Марина Викторовна", 5, 55000);

        counting(employee);
        print();
        int total = sum(employee);
        System.out.println("Сумма затрат на зарплаты в месяц " + total + " руб.");
        print();
        System.out.println("Минимальная зарплата: " + minSalary(employee));
        print();
        System.out.println("Максимальная зарплата: " + maxSalary(employee));
        print();
        System.out.println("Среднее значение зарплат = " + averageSalary(employee) + " руб.");
        print();
        printEmployee(employee);
        print();
        // повышенный уровень сложности
        indexing(employee);
        print();

        int employeeDepatmen = 3; // номер отдела
        depatmenSort(employee, employeeDepatmen);
        print();

        minSalaryDepatmen(employee, employeeDepatmen);
        print();

        maxSalaryDepatmen(employee, employeeDepatmen);
        print();

        System.out.println("Сумма затрат на зарплату по отделу: " + totalSalaryDepatmen(employee, employeeDepatmen) + " руб.");//
        print();

        System.out.println("Средня зарплата по отделу: " + averageSalaryDepatmen(employee, employeeDepatmen) + " руб.");
        print();

        int indexDepatmen = 6; //%
        indexSalaryDepatmen(employee, employeeDepatmen, indexDepatmen);
        print();

        int mysalary = 40000;
        employeeWithMinSalary(employee, mysalary);
        print();
        employeeWithMaxSalary(employee, mysalary);
    }
}

