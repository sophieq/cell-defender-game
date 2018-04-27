import greenfoot.*;
/**
 * Wall Class represents an atery
 * 
 * @author Sophie Qin
 * @version 1.0
 */

public class Wall extends World
{

    private Counter total;
    private Counter enter;
    private int right = 5;
    public Wall()
    {    
        super(790, 600, 1); 
        addObject(new Cell(), 640, getHeight()/2);
        
        total = new Counter("Score: ");
        addObject( total, 715, 20);
        enter = new Counter("Entered: ");
        addObject( enter, 720, 55);
       
        setActOrder(Debris.class, Wall.class, Enzyme.class, Virus.class );
    }
    
     public void changeScore(int change)
    {
        total.add(change);
        if(total.getValue() == 160) {
            addObject( new Label("YOU WIN! YOU SCORED OVER 150 \n WAY TO BEAT THE VIRIUS! \n Final Score: 151", 40),  getWidth()/2,  getHeight()/2);
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
    
    
}
     public void changeEnter( int up)
    {
        enter.add(up);
        right = right - 1;
        if(right == 0) {
            addObject( new Label("OH NO \nTOO MANY VIRUSES HAVE ENTERED THE BODY", 35), getWidth()/2, getHeight()/2);
            Greenfoot.playSound("gameover.wav");
            Greenfoot.stop();
        }
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 0.5 ) {
            addObject( new Virus(), 3, Greenfoot.getRandomNumber( getHeight()));
        }
    }
}
