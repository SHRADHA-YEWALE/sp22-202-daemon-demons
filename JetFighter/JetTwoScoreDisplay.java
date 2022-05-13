import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * JetTwoScoreDisplay will display score for jet1.
 * 
 * @author (Shradha Yewale) 
 * @version (a version number or a date)
 */
public class JetTwoScoreDisplay extends Actor
{
    private static JetTwoScoreDisplay jetTwoScoreDisplayInstance;
    GreenfootImage backgroundImage;
    GreenfootImage jetTwoScoreText;
    GreenfootImage jetTwoScore;
    private static final Color transparent = new Color(0, 0, 0, 0);


    /**
     * Act - do whatever the JetTwoScoreDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
    
    /**
     * This will return JetTwoScoreDisplay instance. 
     * It null then will create new one.
     */
    public static JetTwoScoreDisplay getInstance() {
        if (jetTwoScoreDisplayInstance == null) {
            jetTwoScoreDisplayInstance = new JetTwoScoreDisplay(JetTwoScore.getScoreInstance().getScore());
        }
        return jetTwoScoreDisplayInstance;
    }
    
    /**
     * JetTwoScoreDisplay constructor.
     */
    public JetTwoScoreDisplay(int score) {
        backgroundImage = getImage();
        displayScore(score);
    }
    
    public JetTwoScoreDisplay() {}
    
    /**
     * display score for jet2
     */
    public void displayScore(int score) {
        jetTwoScoreText = new GreenfootImage(" " + score, 65, Color.WHITE, transparent);
        setImage(jetTwoScoreText);
    }
    
    /**
     * update score for jet2
     */
    public void updateScoreDisplay() {
        displayScore(JetTwoScore.getScoreInstance().getScore());
    }
}
