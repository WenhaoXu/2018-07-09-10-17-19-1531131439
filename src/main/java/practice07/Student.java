package practice07;

public class Student extends Person{

    Klass klass;

    public Student (String name ,int age,Klass klass){
        super(name,age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
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
     public int getKlassNumber(){
        return klass.getNumber();
     }

    public  String introduce(){
        return super.introduce()+" I am a Student. I am at Class "+getKlassNumber()+".";
    }


}

