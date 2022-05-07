import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{   
    private static int speed = 6;
    private int range = 600;
    
    public GreenfootSound explosionSound= new GreenfootSound("explosion.mp3");
    public enum BOUNDS{
        IN_BOUNDS, TOP, RIGHT, BOTTOM, LEFT
    };
    
    public Bullet() {
        scale();
    }
    
    public Bullet(int speed) {
        this.speed = speed;
        range = range / speed;
        scale();
    }
    
    public static int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (range >= 0) {
            move(speed);
            wrap();
            countdown();
        }
    }
    
    public void countdown() {
        if (range <= 0 ) {
            explode();
            getWorld().removeObject(this);
        }
        else {
            range = range - 1;     
        }
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
    
    public void scale(){
        GreenfootImage bulletImage = getImage();
        bulletImage.scale(10, 10);
    }
    
    public void explode(){
        int x = getX();
        int y = getY(); 
        
        World w = getWorld();
        
        int fireBalls = 4;
        int rotationSpread = 360/fireBalls;
        
        
        for(int angle =0; angle < 360; angle += rotationSpread){
            Explosion e = new Explosion();
            e.setRotation(angle);
            w.addObject(e, x, y);
            explosionSound.play();
            //timer--;
        } 
    }
    
}
