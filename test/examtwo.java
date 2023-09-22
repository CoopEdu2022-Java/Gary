package test;

public class examtwo{
    public static void main(String[] args){
        
    }
}
interface getArea{
    public double getArea();
}
class Circle implements getArea{
    private double r;
    public Circle(double r){
        this.r = r;
    }
    public double getArea(){
        return Math.PI * r * r;
    }
}
class Rectangle implements getArea{
    private double a;
    private double b;
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return a * b;
    }
}

class Triangle implements getArea{
    private double a;
    private double b;
    
    public Triangle(double a, double b){
        this.a = a;
        this.b = b;
        
    }
    public double getArea(){
        
        return a * b / 2;
    }
}