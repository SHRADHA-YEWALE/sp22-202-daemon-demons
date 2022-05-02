import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{
    private JetOneScoreDisplay jetOneScoreDisplay;
    private JetTwoScoreDisplay jetTwoScoreDisplay;
    
    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1); 
        jetOneScoreDisplay = JetOneScoreDisplay.getInstance();
        jetTwoScoreDisplay = JetTwoScoreDisplay.getInstance();
    }
}
