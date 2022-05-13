import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *This class will update, get and reset the score for jet1.
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
    }
    
    /**
     * This will return JetOneScore instance. 
     * It null then will create new one.
     */
    public static JetOneScore getScoreInstance() {
        if(jetOneScore == null) {
            return new JetOneScore();
        }
        return jetOneScore;
    }
    
    /**
     * set jet1 score
     */
    public void setScore() {
        score += 1;
    }
    
    /**
     * get score for jet1
     */
    public int getScore() {
        return score;
    }
    
    /**
     * reset score for jet1
     */
    public void resetScore() {
        score = 0;
    }
    
    /**
     * update score for jet1
     */
    public void updateScore() {
        JetOneScore.getScoreInstance().setScore();   
    }
    
    
}
