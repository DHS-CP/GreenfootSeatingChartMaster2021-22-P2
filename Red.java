import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red extends Actor
{
    /**
     * Act - do whatever the red wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int opacity = 0;
    GreenfootImage image;
    public Red(){
        image = new GreenfootImage("red.jpg");
        image.scale(900,900);
        image.setTransparency(opacity);
        setImage(image);
    }
    
    public void act()
    {
    }
    
    public void fadeIn(int x){
        opacity += x;
        image.setTransparency(opacity);
        setImage(image);
    }
    
    public void resetOpacity(){
        opacity = 0;
        image.setTransparency(opacity);
        setImage(image);
    }
}
