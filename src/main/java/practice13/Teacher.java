package practice13;

import java.util.LinkedList;
import java.util.concurrent.Callable;

public class Teacher extends Person implements CallTeacherAndComputer {

    //    Klass klass;
    LinkedList <Klass> Classes = new LinkedList <Klass>();

    public Teacher(int id, String name, int age, LinkedList Classes) {
        super(id, name, age);
        this.Classes = Classes;
        if(this.Classes.size()>0) {
            for (Klass klass : this.Classes
                    ) {
                klass.Attach(this);
            }
        }
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return Classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.Classes = classes;
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
        if (Classes.size() != 0){
            String classString="";
            for(int i=0;i<Classes.size()-1;i++){
                classString=classString+Classes.get(i).number+", ";
            }
            return super.introduce() + " I am a Teacher. I teach Class " + classString + Classes.get(Classes.size()-1).number+".";}
        else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        for (int i=0;i<Classes.size();i++) {
            if (student.getKlassNumber() == Classes.get(i).getNumber())
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";

        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public Boolean isTeaching(Student student){
      return   Classes.stream().filter(klass -> klass.isIn(student)).count()==1;
    }

    @Override
    public  void callTeacherAndComputerTheLeader(Student student){
        System.out.print("I am "+name+". I know "+student.name+" become Leader of Class "+student.getKlassNumber()+".\n");
    }
    @Override
    public  void callTeacherAndComputerInClass(Student student){

        System.out.print("I am "+name+". I know "+student.name+" has joined Class "+student.getKlassNumber()+".\n");
    }
}
