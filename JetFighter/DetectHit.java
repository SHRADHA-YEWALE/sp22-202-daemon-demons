import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DetectHit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DetectHit extends Actor implements IDetectHitSubject
{
    private IUpdateScoreObserver observer;
    private Jet hitJet;
    
    /**
     * Act - do whatever the DetectHit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void setHitJet(Jet jet) {
        hitJet = jet;
        notifyObservers();
    }
    
    public Jet getHitJet() {
        return hitJet;
    }
    
    public void notifyObservers()
    {
        observer.updateScore();
    }

}
