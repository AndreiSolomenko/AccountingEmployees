public class Test{

    public static void main(String[] aggs){

        long id = 6;
        String name = "Elena";
        Employee employeeForEdit = new Employee(4, "Ira", 24, 20, 'F');

        EmployeeService employeeService = new EmployeeService();

        System.out.println("1. Employees information.");
        employeeService.printEmployees(); //вывод на экран информации о сотрудниках

        System.out.println("2. Total salary.");
        System.out.print("Total salary and bonus for all employees of the month: ");
        System.out.println(employeeService.calculateSalaryAndBonus() + " cu.");
        //возвращает количество денег необходимое для выплаты зарплат для всех сотрудников в этом месяце

        System.out.println("3. Search employee by id.");
        System.out.println("Employee whose ID is " + id + ": " + employeeService.getById(id));
        //возвращает2 сотрудника по заданному id

        System.out.println("4. Search employee by name.");
        System.out.println("Employee whose name is " + name + ": " + employeeService.getByName(name));
        //возвращает сотрудника по заданному имени

        System.out.println("5. Sort employees by name.");
        employeeService.sortByName(); //возвращают отсортированный массив с сотрудниками по имени

        System.out.println("6. Sort employees by name and salary.");
        employeeService.sortByNameAndSalary(); //возвращают отсортированный массив с сотрудниками по критерию

        System.out.println("7. Editing.");
        System.out.println("Old employee whose ID is " + employeeForEdit.getId() + ": " + employeeService.edit(employeeForEdit));
        //находит сотрудника по id, и подменяет информацию о нем на новую.Старую версию сотрудника метод возвращает.

    }
}