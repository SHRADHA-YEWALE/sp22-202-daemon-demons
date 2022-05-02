import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetSpeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JetSpeed extends GameSettingsOptions
{
    public JetSpeed(){
        GreenfootImage bulletSpeed =  new GreenfootImage(200,200);
        Font adjustedFont = new Font(true, false, 30);
        bulletSpeed.setFont(adjustedFont);
        bulletSpeed.setColor(Color.WHITE);
        bulletSpeed.drawString("Jet Speed:", 0, 50);
        setImage(bulletSpeed);
    }
    public void act()
    {
        //checkMouse();
    }
}
