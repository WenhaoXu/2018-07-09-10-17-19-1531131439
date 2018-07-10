package practice08;


public class Student extends Person{

    Klass klass;

    public Student (int id,String name ,int age,Klass klass){
        super(id,name,age);
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

    public  String introduce() {
        if (klass.getLeader() == this) {
            return super.introduce() + " I am a Student. I am Leader of Class "+getKlassNumber()+".";
        }
        else{
            return super.introduce() + " I am a Student. I am at Class " + getKlassNumber() + ".";
        }

    }
}