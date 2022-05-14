import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MenuOption class renders a button with the image passed in the constructor.
 * 
 * @author (Puneet Tokhi) 
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
     * @param c IMenuCommand object
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
    
    /** 
     * To create hover animation
     */
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
    
    /** 
     * Method to adjust menu button transparency
     * @param int adjustmentFactor
     */
    public void adjustButtonTransparency(int adjustmentFactor){
        GreenfootImage tempImg = getImage();
        tempImg.setTransparency(adjustmentFactor);
        setImage(tempImg);
    }
}
