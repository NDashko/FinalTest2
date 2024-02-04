package creature;

public class Hamster extends Pet{

    public Hamster(String name, String birth,  String... command) {
        super(name, birth, command);
    }

    @Override
    public void voice() {
        System.out.println("Pee-pee-pee");
    }

    @Override
    public String toString() {
        return "Hamster " + super.toString();
    }
}