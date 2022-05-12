import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletDecrementSpeedButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletDecrementSpeedButton extends GameSettingsOptions
{
    boolean validateFlag = true;
    private final int SECONDS_TO_DISPLAY_MESSAGE = 55 * 3;
    private int noActs = SECONDS_TO_DISPLAY_MESSAGE;
    
    public BulletDecrementSpeedButton(){
        GreenfootImage minusLabel =  new GreenfootImage(200,200);
        Font adjustedFont = new Font(true, false, 30);
        minusLabel.setFont(adjustedFont);
        minusLabel.setColor(Color.WHITE);
        minusLabel.drawString("-", 0, 50);
        setImage(minusLabel);
    }

    public void act(){
        checkMouse();
        if(Greenfoot.mouseClicked(this) && speedCheck()){
            GameConfig.bulletSpeed--;
        }
        
        setValidateFlag();
    }
    
    private boolean speedCheck(){
        if(GameConfig.bulletSpeed == GameConfig.jetSpeed + 1){
            validateFlag = false;
            return false;
        }
        
        if(GameConfig.bulletSpeed > 1){
            return true;
        }
        
        return false;
    }
    
    
    public boolean getValidateFlag(){
        return validateFlag;
    }
    
    private void setValidateFlag(){
        if(!validateFlag && noActs > 0)
            noActs--;
        else{
            noActs = SECONDS_TO_DISPLAY_MESSAGE;
            validateFlag = true;
        }
    }
}
