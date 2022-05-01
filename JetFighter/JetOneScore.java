import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetOneScore here.
 * 
 * @author (shradha yewale) 
 * @version (a version number or a date)
 */
public class JetOneScore extends ScoreCard
{
    private static int score = 0;
    private static JetOneScore jetOneScore;
    
    /**
     * Act - do whatever the JetOneScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        updateScore();
    }
    
    public static JetOneScore getScoreInstance() {
        if(jetOneScore == null) {
            return new JetOneScore();
        }
        return jetOneScore;
    }
    
    public void setScore() {
        score += 1;
    }

    public int getScore() {
        return score;
    }
    
    public void updateScore() {
        JetOneScore.getScoreInstance().setScore();   
    }
    
    
}
