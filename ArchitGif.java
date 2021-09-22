import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArchitGif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArchitGif extends ArchitKumar
{
    /**
     * Act - do whatever the ArchitGif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int timer = 0; 
    GifImage gifImage = new GifImage("architgif.gif");
    public void act()
    {
        // Add your action code here.
        setImage(gifImage.getCurrentImage());
        timer++; 
        //System.out.println(timer);
        
        if(timer >= 300) {
            getWorld().removeObject(this); 
            //System.out.println("deleted");
        }
        else{
            timer++;
            //System.out.println(timer); 
        }
        
    }
}
