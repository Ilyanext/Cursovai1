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

    }
}

