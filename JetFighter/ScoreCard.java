import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCard here.
 * 
 * @author (shradha yewale) 
 * @version (a version number or a date)
 */
public class ScoreCard extends Actor implements IUpdateScoreObserver
{
    
    private DetectHit detectHit;
    
    public ScoreCard(DetectHit detectHit) {
        this.detectHit = detectHit;
    }
    
    
    /**
     * Act - do whatever the ScoreCard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void updateScore() {
        //update scor
    }
}
