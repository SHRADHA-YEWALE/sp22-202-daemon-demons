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
    private static GreenfootImage jetOneImage = new GreenfootImage("BackgroundScoreImage.jpeg");
    private static final Color transparent = new Color(0, 0, 0, 0);


    /**
     * Act - do whatever the JetOneScoreDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        super.act();
        updateScoreDisplay();
        //displayScore(20,jetOneImage);
    }
    
    public static JetOneScoreDisplay getInstance() {
        if (jetOneScoreDisplayInstance == null) {
            jetOneImage.scale(50, 50);
            jetOneScoreDisplayInstance = new JetOneScoreDisplay(JetOneScore.getScoreInstance().getScore(), jetOneImage);
        }
        return jetOneScoreDisplayInstance;
    }
    
    public JetOneScoreDisplay() {}
    
    public JetOneScoreDisplay(int score, GreenfootImage jetOneImage) {
        backgroundImage = getImage();
        displayScore(score, jetOneImage);
    }
    
    public void displayScore(int score, GreenfootImage jetOneImage) {
        backgroundImage = getImage();
        //jetOneScoreText = new GreenfootImage("Jet1 Score : " + 20, 25, Color.BLACK, transparent);

        jetOneScoreText = new GreenfootImage("Jet1 Score : " + 20, 50, Color.BLACK, transparent);
        backgroundImage.drawImage(jetOneImage, 15, 20);
        backgroundImage.drawImage(jetOneScoreText, 10, 10);
        backgroundImage.scale(400, 60);
        setImage(backgroundImage);
    }
    
    public void updateScoreDisplay() {
        displayScore(JetOneScore.getScoreInstance().getScore(), jetOneImage);
    }
        
}
