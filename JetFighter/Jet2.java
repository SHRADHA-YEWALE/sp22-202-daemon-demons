import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jet2 extends Jet implements IDetectHitSubject
{
    public Jet2(int mode) {
        super(mode);
        GreenfootImage jet2 =  new GreenfootImage("jet_white.png");
        jet2.scale(60,60);
        setImage(jet2);
    }
    
    public Jet2(int mode, int mvmntSpeed, int bulletSpeed) {
        super(mode, mvmntSpeed, bulletSpeed);
    }
    
    public void act() {
        super.act();
        Actor b1 = getOneIntersectingObject(Bullet1.class);
        if(b1 != null) {
            getWorld().removeObject(b1);
            notifyObservers();
        }
        JetOneScoreDisplay.getInstance().updateScoreDisplay();
    }
    
    public void shoot() {
        Bullet2 b = new Bullet2(super.getBulletSpeed());
        b.setRotation(getRotation());
        getWorld().addObject(b, (int)super.getBulletX(), (int)super.getBulletY());
    }
    
    public void notifyObservers() {
        //notify observer to update the score of jet1
        JetOneScore.getScoreInstance().updateScore();
    }
}
