import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Write a description of class Jet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet extends Actor
{
    private int mvmntSpeed = 4;
    private int turnSpeed = 3;
    
    /**
     * Act - do whatever the Jet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            turn(-1 * turnSpeed);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(turnSpeed);
        }
        if(Greenfoot.isKeyDown("up")){
            shoot();
        }
        move(mvmntSpeed);
    }
    
    public void shoot() {
        Bullet b = new Bullet();
        b.setRotation(getRotation());
        getWorld().addObject(b, (int)getBulletX(), (int)getBulletY());
    }
    
    public double getBulletX() {
        double radians = Math.toRadians(getRotation());
        return (getImage().getWidth() / 2) * Math.cos(radians) + getX();
    }
    
    public double getBulletY() {
        double radians = Math.toRadians(getRotation());
        return (getImage().getWidth() / 2) * Math.sin(radians) + getY();
    }
}
