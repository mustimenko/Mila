package pack;

public class Animals extends People {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void doMiau() {
        System.out.println("Miau");
    }
    public void Print (int age) {
        System.out.println("My age is " + age);
    }
    public void Print(String name) {
        System.out.println("My name is " + name);
    }
}
