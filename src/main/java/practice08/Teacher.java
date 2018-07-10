package practice08;

public class Teacher extends Person{

    Klass klass;

    public Teacher (int id,String name ,int age,Klass klass){
        super(id,name,age);
        this.klass=klass;
    }
    public Teacher(int id,String name, int age) {
        super(id ,name, age);
    }
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
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


    @Override
    public String introduce() {
        if(klass!=null)
            return super.introduce() +" I am a Teacher. I teach Class "+klass.getNumber()+".";
        else{
            return super.introduce() +" I am a Teacher. I teach No Class.";
        }
    }

    public String  introduceWith(Student student){
        if(student.getKlassNumber()==klass.getNumber())
            return super.introduce() +" I am a Teacher. I teach "+student.getName()+".";
        else {
            return super.introduce() +" I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
