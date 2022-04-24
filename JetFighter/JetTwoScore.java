import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetTwoScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JetTwoScore extends ScoreCard
{
    private int score = 0;
    /**
     * Act - do whatever the JetOneScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public JetTwoScore(DetectHit detectHit) {
        super(detectHit);
    }
    
    public void update() {
        if(detectHit.getHitJet().equalsIgnoreCase("Jet2")) {
            score = score + 1;    
        }
    }
}
