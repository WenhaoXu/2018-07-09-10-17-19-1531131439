package practice02;

public class Person {
    String name;
    int age;
    int Klass;
    public Person (String name ,int age){
        this.name=name;
        this.age=age;
    }
    public Person (String name ,int age,int number){
        this.name=name;
        this.age=age;
        this.Klass=number;
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


     public  String introduce(){
            return "My name is "+getName()+". I am "+getAge()+" years old.";
        }
}
