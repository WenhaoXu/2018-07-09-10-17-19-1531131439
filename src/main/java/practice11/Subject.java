package practice11;
import java.util.LinkedList;

public abstract class Subject
{
    private LinkedList<Teacher> observers = new LinkedList<Teacher>();

    /// <summary>
    /// 增加观察者
    /// </summary>
    /// <param name="observer"></param>
    public void Attach(Teacher observer)
    {
        observers.add(observer);
    }

    /// <summary>
    /// 移除观察者
    /// </summary>
    /// <param name="observer"></param>
    public void Detach(Teacher observer)
    {
        observers.remove(observer);
    }

    /// <summary>
    /// 向观察者（们）发出通知
    /// </summary>
    public void Notify(Student student)
    {
        for (Teacher teacher:observers
             ) {
            teacher.callTeacherInClass(student);
        }
    }

    public void NotifyIsLeader(Student student)
    {
        for (Teacher teacher:observers
                ) {
            teacher.callTeacherTheLeader(student);
        }
    }
}
