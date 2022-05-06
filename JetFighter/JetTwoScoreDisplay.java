import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetTwoScoreDisplay here.
 * 
 * @author (your name) 
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
    
    public static JetTwoScoreDisplay getInstance() {
        if (jetTwoScoreDisplayInstance == null) {
            jetTwoScoreDisplayInstance = new JetTwoScoreDisplay(JetTwoScore.getScoreInstance().getScore());
        }
        return jetTwoScoreDisplayInstance;
    }
    
    public JetTwoScoreDisplay(int score) {
        backgroundImage = getImage();
        displayScore(score);
    }
    
    public JetTwoScoreDisplay() {}
    
    public void displayScore(int score) {
        jetTwoScoreText = new GreenfootImage(" " + score, 65, Color.WHITE, transparent);
        setImage(jetTwoScoreText);
    }
    
    public void updateScoreDisplay() {
//        System.out.println("Current updated score for jet 2"+JetTwoScore.getScoreInstance().getScore());
        displayScore(JetTwoScore.getScoreInstance().getScore());
    }
}
