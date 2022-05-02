import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimerDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimerDisplayDecorator extends TimerDecorator
{    
       
    public TimerDisplayDecorator(Actor timeActor){
        timer = (Timer) timeActor;
        updateImage(this.timer.getMinutes(), this.timer.getSeconds());
    }
    
    /**
     * Act - do whatever the TimerDecorator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        timer.act();
        updateImage(timer.getMinutes(), timer.getSeconds());
    }
    
    private void updateImage(int minutes, int seconds)
    {
        setImage(new GreenfootImage(String.format("%02d", minutes) + " : " + String.format("%02d", seconds), 30, Color.BLACK, new Color(0, 0, 0, 0)));
    }

}
