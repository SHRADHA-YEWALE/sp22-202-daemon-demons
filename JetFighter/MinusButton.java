import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinusButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinusButton extends GameSettingsOptions
{
    public MinusButton(){
    GreenfootImage plusLabel =  new GreenfootImage(200,200);
    Font adjustedFont = new Font(true, false, 30);
    plusLabel.setFont(adjustedFont);
    plusLabel.setColor(Color.WHITE);
    plusLabel.drawString("-", 0, 50);
    setImage(plusLabel);
    }
}
