import java.util.Random;

public class Developer extends Employee{

    private int fixedBugs;

    public Developer(long id, String name, int age, double salary, char gender, int fixedBugs){
        super(id, name, age, salary, gender);
        this.fixedBugs = fixedBugs;
    }

    public int getFixedBugs(){
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs){
        this.fixedBugs = fixedBugs;
    }

    public double totalSalary(){
        Random random = new Random();
        int coefficient = random.nextBoolean() ? 0 : 2;
        return getSalary() + (fixedBugs * coefficient); //(ставка + fixedBugs коэффициент) (randomBoolean ? 2 : 0)
    }

    public void printInfo(){
        System.out.println("Developer: id = " + getId() + "; name = " + getName() + "; age = " + getAge() + "; salary = " + getSalary() + "; gender = " + getGender() + "; fixed bugs = " + fixedBugs + ".");
        System.out.println("Total salary of developer " + getName() + " = " + totalSalary() + " cu.");
    }
}