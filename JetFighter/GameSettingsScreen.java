import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
/**
 * Write a description of class GameSettingsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameSettingsScreen extends World
{
    GreenfootImage background = new GreenfootImage("startScreen.jpg");
    private int imageCount = 0;
    JetIncrementSpeedButton jetIncrButton = new JetIncrementSpeedButton();
    BulletDecrementSpeedButton bulletDecrButton = new BulletDecrementSpeedButton();
    Label jetValidationLabel = new Label("Jet speed should be lower than Bullet speed");
    Label bulletValidationLabel = new Label("Bullet speed should be higher than Jet speed");

    /**
     * Constructor for objects of class GameSettingsScreen.
     * 
     */
    public GameSettingsScreen()
    {    
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
        gameLogo.scale(350,350);
        addObject(new Logo(gameLogo), 440, 140);
       
        addObject(new BulletSpeed(), 210, 420);
        addObject(bulletDecrButton, 450, 420);
        addObject(new BulletSpeedLabel(), 480, 420);
        addObject(new BulletIncrementSpeedButton(), 530, 420); 
        
        addObject(new JetSpeed(),200, 490);
        addObject( new JetDecrementSpeedButton(), 450, 490);
        addObject(new JetSpeedLabel(), 480, 490);
        addObject(jetIncrButton, 530,490); 
        
        Buttons buttons = new Buttons();
        MenuOption back = buttons.getButton("Back");
        addObject(back, 160, 500);
    }
    
    public void act(){
        imageCount -= 4;
        animateImage(background);
        validateSpeeds();
    }
    
    public void animateImage(GreenfootImage image) {
        if (imageCount <  -image.getWidth()) {
            imageCount += image.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(image, temp, 0);
        getBackground().drawImage(image, temp + image.getWidth(), 0);
    }
    
    public void validateSpeeds(){
        if(!jetIncrButton.getValidateFlag())
            addObject(jetValidationLabel, 680, 430);
        else{
            removeObject(jetValidationLabel);
        }
        
        if(!bulletDecrButton.getValidateFlag())
            addObject(bulletValidationLabel, 680, 362);
        else{
            removeObject(bulletValidationLabel);
        }
    }
}
