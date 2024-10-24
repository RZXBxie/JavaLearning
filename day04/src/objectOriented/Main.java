package objectOriented;

public class Main {

    public static void main(String[] args) {
        // 多态测试方法
        testPolymorphism();
    }

    public static void testPolymorphism() {
        Student s1 = new Student("Tom", 18, "whu");
        Student s2 = new Student("Bob", 19, "whu");
        Student s3 = new Student("Jack", 20, "whu");

        Worker w1 = new Worker("Tom", 18, "电子厂");
        Worker w2 = new Worker("Bob", 20, "烟草厂");

        Person[] person = {s1, s2, s3, w1, w2};

        int studentCount = 0, workerCount = 0;
        for (Person p : person) {
            if (p instanceof Student) {
                studentCount++;
            } else {
                workerCount++;
            }
        }
        System.out.printf("工人人数：%d, 学生人数：%d", workerCount, studentCount);
    }
}

