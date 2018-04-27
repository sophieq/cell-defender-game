import greenfoot.*;
/**
 * Protects heart tower by producing enyzmes from it's body to shoot
 * 
 * @author Sophie Qin
 * @version 1.0
 */

public class Cell extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("cell.png");
    private GreenfootImage img2 = new GreenfootImage("cell2.png");
    private boolean attack = false;
    public void act() 
    {
        
        if(Greenfoot.isKeyDown("up")) {
        setLocation(getX(), getY()-7);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+7);
        }
        if(Greenfoot.isKeyDown("space") && !attack) {
            setImage(img2);
            
            getWorld().addObject( new Enzyme(), getX(), getY());
            Greenfoot.playSound("shooting.wav");
            attack= true;
           
        }
        if(!Greenfoot.isKeyDown("space")) {
            attack = false;
            setImage(img1);
           
        }
        
    }    
}
