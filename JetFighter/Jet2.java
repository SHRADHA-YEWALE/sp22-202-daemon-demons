import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet2 extends Jet
{
    public Jet2(int mode) {
        super(mode);
    }
    
    public void shoot() {
        Bullet2 b = new Bullet2();
        b.setRotation(getRotation());
        getWorld().addObject(b, (int)super.getBulletX(), (int)super.getBulletY());
    }
}
