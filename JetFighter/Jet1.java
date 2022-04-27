import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet1 extends Jet
{
    public Jet1(int mode) {
        super(mode);
    }
    
    public void shoot() {
        Bullet1 b = new Bullet1();
        b.setRotation(getRotation());
        getWorld().addObject(b, (int)super.getBulletX(), (int)super.getBulletY());
    }
}
