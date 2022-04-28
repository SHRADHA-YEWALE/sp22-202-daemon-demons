import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Write a description of class Jet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet extends Actor implements IDetectHitSubject
{
    private IMovementStrategy strat;
    private int mvmntSpeed = 4;
    private int turnSpeed = 3;
    private int bulletSpeed = 6;
    private Jet jet = this;
    
    public enum BOUNDS{
        IN_BOUNDS, TOP, RIGHT, BOTTOM, LEFT
    };
    
    public Jet(int mode) {
        if (mode == 0) {
            strat = getArrowStrat();
        }
        else {
            strat = getWADStrat();
        }
    }
    
    public Jet(int mode, int mvmntSpeed, int bulletSpeed) {
        this.mvmntSpeed = mvmntSpeed;
        turnSpeed = mvmntSpeed - 1;
        this.bulletSpeed = bulletSpeed;
        if (mode == 0) {
            strat = getArrowStrat();
        }
        else {
            strat = getWADStrat();
        }
    }
    
    /**
     * Act - do whatever the Jet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        strat.turn();
        strat.shoot();
        strat.move();
        wrap();
    }
    
    public void shoot() {
        Bullet b = new Bullet(bulletSpeed);
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
    
    public IMovementStrategy getArrowStrat() {
        IMovementStrategy strat = new IMovementStrategy(){
            public void move() {
                jet.move(mvmntSpeed);
            }
            
            public void turn() {
                if(Greenfoot.isKeyDown("left")){
                    jet.turn(-1 * turnSpeed);
                }
                if(Greenfoot.isKeyDown("right")){
                    jet.turn(turnSpeed);
                }
            }
            
            public void shoot() {
                if(Greenfoot.isKeyDown("up")){
                    jet.shoot();
                }
            }
        };
        return strat;
    }
    
    public IMovementStrategy getWADStrat() {
        IMovementStrategy strat = new IMovementStrategy(){
            public void move() {
                jet.move(mvmntSpeed);
            }
            
            public void turn() {
                if(Greenfoot.isKeyDown("A")){
                    jet.turn(-1 * turnSpeed);
                }
                if(Greenfoot.isKeyDown("D")){
                    jet.turn(turnSpeed);
                }
            }
            
            public void shoot() {
                if(Greenfoot.isKeyDown("W")){
                    jet.shoot();
                }
            }
        };
        return strat;
    }
    
    public void notifyObservers() {
        //do nothing
    }
    
    public int getBulletSpeed() {
        return bulletSpeed;
    }
}
