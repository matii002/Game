import java.util.Scanner;

public class PlayerHuman extends Player{
    public PlayerHuman(String name){
    super(name);
    }
    private final Scanner scan = new Scanner(System.in);

    @Override
    public int guess(){
        System.out.print("Podaj liczbę(1-6): ");
        return scan.nextInt();
    }
}
