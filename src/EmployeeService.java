public class EmployeeService {
    public static void printEmployeeList(Employee[] employees) {
        System.out.println("Список всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateMinSalaryEmployee(Employee[] employees) {
        double minSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                minSalary = employees[i].getSalary();
            }
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public static double calculateMaxSalaryEmployee(Employee[] employees) {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        return maxSalary;
    }

    public static void calculateEmployeeSalarySumPrint(Employee[] employees) {
        System.out.println("Сумма затрат на зарплаты: " + calculateEmployeeSalarySum(employees));
    }

    public static void calculateEmployeeSalaryMinPrint(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() == calculateMinSalaryEmployee(employees)) {
                    System.out.println("Наименьшая зарплата: " + employee);
                }
            }
        }
    }
    public static void calculateEmployeeSalaryMaxPrint(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() == calculateMaxSalaryEmployee(employees)) {
                    System.out.println("Наибольшая зарплата: " + employee);
                }
            }
        }
    }

    public static void calculateEmployeeAverageSalaryPrint(Employee[] employees) {
        System.out.println("Средняя зарплата сотрудника:  " + calculateEmployeeAverageSalary(employees));
    }

    public static double calculateEmployeeSalarySum(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public static double calculateEmployeeAverageSalary(Employee[] employees) {
        double averageSalary;
        int elementCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                elementCount++;
            }
        }
        averageSalary = calculateEmployeeSalarySum(employees) / elementCount;
        return averageSalary;
    }

    public static void allEmployeesFullName(Employee[] employees) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ФИО сотрудников: \n");
        for (Employee employee : employees) {
            if (employee != null) {
                String s = employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName();
                stringBuilder.append(s).append("\n");
            }
        }
        String fullName = stringBuilder.toString();
        System.out.println(fullName);
    }

    public static void calculateallEmployeesFullNamePrint(Employee[] employees) {
        allEmployeesFullName(employees);
    }
}
