package practice05;

public class Worker extends Person{

    public Worker(String name, int age) {
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

    @Override
    public String introduce() {
        return super.introduce() +" I am a Worker. I have a job.";
    }
}