import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ScoreCard observer will update the jet scores
 * 
 * @author (shradha yewale) 
 * @version (a version number or a date)
 */
public class ScoreCard extends Actor implements IUpdateScoreObserver
{
    private static ScoreCard instance;
    
    
    /**
     * Act - do whatever the ScoreCard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        updateScore();
    }
    
    public void updateScore() {
        //update score
    }
}
