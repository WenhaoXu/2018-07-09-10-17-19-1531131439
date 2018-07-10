package practice07;

public class Teacher extends Person{
    int Klass;
    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.Klass=klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    @Override
    public String introduce() {
        if(Klass!=0)
            return super.introduce() +" I am a Teacher. I teach Class "+getKlass()+".";
        else{
            return super.introduce() +" I am a Teacher. I teach No Class.";
        }
    }
}
