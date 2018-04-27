import greenfoot.*;

/**
 * a sublevel of Counter that shows player when the score is updated
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Counter
{
   private int trans;
    public Score(String msg)
    {
        super(msg);
        trans=255;
        
    }
    public void act() 
    {
        getImage().setTransparency(trans);
        trans=trans-5;
        setLocation(getX(), getY() - 2);
        if(trans<5) {
            getWorld().removeObject(this);
        }
    }    
}