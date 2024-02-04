package console;

public class ConsoleView {

    public static void showMainMenu() {
        System.out.println("----MENU----");
        System.out.println(" Please choose number of command and press Enter");
        System.out.println(" 1. Add new Animal to collection");
        System.out.println(" 2. Show all Animals in collection");
        System.out.println(" 3. Show Animal commands");
        System.out.println(" 4. Teach Animal a new command");
        System.out.println(" 5. Remove Animal from collection");
        System.out.println(" 6. Get total generated creatures counter");
        System.out.println(" 0. Quit program");
        System.out.println(" ---------------");
    }

    public static void choseNumber() {
        System.out.println(" Please choose number of Animal to create and press Enter");
        System.out.println(" 1. Cat, 2. Dog, 3. Hamster");
    }

    public static void animalCreated() {
        System.out.println("----Animal was successfully created and added to collection----");
    }


    public static void exitFromProgram() {
        System.out.println("----BUY----");
    }

    public static void animalNotCreated() {
        System.out.println("----Animal was not created----");
    }

    public static void noSuchOption() {
        System.out.println("----No such option in the list----");
    }
}