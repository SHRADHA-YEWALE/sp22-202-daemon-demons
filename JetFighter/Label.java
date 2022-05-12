import greenfoot.*;  

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

  
public class Label extends Actor  
{  
    public Label()  
    {  
        updateImage("");  
    }  
      
    public Label(String text)  
    {  
        updateImage(text);  
    }  
      
    public void setText(String text)  
    {  
        updateImage(text);  
    }  
      
    private void updateImage(String text)  
    {  
        setImage(new GreenfootImage(text, 20, Color.RED, new Color(0,0,0,0) ));  
    }  
}
