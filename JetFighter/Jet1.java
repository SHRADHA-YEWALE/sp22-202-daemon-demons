import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet1 extends Jet implements IDetectHitSubject
{ 
    public Jet1(int mode) {
        super(mode);
        GreenfootImage jet1 =  new GreenfootImage("jet_black.png");
        jet1.scale(60,60);
        setImage(jet1);
    }
    
    public Jet1(int mode, int mvmntSpeed, int bulletSpeed) {
        super(mode, mvmntSpeed, bulletSpeed);
    }
    
    public void act() {
        super.act();
        if(isTouching(Bullet2.class)) {
            notifyObservers();
        }
    }
    
    public void shoot() {
        Bullet1 b = new Bullet1(super.getBulletSpeed());
        b.setRotation(getRotation());
        getWorld().addObject(b, (int)super.getBulletX(), (int)super.getBulletY());
    }
    
    public void notifyObservers() {
        //notify observer to update the score of jet2
        JetTwoScore.getScoreInstance().updateScore();
    }
}
