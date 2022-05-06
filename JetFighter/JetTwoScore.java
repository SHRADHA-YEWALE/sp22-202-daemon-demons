import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetTwoScore here.
 * 
 * @author (your name) 
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
    
    public static JetTwoScore getScoreInstance() {
        if(jetTwoScore == null) {
            return new JetTwoScore();
        }
        return jetTwoScore;
    }
    
    public void setScore() {
        score += 1;
    }

    public int getScore() {
        return score;
    }
    
    public void resetScore() {
        score = 0;
    }
    
    public void updateScore() {
        JetTwoScore.getScoreInstance().setScore();   
    }
    
}
