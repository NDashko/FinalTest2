package config;

public class Counter implements AutoCloseable{

    private static int counter;
    static final int POSSIBLE_CREATURES = 6; // must be incremented when new type of Real animal Class is created

    public static int getCounter() {
        return counter;
    }

    public void add() {
        Counter.counter++;
    }

    @Override
    public void close() throws Exception {

        System.err.println("Counter auto closed!");
    }
}