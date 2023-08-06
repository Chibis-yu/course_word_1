import java.sql.SQLOutput;

public class Main {

    private static final Employee[] employees = {
            new Employee("Райкин ", "Петр Сергеевич ", 55000, 1),
            new Employee("Лаврова ", "Анна Ивановна ", 75000, 2),
            new Employee("Кометов ", "Иван Алексеевич ", 60000, 3),
            new Employee("Савельева ", "Александра Сергеевна ", 80000, 4),
            new Employee("Никитина ", "Дарья Витальевна ", 100000, 5),
            new Employee("Ларин ", "Сергей Васильевич ", 50000, 1),
            new Employee("Илюшин ", "Илья Антонович ", 73000, 2),
            new Employee("Маликов ", "Максим Романович ", 61000, 3),
            new Employee("Герасимова ", "Виктория Владимировна ", 79000, 4),
            new Employee("Щербакова ", "Марина Александровна ", 101000, 5),
    };
    public static void main(String[] args) {
        printEmployees();
        System.out.println("Общая сумма зарплат составляет: " + calcTotalSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeMaxSalary());
        System.out.println("Средняя зарплата: " + calcAverageSalary());
        printFirstNames();
    }

        public static void printEmployees () {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }

            public static int calcTotalSalary() {
                int salarySumma = 0;

                for (Employee employee : employees) {
                    salarySumma += employee.getSalary();
                }
                return salarySumma;
            }

            public static Employee findEmployeeMinSalary () {
                Employee employeeMinSalary = employees[0];

                for (Employee employee : employees) {
                    if (employee.getSalary() < employeeMinSalary.getSalary()) {
                        employeeMinSalary = employee;
                    }
                }
                return employeeMinSalary;
            }
            public static Employee findEmployeeMaxSalary () {
                Employee employeeMaxSalary = employees[0];

                for (Employee employee : employees) {
                    if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                        employeeMaxSalary = employee;
                    }
                }
                return employeeMaxSalary;
            }
            public static float calcAverageSalary () {
                return calcTotalSalary() / (float) employees.length;
            }

        public static void printLastNames () {
            for (Employee employee : employees)
                System.out.println(employee.getLastName());
        }
    public static void printFirstNames () {
        for (Employee employee : employees)
            System.out.println(employee.getFirstName()+employee.getLastName());
    }
    }


