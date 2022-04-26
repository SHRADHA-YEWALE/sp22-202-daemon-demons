import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameSettingsOptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameSettingsOptions extends Actor
{
    
    private boolean mouseOver = false;
    private static int MAX_TRANSPARENCY = 255; 
    
        // create a hover animation
    public void checkMouse(){
        if(Greenfoot.mouseMoved(null)){  
            mouseOver = Greenfoot.mouseMoved(this);    
        }
        
        if(mouseOver){
            adjustButtonTransparency(MAX_TRANSPARENCY/2); 
        }
        else{
            adjustButtonTransparency(MAX_TRANSPARENCY);
        }
    }
    
    public void goBack(World world){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(world);
        }
    }
    
    public void adjustButtonTransparency(int adjustmentFactor){
        GreenfootImage tempImg = getImage();
        tempImg.setTransparency(adjustmentFactor);
        setImage(tempImg);
    }
}
