package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

//    Klass klass;
    LinkedList<Klass> Classes;

    public Teacher(int id, String name, int age, LinkedList Classes) {
        super(id, name, age);
        this.Classes = Classes;
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
        if (Classes != null){
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
        for (int i=0;i<Classes.size();i++) {
            if (student.getKlassNumber() == Classes.get(i).getNumber())
                return true;

        }
        return false;
    }
}