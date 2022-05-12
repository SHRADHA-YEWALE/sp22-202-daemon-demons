import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletSpeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletSpeed extends GameSettingsOptions
{
    public BulletSpeed(){
        GreenfootImage bulletSpeed =  new GreenfootImage(220,200);
        Font adjustedFont = new Font(true, false, 30);
        bulletSpeed.setFont(adjustedFont);
        bulletSpeed.setColor(Color.WHITE);
        bulletSpeed.drawString("Bullet Speed:", 0, 50);
        setImage(bulletSpeed);
    }
    public void act()
    {
        //checkMouse();
    }
}
