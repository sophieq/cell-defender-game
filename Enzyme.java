import greenfoot.*;
/**
 * Enzyme kills the virius from getting to the heart tower
 * 
 * @author Sophie Qin
 * @version 1.0
 */

public class Enzyme extends Actor
{
   private int travel = 7;
   private Score score;
    public void act() 
    {
        setLocation(getX()-travel,getY());
        getWorld().addObject(new Trail(), getX(), getY());
        if(getX()<5) {
            getWorld().removeObject(this);
        } else {
            Virus bug = (Virus)getOneIntersectingObject(Virus.class);
            
            if(bug!=null) {
                bug.explode();
                score = new Score("+1");
                getWorld().addObject( score, getX(), getY());
            Wall theWall = (Wall)getWorld();
            theWall.changeScore(10);
               
                getWorld().removeObject(this);
                
               
            }
        }
    }    
    
  
}
