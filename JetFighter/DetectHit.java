import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class DetectHit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DetectHit extends Actor implements IDetectHitSubject
{
    private IUpdateScoreObserver observer;
    private String hitJet;
    private Jet jet;
    private ArrayList<IUpdateScoreObserver> observers = new ArrayList<>();
    
    /**
     * Act - do whatever the DetectHit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }

   
    public void setHitJet(String jet) {
        this.hitJet = jet;
        notifyObservers();
    }
    
    public String getHitJet() {
        return hitJet;
    }
    
    public void attach(IUpdateScoreObserver obj) {
        observers.add(obj);
    }
    
    public void detach(IUpdateScoreObserver obj) {
        observers.remove(obj);
    }
    
    
    public void notifyObservers()
    {
        for (IUpdateScoreObserver obj: observers) {
            observer.updateScore();
        }
    }

}
