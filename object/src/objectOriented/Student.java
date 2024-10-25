package objectOriented;

public class Student extends Person {
    String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
    }
}
