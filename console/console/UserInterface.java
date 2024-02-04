package console;

import collection.AnimalsCollection;
import config.Counter;
import config.SupportMethods;
import exception.AnimalCreationException;

import java.time.format.DateTimeParseException;

public class UserInterface {

    SupportMethods sm = new SupportMethods();
    AnimalsCollection col = new AnimalsCollection();

    public void run() {
        int cmd = -1;

        while (!(cmd == 0)) {

            ConsoleView.showMainMenu();
            cmd = sm.chooseNumber();

            switch (cmd) {
                case 1 -> {
                    try {

                        col.addAnimal(sm.animalCreation());
                        ConsoleView.animalCreated();

                    } catch (DateTimeParseException | AnimalCreationException e) {
                        ConsoleView.animalNotCreated();
                    }
                }
                case 2 -> col.showAnimals();
                case 3 -> {
                    col.showAnimals();
                    int num = sm.chooseNumber();
                    col.showAnimalCommands(num);
                }
                case 4 -> {
                    col.showAnimals();
                    int num = sm.chooseNumber();
                    col.addNewCommand(num);
                }
                case 5 -> {
                    col.showAnimals();
                    if (col.getAnimals().size() < 1){
                    } else{
                        int num = sm.chooseNumber();
                        col.removeAnimal(num); }
                }
                case 6 -> System.out.println("Total generated qty of creatures : " + Counter.getCounter());
            }
        }
        ConsoleView.exitFromProgram();
    }
}