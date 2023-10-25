package pack;

public class People {
    private String namePeop;
    private int agePeop;
    public String getName() {
        return namePeop;
    }
    public int getAge() {
        return agePeop;
    }
    public void Diolog(String namePeop, int agePeop) {
        System.out.println("My name is " + namePeop + ".");
        System.out.println("My age is " + agePeop + ".");
    }
}
