import java.util.Random;

public class PlayerComp extends Player{
    public PlayerComp(String name){
        super(name);
    }
    private final Random rand = new Random();

    @Override
    public int guess(){
        return rand.nextInt(6)+1;
    }
}
