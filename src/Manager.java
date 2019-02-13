public class Manager extends Employee{

    public Manager(long id, String name, int age, double salary, char gender){
        super(id, name, age, salary, gender);
    }

    public void printInfo(){
        System.out.println("Manager: id = " + getId() + "; name = " + getName() + "; age = " + getAge() + "; salary = " + getSalary() + "; gender = " + getGender() + ".");
        System.out.println("Total salary of manager " + getName() + " = " + totalSalary() + " cu.");
    }
}