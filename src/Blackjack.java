public class Blackjack {

    private int p1Score;
    private int p2Score;
    private Player player;

    private static boolean isWinner = false;
    public Blackjack() {
    }

    public void start(Player player1, Player player2) {
        while(!isWinner) {
            if(p1Score < 21 && p2Score < 21){
                int move1 = drawCard();
                p1Score += move1;
                System.out.println(player1.getName().concat(" got an " + move1 + " and has now " + p1Score));
                int move2 = drawCard();
                p2Score += move2;
                System.out.println(player2.getName().concat(" got an " + move2 + " and has now " + p2Score));
            }
            if(p1Score == 21 || p2Score > 21) {
                isWinner = true;
                System.out.println(player1.getName().concat(" is the Winner"));
            }
            if(p2Score == 21 || p1Score > 21) {
                isWinner = true;
                System.out.println(player2.getName().concat(" is the Winner"));
            }
        }
    }



    public int drawCard() {
        return (int) Math.floor(Math.random() * (13) + 1);
    }
}
