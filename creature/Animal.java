package creature;

import java.time.LocalDate;
import java.util.*;

public abstract class Animal {
    private final String name;
    private final LocalDate birth;
    private final Set<String> commands = new HashSet<>();

    public abstract void voice();

    public Animal(String name, String birth, String... commands) {
        this.name = name;
        this.birth = LocalDate.parse(birth);
        for (String com: commands) {
            this.commands.add(com.toLowerCase());
        }
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth.toString();
    }

    public void addCommand(String command){
        this.commands.add(command);
    }

    public HashSet<String> getCommands(){
        return (HashSet<String>) this.commands;
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                "; birth: " + getBirth();
    }
}