public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Сергеевич","Дикарев", 1, 200_000);
        employees[1] = new Employee("Анастасия", "Сергеевна","Россошик", 2, 100_000);
        employees[2] = new Employee("Елена", "Владимировна","Дикарева", 3, 150_000);
        employees[3] = new Employee("Ольга", "Александровна","Колесникова", 4, 95_000);
        employees[4] = new Employee("Инна", "Владимировна","Колесникова", 5, 120_000);
        employees[5] = new Employee("Сергей", "Вячеславович","Дикарев", 5, 65_000);
        employees[6] = new Employee("Юлия", "Георгевна","Лапина", 4, 1_000_000);
        employees[7] = new Employee("Леся", "Махмедовна","Кривобокова", 3, 159_000);
        employees[8] = new Employee("Макс", "Сергеевич","Ушаков", 2, 55_000);
        employees[9] = new Employee("Саня", "Максимович","Найдовский", 1, 24_000);

        EmployeeService.printEmployeeList(employees);
        EmployeeService.calculateEmployeeSalarySumPrint(employees);
        EmployeeService.calculateEmployeeAverageSalaryPrint(employees);
        EmployeeService.calculateEmployeeSalaryMinPrint(employees);
        EmployeeService.calculateEmployeeSalaryMaxPrint(employees);
        EmployeeService.calculateallEmployeesFullNamePrint(employees);
    }
}