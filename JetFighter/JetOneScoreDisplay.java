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
    private static final Color transparent = new Color(0, 0, 0, 0);


    /**
     * Act - do whatever the JetOneScoreDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        updateScoreDisplay();
        //displayScore(20,jetOneImage);
    }
    
    public static JetOneScoreDisplay getInstance() {
        if (jetOneScoreDisplayInstance == null) {
            jetOneScoreDisplayInstance = new JetOneScoreDisplay(JetOneScore.getScoreInstance().getScore());
        }
        return jetOneScoreDisplayInstance;
    }
    
    public JetOneScoreDisplay() {}
    
    public JetOneScoreDisplay(int score) {
        backgroundImage = getImage();
        displayScore(score);
    }
    
    public void displayScore(int score) {
        backgroundImage = getImage();
        //jetOneScoreText = new GreenfootImage("Jet1 Score : " + 20, 25, Color.BLACK, transparent);

        jetOneScoreText = new GreenfootImage("Jet1 Score : " + 20, 50, Color.BLACK, transparent);
        backgroundImage.drawImage(jetOneScoreText, 10, 10);
        backgroundImage.scale(400, 60);
        setImage(backgroundImage);
    }
    
    public void updateScoreDisplay() {
        backgroundImage.clear();
        setImage("BackgroundScoreImage.jpeg");
        displayScore(JetOneScore.getScoreInstance().getScore());
    }
        
}
