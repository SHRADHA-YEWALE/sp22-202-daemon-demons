import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlusButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlusButton extends GameSettingsOptions
{
    public PlusButton(){
    GreenfootImage plusLabel =  new GreenfootImage(200,200);
    Font adjustedFont = new Font(true, false, 30);
    plusLabel.setFont(adjustedFont);
    plusLabel.setColor(Color.WHITE);
    plusLabel.drawString("+", 0, 50);
    setImage(plusLabel);
}
  
    public void act()
    {
        //checkMouse();
        //incrementBulletSpeed();
    }

}
