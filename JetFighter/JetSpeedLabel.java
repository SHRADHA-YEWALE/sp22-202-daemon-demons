import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JetSpeedLabel extends GameSettingsOptions
{
    int last = -1;
    
    public JetSpeedLabel(){
        updateConfig();
    }
    
    public void act()
    {
        if(last != GameConfig.jetSpeed)
            updateConfig();
    }
    
    public void updateConfig(){
        GreenfootImage speedLabel =  new GreenfootImage(200,200);
        Font adjustedFont = new Font(true, false, 30);
        speedLabel.setFont(adjustedFont);
        speedLabel.setColor(Color.WHITE);
        speedLabel.drawString(String.valueOf(GameConfig.jetSpeed) , 0, 50);
        setImage(speedLabel);
        last = GameConfig.jetSpeed;
    }
}
