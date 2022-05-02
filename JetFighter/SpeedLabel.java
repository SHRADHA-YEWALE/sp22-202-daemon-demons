import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedLabel extends GameSettingsOptions
{
    public SpeedLabel(String label){
        GreenfootImage speedLabel =  new GreenfootImage(200,200);
        Font adjustedFont = new Font(true, false, 30);
        speedLabel.setFont(adjustedFont);
        speedLabel.setColor(Color.LIGHT_GRAY);
        speedLabel.drawString(label, 0, 50);
        setImage(speedLabel);
    }
    
    public void act()
    {
        //checkMouse();
    }
}
