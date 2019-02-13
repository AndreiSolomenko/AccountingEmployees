public class EmployeeService{

    private Employee[] employees = generate();

    public void printEmployees(){
        for(Employee employee : employees){
            employee.printInfo();
        }
    }

    public double calculateSalaryAndBonus(){
        double sum = 0;
        for(Employee employee : employees){
            sum += employee.totalSalary();
        }
        return sum;
    }

    public Employee getById(long id){
        for(Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    public Employee getByName(String name){
        for(Employee employee : employees){
            if(employee.getName().equals(name)){
                return employee;
            }
        }
        return null;
    }

    public Employee[] sortByName(){
        for(int j = 0 ; j < employees.length ; j++){
            for(int i = j + 1 ; i < employees.length ; i++){
                if(employees[i].getName().compareTo(employees[j].getName()) < 0){
                    Employee temp = null;
                    temp = employees[j];
                    employees[j] = employees[i];
                    employees[i] = temp;
                }
            }
        }
        return employees;
    }

    public Employee[] sortByNameAndSalary(){
        for(int i = 0 ; i < employees.length ; i++){
            double leftNam = employees[i].getSalary();
            for(int j = i + 1 ; j < employees.length ; j++){
                double rightNam = employees[j].getSalary();
                if(leftNam < rightNam){
                    Employee temp = null;
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees;
    }

    public Employee edit(Employee employeeForEdit){
        Employee oldEmployee = null;
        for(int i = 0 ; i < employees.length ; i++){
            if(employeeForEdit.getId() == employees[i].getId()){
                oldEmployee = employees[i];
                employees[i].setName(employeeForEdit.getName());
                employees[i].setAge(employeeForEdit.getAge());
                employees[i].setSalary(employeeForEdit.getSalary());
                employees[i].setGender(employeeForEdit.getGender());
            }
        }
        return oldEmployee;
    }

    private Employee[] generate(){

        Manager manager1 = new Manager(1, "Ivan", 40, 35, 'M');
        Manager manager2 = new Manager(2, "Elena", 35, 30, 'F');
        Developer developer1 = new Developer(3, "Dima", 25, 20, 'M', 2);
        Developer developer2 = new Developer(4, "Kolia", 26, 20, 'M', 2);
        Developer developer3 = new Developer(5, "Pasha", 27, 20, 'M', 2);
        Cleaner cleaner1 = new Cleaner(6, "Vasia", 45, 5, 'M', 3, 3);
        Cleaner cleaner2 = new Cleaner(7, "Zina", 50, 5, 'F', 3, 4);

        Employee[] employees = new Employee[7];
        employees[0] = manager1;
        employees[1] = manager2;
        employees[2] = developer1;
        employees[3] = developer2;
        employees[4] = developer3;
        employees[5] = cleaner1;
        employees[6] = cleaner2;

        return employees;
    }
}