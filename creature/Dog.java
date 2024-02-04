package creature;

public class Dog extends Pet{

    public Dog(String name, String birth, String... command) {
        super(name, birth, command);
    }

    @Override
    public void voice() {
        System.out.println("Wowf");
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}