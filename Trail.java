import greenfoot.*;
/**
 * smoke trail of the enzyme
 * 
 * @author Sophie Qin
 * @version 1.0
 */

public class Trail extends Actor
{
    private int smoke = 255;
    public void act() 
    {
        getImage().setTransparency(smoke);
        smoke = smoke - 100;
        if(smoke<20) {
            getWorld().removeObject(this);
        }
        
    }    
}
