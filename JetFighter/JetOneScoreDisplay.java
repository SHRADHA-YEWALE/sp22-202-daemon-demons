import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetOneScoreDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JetOneScoreDisplay extends Actor
{
    private static JetOneScoreDisplay jetOneScoreDisplayInstance;
    GreenfootImage backgroundImage;
    GreenfootImage jetOneScoreText;
    private static GreenfootImage jetOneImage = new GreenfootImage("jet_black.png" );

    /**
     * Act - do whatever the JetOneScoreDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public static JetOneScoreDisplay getInstance() {
        if (jetOneScoreDisplayInstance == null) {
            jetOneImage.scale(30, 30);
            jetOneScoreDisplayInstance = new JetOneScoreDisplay(JetOneScore.getScoreInstance().getScore(), jetOneImage);
        }
        return jetOneScoreDisplayInstance;
    }
    
    public JetOneScoreDisplay(int score, GreenfootImage jetOneImage) {
        backgroundImage = getImage();
        displayScore(score, jetOneImage);
    }
    
    public void displayScore(int score, GreenfootImage jetOneImage) {
        backgroundImage = getImage();
        jetOneScoreText = new GreenfootImage("Jet1 Score : " + score, 25, Color.WHITE, Color.BLACK);
        backgroundImage.drawImage(jetOneImage, 15, 20);
        backgroundImage.drawImage(jetOneScoreText, 20, 70);
        backgroundImage.scale(150, 75);
        setImage(backgroundImage);
    }
    
    public void updateScoreDisplay() {
        displayScore(JetOneScore.getScoreInstance().getScore(), jetOneImage);
    }
        
}
