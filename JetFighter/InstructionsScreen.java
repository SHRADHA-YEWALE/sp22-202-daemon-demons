import greenfoot.*;

/**
 * Instructions class to guide users how to play the game
 * 
 * @author (Puneet Tokhi) 
 * @version (a version number or a date)
 */
public class InstructionsScreen extends World
{
    GreenfootImage background = new GreenfootImage("startScreen.jpg");
    private int imageCount = 0;
    
    /**
     * Constructor for objects of class InstructionsScreen.
     * 
     */
    public InstructionsScreen()
    {    
        super(900, 650, 1); 
        prepare();
    }
    
    private void prepare()
    {
        GreenfootImage gameLogo = new GreenfootImage("logo_white.png");
        gameLogo.scale(350,350);
        addObject(new Logo(gameLogo), 440, 140);
        
        GreenfootImage instructions = new GreenfootImage("\nINSTRUCTIONS",
        40, Color.WHITE, new Color(0, 0, 0, 0));
        addObject(new Logo(instructions), 440, 250);
        
        String player1Instructions = "\nPlayer 1: \n Use the arrow keys (Up, Down, Left, Right) to move the Jet \n Use the 'Up' arrow key to fire the bullet \n\n";
        
        String player2Instructions = " Player 2: \n Use the W, A, S, D keys to move the Jet\n Use the 'W' key to fire the bullet";
        
        GreenfootImage instructionsImage = new GreenfootImage(player1Instructions + player2Instructions, 30, Color.CYAN, new Color(0, 0, 0, 0));
        addObject(new Logo(instructionsImage), 440, 400);
        
        
        Buttons buttons = new Buttons();
        MenuOption back = buttons.getButton("Back");
        addObject(back, 460, 570);
    }
    
    public void act(){
        imageCount -= 4;
        animateImage(background);
    }
    
     /**
      * Create a dynamic moving background
      */
    public void animateImage(GreenfootImage image) {
        if (imageCount <  -image.getWidth()) {
            imageCount += image.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(image, temp, 0);
        getBackground().drawImage(image, temp + image.getWidth(), 0);
    }
}
