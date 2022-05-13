import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class will update, get and reset the score for jet2.
 * 
 * @author (shradha yewale) 
 * @version (a version number or a date)
 */
public class JetTwoScore extends ScoreCard
{
    private static int score = 0;
    private static JetTwoScore jetTwoScore;
    /**
     * Act - do whatever the JetOneScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        super.act();
    }
    
    /**
     * This will return JetTwoScore instance. 
     * It null then will create new one.
     */
    public static JetTwoScore getScoreInstance() {
        if(jetTwoScore == null) {
            return new JetTwoScore();
        }
        return jetTwoScore;
    }
    
    /**
     * set jet2 score
     */
    public void setScore() {
        score += 1;
    }

    /**
     * get score for jet2
     */
    public int getScore() {
        return score;
    }
    
    /**
     * reset score for jet2
     */
    public void resetScore() {
        score = 0;
    }
    
    /**
     * update score for jet2
     */
    public void updateScore() {
        JetTwoScore.getScoreInstance().setScore();   
    }
    
}
