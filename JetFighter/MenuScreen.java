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
        GreenfootImage gameLogo = new GreenfootImage("game_logo.png");
        gameLogo.scale(350,350);
        Logo logo = new Logo(gameLogo);
        addObject(logo, 200, 130);
        logo.setLocation(294,133);
        
        Play play = new Play();
        addObject(play,259,160);
        
        Settings settings = new Settings();
        addObject(settings,240,278);

        Quit quit = new Quit();
        addObject(quit,287,353);
        
        play.setLocation(300, 250);
        settings.setLocation(300, 325);
        quit.setLocation(300, 350);
    }
}


