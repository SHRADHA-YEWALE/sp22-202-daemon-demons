import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quit extends MenuOptions
{
      public Quit(){
        GreenfootImage quitButton =  new GreenfootImage(100,60);
        Font adjustedFont = new Font("Marlboro",true, false, 30);
        quitButton.setFont(adjustedFont);
        quitButton.setColor(Color.WHITE);
        quitButton.drawString("Quit", 0, 50);
        setImage(quitButton);
    }
    public void act()
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this)){
            System.exit(1);  // quits game
        }
    }  
}
