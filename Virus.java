import greenfoot.*;
/**
 * Vrius bug that wants to get into the heart tower
 * 
 * @author Sophie Qin
 * @version 1.0
 */

public class Virus extends Actor
{
    private int speed = 1;
    private Counter score;
   
    public void act() 
    {
        setLocation(getX()+speed, getY());
        if(getX()>780) {

            Wall right = (Wall)getWorld();
            right.changeEnter(1);
            Greenfoot.playSound("au.wav");
            getWorld().removeObject(this);
        }

    }    

    public void explode()
    {
       
        for(int x=0; x<15; x++) {
            getWorld().addObject(new Debris(), getX(), getY() );
        }
        Greenfoot.playSound("success.wav");
        getWorld().removeObject(this);

    }
    

}
