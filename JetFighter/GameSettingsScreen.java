import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
/**
 * Write a description of class GameSettingsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameSettingsScreen extends World
{
    public static int bullet_speed;
    public static int jet_speed;

    /**
     * Constructor for objects of class GameSettingsScreen.
     * 
     */
    public GameSettingsScreen()
    {    
        super(900, 650, 1); 
        prepare();
    }
    
    public static void setBulletSpeed(int s){
        bullet_speed = s;
    }
    
    public static int getBulletSpeed(){
        return bullet_speed;
    }
    
    public static void setJetSpeed(int s){
        jet_speed = s;
    }
    
    public static int getJetSpeed(){
        return jet_speed;
    }
    
    
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage gameLogo = new GreenfootImage("logo_white.png");
        gameLogo.scale(350,350);
        Logo logo = new Logo(gameLogo);
        addObject(logo, 200, 130);
        logo.setLocation(440,140);
       
        
        BulletSpeed bulletSpeed = new BulletSpeed();
        addObject(bulletSpeed,259,160);
        
        JetSpeed jetSpeed = new JetSpeed();
        addObject(jetSpeed,269,160);

        Back back = new Back();
        addObject(back,279,327);
        
        // get speed
        bullet_speed = Bullet.getSpeed();
        SpeedLabel bulletSpeedLabel = new SpeedLabel(String.valueOf(bullet_speed));
        addObject(bulletSpeedLabel, 300, 300);
        
        jet_speed = Jet.getJetSpeed();
        SpeedLabel jetSpeedLabel =  new SpeedLabel(String.valueOf(jet_speed));
        addObject(jetSpeedLabel, 330, 330);
        
        PlusButton plusButtonBullet = new PlusButton();
        addObject(plusButtonBullet, 200, 220);
        
        PlusButton plusButtonJet = new PlusButton();
        addObject(plusButtonJet, 240, 290);
        
        MinusButton minusButtonBullet = new MinusButton();
        addObject(minusButtonBullet, 160, 190);
        
        MinusButton minusButtonJet = new MinusButton();
        addObject(minusButtonJet, 270, 350);
        
        bulletSpeed.setLocation(200, 420);
        bulletSpeedLabel.setLocation(460, 420);
        
        plusButtonBullet.setLocation(500, 420);
        minusButtonBullet.setLocation(420, 420);
        
        jetSpeed.setLocation(200, 490);
        jetSpeedLabel.setLocation(460, 490);
        
        plusButtonJet.setLocation(500,490);
        minusButtonJet.setLocation(420, 490);
    
        back.setLocation(160,500);
        
        
    }
}
