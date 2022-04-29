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
    private static GreenfootImage jetTwoImage = new GreenfootImage("plane-white.png");

    /**
     * Act - do whatever the JetTwoScoreDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public static JetTwoScoreDisplay getInstance() {
        if (jetTwoScoreDisplayInstance == null) {
            jetTwoImage.scale(30, 30);
            jetTwoScoreDisplayInstance = new JetTwoScoreDisplay(JetTwoScore.getScoreInstance().getScore(), jetTwoImage);
        }
        return jetTwoScoreDisplayInstance;
    }
    
    public JetTwoScoreDisplay(int score, GreenfootImage jetTwoImage) {
        backgroundImage = getImage();
        displayScore(score, jetTwoImage);
    }
    
    public void displayScore(int score, GreenfootImage jetTwoImage) {
        backgroundImage = getImage();
        jetTwoScoreText = new GreenfootImage("Jet2 Scaore : " + score, 25, Color.WHITE, Color.BLACK);
        backgroundImage.drawImage(jetTwoImage, 15, 20);
        backgroundImage.drawImage(jetTwoScoreText, 50, 70);
        backgroundImage.scale(150, 75);
        setImage(backgroundImage);
    }
    
    public void updateScoreDisplay() {
        displayScore(JetTwoScore.getScoreInstance().getScore(), jetTwoImage);
    }
}
