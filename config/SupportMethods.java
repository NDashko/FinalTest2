package config;

import console.ConsoleView;
import creature.*;
import exception.AnimalCreationException;
import exception.EmptyFieldException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SupportMethods {

    public int chooseNumber() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Incorrect input, try again");
        }
        return chooseNumber();
    }

    public String stringReader() {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        if (!result.trim().equals("")) { return result;  }
        else{
            System.out.println("String is empty");
            return "";
        }
    }

    public Animal animalCreation(){

        String name, birth, command;
        int liftingCapacity;

        Scanner sc = new Scanner(System.in);
        ConsoleView.choseNumber();
        int userChoice = sc.nextInt();

        if (userChoice > Counter.POSSIBLE_CREATURES || userChoice < 1){
            ConsoleView.noSuchOption();
            throw new AnimalCreationException();
        }

        System.out.println("Insert name");
        name = stringReader();
        System.out.println("Insert birthdate in format yyyy-mm-dd");
        birth = stringReader();
        System.out.println("Insert command it knows");
        command = stringReader();

        switch (userChoice) {
            case 1,2,3 -> {
                

                try (Counter counter = new Counter()) {
                    checkForEmptyData(name, birth, command);
                    counter.add();

                } catch (Exception e) {
                    throw new AnimalCreationException();
                }

                if (userChoice == 1) {
                    return new Cat(name, birth, command);
                } else if (userChoice == 2) {
                    return new Dog(name, birth, command);
                } else return new Hamster(name, birth, command);
            }

            case 4,5,6 -> {

                System.out.println("Insert lifting capacity in Int");
                liftingCapacity = chooseNumber();

                try (Counter counter = new Counter()) {
                    checkForEmptyData(name, birth, liftingCapacity, command);
                    counter.add();

                } catch (Exception e) {
                    throw new AnimalCreationException();
                }

                }

            default ->
                    System.err.println("Incorrect number, try again");
        }

        return null;
    }

    private double getDouble() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextDouble();
        }catch (InputMismatchException e){
            System.err.println("Incorrect double format is inserted, must be with coma (,)");
            return -1;
        }
    }


    private void checkForEmptyData(String name, String birth, String command) {

        if (name.equals("") || birth.equals("") || command.equals("")){
            throw new EmptyFieldException();
        }
    }

    private void checkForEmptyData(String name, String birth, int liftingCapacity, String command) {

        if (name.equals("") || birth.equals("") || liftingCapacity < 0 || command.equals("")){
            throw new EmptyFieldException();
        }

    }
}