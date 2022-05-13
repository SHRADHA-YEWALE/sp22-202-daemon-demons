import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * JetOneScoreDisplay will display score for jet1.
 * 
 * @author (Shradha Yewale) 
 * @version (a version number or a date)
 */
public class JetOneScoreDisplay extends Actor
{
    private static JetOneScoreDisplay jetOneScoreDisplayInstance;
    GreenfootImage backgroundImage;
    GreenfootImage jetOneScoreText;
    private static final Color transparent = new Color(0, 0, 0, 0);


    /**
     * Act - do whatever the JetOneScoreDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * This will return JetOneScoreDisplay instance. 
     * It null then will create new one.
     */
    public static JetOneScoreDisplay getInstance() {
        if (jetOneScoreDisplayInstance == null) {
            jetOneScoreDisplayInstance = new JetOneScoreDisplay(JetOneScore.getScoreInstance().getScore());
        }
        return jetOneScoreDisplayInstance;
    }
    
    public JetOneScoreDisplay() {}
    
    /**
     * JetOneScoreDisplay constructor.
     */
    public JetOneScoreDisplay(int score) {
        backgroundImage = getImage();
        displayScore(score);
    }
    
    /**
     * display score for jet1
     */
    public void displayScore(int score) {
        jetOneScoreText = new GreenfootImage(" " + score, 65, Color.BLACK, transparent);
        setImage(jetOneScoreText);
    }
    
    /**
     * update score for jet1
     */
    public void updateScoreDisplay() {
        displayScore(JetOneScore.getScoreInstance().getScore());
    }
        
}
