/**
 * Player class to get user input and display Player name
 * 
 * @author (Puneet Tokhi) 
 * @version (a version number or a date)
 */
public class Player  
{
    private static String player1 = "Player 1";
    private static String player2 = "Player 2";
    
    public static String getPlayer1Name() {
        return player1;
    }
    
    public static String getPlayer2Name() {
        return player2;
    }
    
    public static void setPlayer1Name(String name) {
        Player.player1 = name;
    }
    public static void setPlayer2Name(String name) {
        Player.player2 = name;
    }
}
