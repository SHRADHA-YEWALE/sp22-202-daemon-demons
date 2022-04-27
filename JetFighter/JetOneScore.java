import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetOneScore here.
 * 
 * @author (shradha yewale) 
 * @version (a version number or a date)
 */
public class JetOneScore extends ScoreCard
{
    private int score = 0;
    /**
     * Act - do whatever the JetOneScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Score:" + score,50, Color.GREEN,Color.BLACK));
    }
    
    public JetOneScore(DetectHit detectHit) {
        super(detectHit);
        setImage(new GreenfootImage("Score:" + score,50, Color.GREEN,Color.BLACK));
    }
    
    public void update() {
        if(detectHit.getHitJet().equalsIgnoreCase("Jet1")) {
            score = score + 1;    
        }
    }
    
    
}
