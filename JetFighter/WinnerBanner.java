import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinnerBanner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinnerBanner extends PostGameActors
{
    WinnerBanner(int score1, int score2){
        updateImage(score1, score2);
    }
    
    /**
     * Act - do whatever the GameOverText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void updateImage(int score1, int score2){
        Player player1 = new Player();
        Player player2 = new Player();

        if(score1 == score2){
            setImage(new GreenfootImage("GAME TIED", 60, Color.BLACK, new Color(0,0,0,0)));
        }else if(score1 > score2){
            setImage(new GreenfootImage("Congratulations "+player1.getPlayer1Name() + ", you WIN!!!", 60, Color.BLACK, new Color(0,0,0,0)));
        } else {
            setImage(new GreenfootImage("Congratulations "+ player2.getPlayer2Name() + ", you WIN!!!", 60, Color.BLACK, new Color(0,0,0,0)));
        }      
    }
}
