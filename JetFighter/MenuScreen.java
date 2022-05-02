import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{
    GreenfootImage background = new GreenfootImage("startScreen.jpg");
    private int imageCount = 0;
    /**
     * Constructor for objects of class PlayScreen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage gameLogo = new GreenfootImage("logo_white.png");
        gameLogo.scale(400,400);
        Logo logo = new Logo(gameLogo);
        addObject(logo, 200, 130);
        logo.setLocation(440,175);
        
        Play play = new Play();
        addObject(play,259,160);
        
        Settings settings = new Settings();
        addObject(settings,270,278);

        Quit quit = new Quit();
        addObject(quit,287,353);
        
        play.setLocation(450, 340);
        settings.setLocation(450, 415);
        quit.setLocation(450, 440);
        
    }
    
    public void act(){
        imageCount -= 4;
        animateImage(background);
    }
    public void animateImage(GreenfootImage image) {
        if (imageCount <  -image.getWidth()) {
            imageCount += image.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(image, temp, 0);
        getBackground().drawImage(image, temp + image.getWidth(), 0);
    }
}