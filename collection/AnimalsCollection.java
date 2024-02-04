package collection;

import config.SupportMethods;
import creature.Animal;
import java.util.ArrayList;
import java.util.List;

public class AnimalsCollection {

    private final List<Animal> animals;

    public AnimalsCollection() {
        animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal) && animal != null) {
            animals.add(animal);
        }
    }

    public void showAnimals(){
        if (animals.size() > 0){
            System.out.println("We have Animals at the moment: ");
            for (int i = 0; i < animals.size(); i++) {
                System.out.printf("Animal Nr. %d - (%s)\n", i + 1, animals.get(i));
            }
        }else{
            System.out.println();
            System.out.println("No Animals at the moment");
        }
    }

    public void showAnimalCommands(int number){
        if (animals.size() >= number && number > 0){
            System.out.printf("Animal Nr. %d commands are: (%s)\n",number, animals.get(number-1).getCommands());
        }else{

            System.out.println("Incorrect number, try again");
            System.out.println();
        }
    }

    public void addNewCommand(int number){
        if (animals.size() >= number && number > 0){
            System.out.printf("Animal Nr. %d commands are: (%s)\n",number, animals.get(number-1).getCommands());

            System.out.println("Insert new command");
            String newCommand = new SupportMethods().stringReader();
            animals.get(number-1).addCommand(newCommand);
            System.out.println("Command " + newCommand + " was added to commands list");

        }else{

            System.out.println("Incorrect number, try again");
            System.out.println();
        }
    }

    public void removeAnimal(int number){

        if (animals.size() >= number && number > 0){
            animals.remove((number-1));
            System.out.println("Animal " + number + " was removed");

        }else{

            System.out.println("Incorrect number, try again");
            System.out.println();
        }
    }
}