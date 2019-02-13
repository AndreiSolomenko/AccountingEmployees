public class Cleaner extends Employee{

    private int rate;
    private int workedDays;

    public Cleaner(long id, String name, int age, double salary, char gender, int rate, int workedDays){
        super(id, name, age, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;
    }

    public int getRate(){
        return rate;
    }

    public void setRate(int rate){
        this.rate = rate;
    }

    public int getWorkedDays(){
        return workedDays;
    }

    public void setWorkedDays(int workedDays){
        this.workedDays = workedDays;
    }

    public double totalSalary(){
        return getSalary() + rate * workedDays;
    }

    public void printInfo(){
        System.out.println("Cleaner: id = " + getId() + "; name = " + getName() + "; age = " + getAge() + "; salary = " + getSalary() + "; gender = " + getGender() + "; rate = " + rate + "; worked days = " + workedDays + ".");
        System.out.println("Total salary of developer " + getName() + " = " + totalSalary() + " cu.");
    }
}