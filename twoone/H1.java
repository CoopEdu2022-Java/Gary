package twoone;

public class H1{
    
    public static void main(String[] args){
        Person p1 = new Person(22222,"23");
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        Person p2 = new Person(21,"11");
        System.out.println(p2.getAge());
        System.out.println(p2.getName());

    }
}
class Person{
    private int age;
    
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    
    }
    public int getAge(){
        return this.age;
    } 
    public String getName(){
        return this.name;
    }

}






