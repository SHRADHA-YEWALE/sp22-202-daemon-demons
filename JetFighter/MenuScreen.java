import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{

    /**
     * Constructor for objects of class PlayScreen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Play play = new Play();
        addObject(play,259,160);
    }
}


