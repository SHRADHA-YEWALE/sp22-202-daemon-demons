import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PostGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostGame extends World
{

    /**
     * Constructor for objects of class PostGame.
     * 
     */
    public PostGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        this(0, 0);
    }
    
    public PostGame(int xScore, int yScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1); 
        prepare();
    }
    
    private void prepare()
    {
        int score1 = JetOneScore.getScoreInstance().getScore();
        int score2 = JetTwoScore.getScoreInstance().getScore();
        addObject(new GameOverText(), getWidth()/2, 100);
        addObject(new WinnerBanner(score1, score2), getWidth()/2, getHeight()/2);
        addObject(new Continue(), getWidth()/2, 500);
        addObject(new ExitGame(), getWidth()/2, 570);
    }
    
    public void act(){
        
        if("enter".equals(Greenfoot.getKey())){
           Greenfoot.setWorld(new MenuScreen()); 
        } 
        
        if("escape".equals(Greenfoot.getKey())){
            System.exit(0);
        } 
    }
}
