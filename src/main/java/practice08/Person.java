package practice08;


public class Person {
    int id;
    String name;
    int age;
    public Person (int id,String name ,int age){
        this.id=id;
        this.name=name;
        this.age=age;
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

    @Override
    public boolean equals(Object person) {
        return  this.id==((Person)person).id;
    }

    public  String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }
}