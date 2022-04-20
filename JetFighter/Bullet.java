import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int speed = 6;
    private int range = 100;
    
    public Bullet() {
    }
    
    public Bullet(int speed) {
        this.speed = speed;
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        countdown();
    }
    
    public void countdown() {
        if (range <= 0 ) {
            getWorld().removeObject(this);
        }
        else {
            range = range - 1;
        }
    }
}
