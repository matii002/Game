import java.util.Random;

public abstract class Player {
    private String name = "Janusz";
    public Player(){}

    public Player(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z0-9~.]{3,}$"))
            this.name = name;
        else
            throw new IllegalArgumentException("Nieprawidłowe imię!");
    }
    abstract public int guess();
}
