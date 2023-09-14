package twoone;

public class H6 {
    public static void main(String[] args) {
    employee employee1 = new employee("John", "Manager", 5000);
    employee employee2 = new employee("Mary", "Secretary", 3000);
    employee employee3 = new employee("Bob", "Engineer", 4000);

    employee1.updateSalary(6000.0);
    employee2.updateSalary(4000.0);
    employee1.calculateSalary();
    employee2.calculateSalary();
    }
}
class employee{
    private String name;
    private String jobtitle;
    private double salary;
    private double allSalary;
    public employee(String name, String jobtitle, double salary){
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    public void updateSalary(double salary){
        this.salary = salary;
    }
        
    
    public void calculateSalary(){
        this.allSalary = this.salary * 12;
    }

}