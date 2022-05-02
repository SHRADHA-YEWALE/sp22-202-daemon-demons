import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitGame extends PostGameActors
{
    ExitGame(){
        updateImage();
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
        setImage(new GreenfootImage("Press ESC to exit", 40, Color.BLACK, new Color(0,0,0,0)));
    }

}
