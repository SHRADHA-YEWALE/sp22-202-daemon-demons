import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimeBlinkDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimerBlinkDecorator extends TimerDecorator
{
    private TimerDisplayDecorator displayDecorator;
    private boolean visibility = true;
    
    public TimerBlinkDecorator(Actor timerActor){
        displayDecorator = (TimerDisplayDecorator) timerActor;
        timer = displayDecorator.getTimer();
        updateImage();
    }
    
    /**
     * Act - do whatever the TimeBlinkDecorator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        displayDecorator.act();
        updateImage();
    }
    
    private void updateImage()
    {
        int minutes = timer.getMinutes();
        int seconds = timer.getSeconds();
        
        setImage(displayDecorator.getImage());
        if(minutes == 0 && seconds < GameConfig.timeToStartBlinking){
            int actNo = timer.getActNo();
            int rem = actNo % 55;
            if(rem >= 0  && rem < 23){
                getImage().setTransparency(255);
            } else {
                getImage().setTransparency(0);
            }
        
        }
    }
}
