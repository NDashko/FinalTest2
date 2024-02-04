package creature;

public class Cat extends Pet{

    public Cat(String name, String birth, String... command) {
        super(name, birth, command);
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
