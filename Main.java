import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new Statistics());
        game.addPlayer(new PlayerComp("janusz"));
        game.addPlayer(new PlayerComp("janusz"));
        game.addPlayer(new PlayerComp("Mateusz"));

        game.printPlayers();

        for (int i=0; i<100; ++i) {
            game.play();
        }

        game.stats.print();
    }
}