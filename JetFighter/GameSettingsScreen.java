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
       
        addObject(new BulletSpeed(), 200, 420);
        addObject( new BulletDecrementSpeedButton(), 420, 420);
        addObject(new BulletSpeedLabel(), 460, 420);
        addObject(new BulletIncrementSpeedButton(), 510, 420); 
        
        addObject(new JetSpeed(),200, 490);
        addObject( new JetDecrementSpeedButton(), 420, 490);
        addObject(new JetSpeedLabel(), 460, 490);
        addObject(new JetIncrementSpeedButton(), 510,490); 
        
        Buttons buttons = new Buttons();
        MenuOption back = buttons.getButton("Back");
        addObject(back, 160, 500);
        
        //addObject(new Back(),160,500);
        
    }
}
