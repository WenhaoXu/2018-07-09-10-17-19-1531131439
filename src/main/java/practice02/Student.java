package practice02;

public class Student extends Person{

    int Klass;

    public Student (String name ,int age,int number){
        super(name,age);
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
        return "I am a Student. I am at Class "+getKlass()+".";
    }
}
