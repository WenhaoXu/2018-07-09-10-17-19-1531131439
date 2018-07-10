package practice13;

import java.util.LinkedList;

public abstract class Subject
{
    private LinkedList<CallTeacherAndComputer> observers = new LinkedList<CallTeacherAndComputer>();

    public void Attach(CallTeacherAndComputer observer)
    {
        observers.add(observer);
    }


    public void Detach(CallTeacherAndComputer observer)
    {
        observers.remove(observer);
    }


    public void Notify(Student student)
    {

        for (CallTeacherAndComputer object:observers
             ) {
            object.callTeacherAndComputerInClass(student);
        }


    }

    public void NotifyIsLeader(Student student)
    {
        for (CallTeacherAndComputer object:observers) {
            object.callTeacherAndComputerTheLeader(student);
        }
    }
}
