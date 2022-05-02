import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("background.mp3");
    private int imageCount = 0;

    GreenfootImage background = new GreenfootImage("startScreen.jpg");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1); 
        prepare();
    }

    private void prepare(){ 
        TitleLetters titleLetters = new TitleLetters(); 
        addObject(titleLetters, 220, 220); 
        titleLetters.setLocation(400,190);

        GreenfootImage gameLogo = new GreenfootImage("logo_white.png");
        gameLogo.scale(400,400);

        Logo logo = new Logo(gameLogo);
        addObject(logo, getWidth()/2, 210);

    }

    public void act(){ 
        backgroundMusic.play();
        imageCount -= 4;
        animateImage(background);
        if("enter".equals(Greenfoot.getKey())){
            Greenfoot.setWorld(new MenuScreen());
        } 
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