import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {
    private final Random rand = new Random();
    private final List<Player> players = new ArrayList<>();
    public final Statistics stats;
    public Game(Statistics stats){
        this.stats = stats;
    }

    public void addPlayer(Player player){
        if(!nameExists(player.getName()))
            players.add(player);
        else
        {
            player.setName(player.getName()+rand.nextInt(10)+1);
            players.add(player);
        }
    }
    private boolean nameExists(String name){
        for(Player player: players){
        if(player.getName().equals(name))
            return true;
        }
        return false;
    }
    public void play(){
        int computer;
        int guess = 0;
        do {
            computer = rand.nextInt(6) + 1;
            System.out.println("Komputer: " + computer);

            for (Player player : players) {
                guess = player.guess();
                System.out.println("Gracz: " + player.getName());

                if (computer != guess)
                    System.out.println("Źle, próbuj dalej.");
                else
                    System.out.println("Brawo!");
            }
        }
        while(computer!=guess);
    }

    public void printPlayers(){
        System.out.println("*** PLAYERS ***");
        for(Player player : players){
            System.out.println(player.getName());
        }
    }
}
