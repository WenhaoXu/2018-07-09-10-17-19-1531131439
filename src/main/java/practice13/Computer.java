package practice13;

public class Computer implements CallTeacherAndComputer{
    String name ;
  public Computer(String name){
      this.name=name;
  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void callTeacherAndComputerInClass(Student student) {
        System.out.print("I am "+name+". I know "+student.name+" has joined Class "+student.getKlassNumber()+".\n");
    }

    @Override
    public void callTeacherAndComputerTheLeader(Student student) {
        System.out.print("I am the "+name+". I know "+student.name+" become Leader of Class "+student.getKlassNumber()+".\n");
    }
}
