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
        if(score1 == score2){
            setImage(new GreenfootImage("GAME TIED", 60, Color.BLACK, Color.WHITE));
        }else if(score1 > score2){
            setImage(new GreenfootImage("PLAYER 1 WINS ", 60, Color.BLACK, Color.WHITE));
        } else {
            setImage(new GreenfootImage("Player 2 Wins", 60, Color.BLACK, new Color(0,0,0,0)));
        }
        
        
    }
}
