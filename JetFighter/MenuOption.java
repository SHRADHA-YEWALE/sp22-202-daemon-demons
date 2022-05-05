import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuOption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuOption extends Actor implements IMenuInvoker 
{
    private IMenuCommand cmd ;
    
    private boolean mouseOver = false;
    private static int MAX_TRANSPARENCY = 255; 
    
    public MenuOption(GreenfootImage image) {
        GreenfootImage img = image;
        setImage(img);
    }

    /**
     * Set Command for Menu Option
     * @param c [description]
     */ 
    public void setCommand( IMenuCommand c ) {
        cmd = c ;
    }
    /** Invoke Menu Option */
    public void invoke() 
    {
        cmd.execute() ;
    }
     public void act() 
    {
        checkMouse();  // to animate the button
        
        if(Greenfoot.mouseClicked(this)){
            invoke();
        }
    }    
    
    public void click(){
    }
  
    // create a hover animation
    public void checkMouse(){
        if(Greenfoot.mouseMoved(null)){  // if mouse moved over none of the objects
            mouseOver = Greenfoot.mouseMoved(this);    // value is true if mouse is over this object
        }
        
        if(mouseOver){
            adjustButtonTransparency(MAX_TRANSPARENCY/2);  // Animates the button
        }
        else{
            adjustButtonTransparency(MAX_TRANSPARENCY);
        }
    }
    
    public void adjustButtonTransparency(int adjustmentFactor){
        GreenfootImage tempImg = getImage();
        tempImg.setTransparency(adjustmentFactor);
        setImage(tempImg);
    }
}
