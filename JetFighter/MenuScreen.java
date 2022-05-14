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
        
        Buttons buttons = new Buttons();
        
        MenuOption play = buttons.getButton("Play");
        addObject(play, 450, 340);
        
        MenuOption instructions = buttons.getButton("Instructions");
        addObject(instructions, 450, 435);
        
        MenuOption settings = buttons.getButton("Settings");
        addObject(settings, 450, 465);
        
        MenuOption quit = buttons.getButton("Quit");
        addObject(quit, 450, 490);

    }
    
    public void act(){
        imageCount -= 4;
        animateImage(background);
    }
    
     /**
      * Create a dynamic moving background
      */
    public void animateImage(GreenfootImage image) {
        if (imageCount <  -image.getWidth()) {
            imageCount += image.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(image, temp, 0);
        getBackground().drawImage(image, temp + image.getWidth(), 0);
    }
}