import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletDecrementSpeedButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletDecrementSpeedButton extends GameSettingsOptions
{
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
        if(Greenfoot.mouseClicked(this) && GameConfig.bulletSpeed > 1){
            GameConfig.bulletSpeed--;
        }
    }
}
