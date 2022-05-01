import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Settings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Settings extends MenuOptions
{
       public Settings(){
        GreenfootImage settingsButton =  new GreenfootImage(165,115);
        Font adjustedFont = new Font(true, false, 30);
        settingsButton.setFont(adjustedFont);
        settingsButton.setColor(Color.LIGHT_GRAY);
        settingsButton.drawString("Settings", 0, 50);
        setImage(settingsButton);
    }
    public void act()
    {
        checkMouse();
        transitionWorld(new GameSettingsScreen());
    }
}
