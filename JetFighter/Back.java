import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Goes back to the MenuScreen
 */
public class Back extends GameSettingsOptions
{
       public Back(){
        GreenfootImage backButton =  new GreenfootImage(120,70);
        Font adjustedFont = new Font(true, false, 30);
        backButton.setFont(adjustedFont);
        backButton.setColor(Color.WHITE);
        backButton.drawString("Back", 0, 50);
        setImage(backButton);
    }
    public void act()
    {
        checkMouse();
        goBack(new MenuScreen());
    }
}
