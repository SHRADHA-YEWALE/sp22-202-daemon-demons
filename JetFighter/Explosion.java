import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private int timer = 5;
    public Explosion(){
        GreenfootImage image =  new GreenfootImage(50, 50);
        image.setColor(new Color(255,255,0,180));
        image.fillOval(0,0, image.getWidth()-1, image.getHeight()-1);
        image.fillOval(20,20, image.getWidth()-41, image.getHeight()-41);
        setImage(image);
        timer = 5;
    }
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (timer > 0){
            timer--;
            //move(1);
        }
        else{
            getWorld().removeObject(this);
        }
    }
}
