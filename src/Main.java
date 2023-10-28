import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Game game1 = new Game();

        Util.StringHello();
        Scanner in = new Scanner(System.in);
        Player player1 = new Player();
        player1.name = in.nextLine();
        game1.players[0] = player1.name;

        Util.StringHello();
        Player player2 = new Player();
        player2.name = in.nextLine();
        game1.players[1] = player2.name;



        System.out.println(player1.name + " " + player2.name);


    }
}