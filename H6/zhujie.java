package H6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

import org.w3c.dom.Notation;

import java.lang.annotation.RetentionPolicy;

public class zhujie {
    
}
@Table("db_student")
class student08{
    @Filedkuang(columnName = "db_id",type = "int",length = 10)
    private int id;
    @Filedkuang(columnName = "db_age",type = "int",length = 10)
    private int age;
    @Filedkuang(columnName = "db_name",type = "varchar",length = 3)
    private String name;
    public student08(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public student08() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "student08 [id=" + id + ", age=" + age + ", name=" + name + "]";
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("H6.student08");
        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (java.lang.annotation.Annotation notation : annotations) {
            System.out.println(notation);
        }
        //获得注解的value值
        Table annotate = (Table)c1.getAnnotation(Table.class);
        String value = annotate.value();
        System.out.println(value);
        //获得类指定的注解
        Filedkuang filed = (Filedkuang)c1.getDeclaredAnnotation(Filedkuang.class);
        System.out.println(filed.columnName());
        System.out.println(filed.type());
        System.out.println(filed.length());
        
    }
    
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  Table{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Filedkuang{
    String columnName();
    String type();
    int length();
}