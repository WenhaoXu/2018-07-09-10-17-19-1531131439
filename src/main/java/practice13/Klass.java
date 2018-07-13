package practice13;

public class Klass extends Subject {
    int number;
    Student leader;
    public Klass(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public void assignLeader(Student student){
        if(student.getKlassNumber()==number)
        {
            leader=student;
            NotifyIsLeader(student);
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }


    public void appendMember(Student student){
        student.setKlassNumber(number);
        Notify(student);
    }


    public boolean isIn(Student student){
      return   student.getKlassNumber()==number;

    }

}

