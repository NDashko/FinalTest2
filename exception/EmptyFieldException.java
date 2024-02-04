package exception;

public class EmptyFieldException extends AnimalCreationException{

    public EmptyFieldException(){
        super();
        System.err.println("Empty fields");
    }
}