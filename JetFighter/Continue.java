import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Continue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Continue extends PostGameActors
{
    public Continue(){
        updateImage();
        JetOneScore.getScoreInstance().resetScore();
        JetTwoScore.getScoreInstance().resetScore();
    }
    
    /**
     * Act - do whatever the GameOverText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    
    public void updateImage(){
        setImage(new GreenfootImage("Press ENTER to continue", 40, Color.BLACK, new Color(0,0,0,0)));
    }
}
