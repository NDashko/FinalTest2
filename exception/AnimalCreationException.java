package exception;

public class AnimalCreationException extends IllegalArgumentException{

    public AnimalCreationException(){
        super("Animal was not created");
    }
}