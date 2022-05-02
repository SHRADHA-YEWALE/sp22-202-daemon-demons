import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimerDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int timer = 55*60; //about 60 seconds
    private int minutes = 0;
    private int seconds = 0;
 
    public Timer(int noOfSeconds)
    {
        timer = 55 * noOfSeconds;
        minutes = noOfSeconds / 60;
        seconds = noOfSeconds % 60;
    }
     
    public void act()
    {
        timer--;
        if (timer % 55 == 0) {
            minutes = timer / 55 / 60;
            seconds = timer / 55 % 60;
        };
        if (timer < 1) Greenfoot.stop();
    }
     
    public int getMinutes(){ return minutes; }
    
    public int getSeconds() { return seconds; }
}
