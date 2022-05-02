import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletSpeedLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletSpeedLabel extends GameSettingsOptions
{
    int last = -1;
    
    public BulletSpeedLabel(){
        updateConfig();
    }
    
    public void act()
    {
        if(last != GameConfig.bulletSpeed)
            updateConfig();
    }
    
    public void updateConfig(){
        GreenfootImage speedLabel =  new GreenfootImage(200,200);
        Font adjustedFont = new Font(true, false, 30);
        speedLabel.setFont(adjustedFont);
        speedLabel.setColor(Color.WHITE);
        speedLabel.drawString(String.valueOf(GameConfig.bulletSpeed) , 0, 50);
        setImage(speedLabel);
        last = GameConfig.bulletSpeed;
    }
}
