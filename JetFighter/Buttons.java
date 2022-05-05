import java.util.HashMap;
import greenfoot.*;
/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons 
{
    private final HashMap<String, GreenfootImage> optionsImageMap;
    private final HashMap<String, IMenuCommand> optionsCommandMap;

    private static final GreenfootSound clickSound = new GreenfootSound("menu_option.wav");
    
        public Buttons() {
        optionsImageMap = new HashMap<>();
        optionsCommandMap = new HashMap<>();

        optionsImageMap.put("Play", getPlay());
        optionsImageMap.put("Settings", getSettings());
        optionsImageMap.put("Back", getBack());
        optionsImageMap.put("Quit", getQuit());
        
        IMenuCommand playCommand = new MenuCommand();
        playCommand.setReceiver(new IMenuReceiver() {
            public void doAction() {
                clickSound.play();
                Greenfoot.setWorld(new GameScreen());
                
            }
        });
        optionsCommandMap.put("Play", playCommand);

        IMenuCommand settingsCommand = new MenuCommand();
        settingsCommand.setReceiver(new IMenuReceiver() {
            public void doAction() {
                clickSound.play();
                Greenfoot.setWorld(new GameSettingsScreen());
            }
        });
        optionsCommandMap.put("Settings", settingsCommand);
        
        IMenuCommand backCommand = new MenuCommand();
        backCommand.setReceiver(new IMenuReceiver() {
            public void doAction() {
                clickSound.play();
                Greenfoot.setWorld(new MenuScreen());
            }
        });
        optionsCommandMap.put("Back", backCommand);

        IMenuCommand quitCommand = new MenuCommand();
        quitCommand.setReceiver(new IMenuReceiver() {
            public void doAction() {
                clickSound.play();
                Greenfoot.stop();
                System.exit(1);  // quits game       
            }
        });
        optionsCommandMap.put("Quit", quitCommand);
    }
    
    public GreenfootImage getPlay(){
        GreenfootImage playButton =  new GreenfootImage(100,60);
        Font adjustedFont = new Font(true, false, 30);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("Play", 0, 50);
        return playButton;
    }
    
    public GreenfootImage getSettings(){
        GreenfootImage settingsButton =  new GreenfootImage(165,115);
        Font adjustedFont = new Font(true, false, 30);
        settingsButton.setFont(adjustedFont);
        settingsButton.setColor(Color.WHITE);
        settingsButton.drawString("Settings", 0, 50);
        return settingsButton;
    }
    
     public GreenfootImage getBack(){
        GreenfootImage backButton =  new GreenfootImage(120,70);
        Font adjustedFont = new Font(true, false, 30);
        backButton.setFont(adjustedFont);
        backButton.setColor(Color.WHITE);
        backButton.drawString("Back", 0, 50);
        return backButton;
    }
    
     public GreenfootImage getQuit(){
        GreenfootImage quitButton =  new GreenfootImage(100,60);
        Font adjustedFont = new Font("Marlboro",true, false, 30);
        quitButton.setFont(adjustedFont);
        quitButton.setColor(Color.WHITE);
        quitButton.drawString("Quit", 0, 50);
        return quitButton;
    }
    
        public MenuOption getButton(String buttonType) {
        GreenfootImage image = optionsImageMap.get(buttonType);
        IMenuCommand cmd = optionsCommandMap.get(buttonType);

        MenuOption option = new MenuOption(image);
        option.setCommand(cmd);

        return option;
    }
}
