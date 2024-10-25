package objectOriented;

public class Worker extends Person {
    String factory;
    public Worker(String name, int age, String factory) {
        super(name, age);
        this.factory = factory;
    }

    @Override
    public String toString() {
        return "Worker [factory=" + factory + ", name=" + name + ", age=" + age + "]";
    }
}
