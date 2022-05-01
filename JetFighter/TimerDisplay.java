import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimerDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimerDisplay extends Actor
{
    private int timer = 55*60; //about 60 seconds
 
    public TimerDisplay()
    {
        updateImage();
    }
     
    public void act()
    {
        
    }
     
    private void updateImage()
    {
        setImage(new GreenfootImage("Time: " + timer/55, 20, Color.BLACK, new Color(0, 0, 0, 0)));
    }
}
