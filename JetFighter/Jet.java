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
    
    public enum BOUNDS{
        IN_BOUNDS, TOP, RIGHT, BOTTOM, LEFT
    };
    
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
        wrap();
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
    
    public BOUNDS inBounds() {
        World world = getWorld();
        if(getY() == world.getHeight() - 1)
            return BOUNDS.BOTTOM;
        else if (getY() == 0)
            return BOUNDS.TOP;
        else if (getX() == world.getWidth() - 1)
            return BOUNDS.RIGHT;
        else if (getX() == 0)
            return BOUNDS.LEFT;
        return BOUNDS.IN_BOUNDS;
    }
    
    public void wrap() {
        World world = getWorld();
        switch (inBounds()){
            case IN_BOUNDS: break;
            case TOP: setLocation(getX(), world.getHeight()- 2); break;
            case RIGHT: setLocation(1, getY()); break;
            case BOTTOM: setLocation(getX(), 1); break;
            case LEFT: setLocation(world.getWidth() - 2, getY()); break;
        }
    }
}
