import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletIncrementSpeedButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletIncrementSpeedButton extends GameSettingsOptions
{
    public BulletIncrementSpeedButton(){
        GreenfootImage plusLabel =  new GreenfootImage(200,200);
        Font adjustedFont = new Font(true, false, 30);
        plusLabel.setFont(adjustedFont);
        plusLabel.setColor(Color.WHITE);
        plusLabel.drawString("+", 0, 50);
        setImage(plusLabel);
    }
  
    public void act()
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this) && validSpeed()){
            GameConfig.bulletSpeed++;
        }
    }
    
    private boolean validSpeed(){
        if(GameConfig.bulletSpeed > 0 && GameConfig.bulletSpeed < 10){
            return true;
        }
        return false;
    }
}
