import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuOptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuOptions extends Actor
{
    private boolean mouseOver = false;
    private static int MAX_TRANSPARENCY = 255;   
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
