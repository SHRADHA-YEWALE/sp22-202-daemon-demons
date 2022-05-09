import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsScreen extends World
{
    GreenfootImage background = new GreenfootImage("startScreen.jpg");
    private int imageCount = 0;
    
    /**
     * Constructor for objects of class InstructionsScreen.
     * 
     */
    public InstructionsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1); 
        prepare();
    }
    
    private void prepare()
    {
        GreenfootImage gameLogo = new GreenfootImage("logo_white.png");
        gameLogo.scale(350,350);
        addObject(new Logo(gameLogo), 440, 140);
        
        Buttons buttons = new Buttons();
        MenuOption back = buttons.getButton("Back");
        addObject(back, 440, 500);
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
