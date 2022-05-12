import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlusButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JetIncrementSpeedButton extends GameSettingsOptions
{
    boolean validateFlag = true;
    private final int SECONDS_TO_DISPLAY_MESSAGE = 55 * 3;
    private int noActs = SECONDS_TO_DISPLAY_MESSAGE;
    
    public JetIncrementSpeedButton(){
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
        if(Greenfoot.mouseClicked(this) && speedCheck()){
            GameConfig.jetSpeed++;
        }
        
        setValidateFlag();
    }
    
    
    private boolean speedCheck(){
        if(GameConfig.jetSpeed == GameConfig.bulletSpeed - 1){
            validateFlag = false;
            return false;
        }
        
        if(GameConfig.jetSpeed > 0 && GameConfig.jetSpeed < 10){
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
