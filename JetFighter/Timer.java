import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimerDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int noActs = 55*60; //about 60 seconds
    private int minutes = 0;
    private int seconds = 0;
 
    public Timer(int noOfSeconds)
    {
        noActs = 55 * noOfSeconds;
        minutes = noOfSeconds / 60;
        seconds = noOfSeconds % 60;
    }
     
    public void act()
    {
        noActs--;
        if (noActs % 55 == 0) {
            minutes = noActs / 55 / 60;
            seconds = noActs / 55 % 60;
        };
        if (noActs < 1) Greenfoot.stop();
    }
     
    public int getMinutes(){ return minutes; }
    
    public int getSeconds() { return seconds; }
    
    public int getActNo() { return noActs; }
}
