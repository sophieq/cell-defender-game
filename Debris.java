import greenfoot.*;
/**
 * The remaining pieces of the virus after the enzyme has killed it
 * 
 * @author Sophie Qin
 * @version 1.0
 */

public class Debris extends Actor
{
    private int speed;
    public Debris()
    {
        GreenfootImage img = getImage();
        int x = Greenfoot.getRandomNumber(50) + 1;
        int y = Greenfoot.getRandomNumber(50) + 1;
        img.scale(x,y);
        setRotation(Greenfoot.getRandomNumber(360));
        speed = Greenfoot.getRandomNumber(15) + 5;
    }
    public void act() 
    {
        move(speed);
        if(getX()<speed || getY()<speed || getX()>780 || getY()>590)
        {
            
            getWorld().removeObject(this);
            
        }
    }    
}
