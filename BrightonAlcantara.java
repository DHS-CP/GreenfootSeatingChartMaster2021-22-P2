import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * BrightonAlcantara is the class that will represent the student Brighton Alcantara.
 * Once clicked he will talk about band and teleport randomly
 * 
 * @author Brighton Alcantara 
 * @version 9/10/21
 */
public class BrightonAlcantara extends Student
{
    public BrightonAlcantara() {
        firstName="Brighton";
        lastName="Alcantara";
        mySeatX=6;
        mySeatY=3;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".png";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.png";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Act - do whatever the BrightonAlcantara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Once clicked, BrightonAlcantara object will play sound file and moveAround()
        if(Greenfoot.mouseClicked(this)){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                myHobby("I like to play video games, draw, and play music");
                sayName(soundFile);
                moveAround(); // Teleportation movement happens here
                sitDown();
            }
    }
    public void getName() {
        // Print Brighton's name
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**OBSOLETE ANIMATION ALGORITHM */
     /* public void moveAround() {
        // Temporary animation: teleport to random parts of the room and rotate randomly
        for (int movement = 0; movement < 100; movement++) {
            this.setRotation(Greenfoot.getRandomNumber(360));
            this.setLocation(Greenfoot.getRandomNumber(13), Greenfoot.getRandomNumber(13));
            Greenfoot.delay(2);
        }
        this.setRotation(0);
    }*/
    public void moveAround() {
        // Split up into up to 1-32 smaller objects of BrightonAlcantara that move erratically
        int movementIterations = 0;
        int imageTransparency = 100;
        int numSmallBrighton = Greenfoot.getRandomNumber(31) + 1;
        List<BrightonAlcantara> brightonsList = new ArrayList<BrightonAlcantara>();
        for (int brightons = 0; brightons < numSmallBrighton; brightons++) {
            // This method will add a mini image version of Brighton into an Arraylist that will be used to control all teleportations
            BrightonAlcantara smallBrighton = new BrightonAlcantara();
            brightonsList.add(smallBrighton);
            getWorld().addObject(smallBrighton, 6, 3);
            GreenfootImage smallBrightonImage = new GreenfootImage(firstName.toLowerCase()+ lastName.toLowerCase()+".png");
            smallBrightonImage.scale(smallBrightonImage.getWidth()/5, smallBrightonImage.getHeight()/5);
            smallBrighton.setImage(smallBrightonImage);
        }
        while (imageTransparency >= 0) {
            // Fade animation for main Brighton. It repeats setTransparency() until the transparency decreases to 0
            GreenfootImage fadingBrighton = new GreenfootImage(firstName.toLowerCase()+ lastName.toLowerCase()+".png");
            fadingBrighton.setTransparency(imageTransparency);
            setImage(fadingBrighton);
            imageTransparency -= 3;
            Greenfoot.delay(1);
        }
        while (movementIterations <= 50) {
            // Each Brighton will move 50 times
            for (int brightonIndex = 0 ; brightonIndex < numSmallBrighton ; brightonIndex++) {
                    // Each Brighton will teleport to a random cell in the World at a random rotation
                    BrightonAlcantara miniBrighton = brightonsList.get(brightonIndex);
                    miniBrighton.setRotation(Greenfoot.getRandomNumber(360));
                    miniBrighton.setLocation(Greenfoot.getRandomNumber(14), Greenfoot.getRandomNumber(13));
            }
            Greenfoot.delay(12);
            movementIterations++;   
        }
        for (BrightonAlcantara miniBrighton : brightonsList) {
                // Brightons disappear one by one
                getWorld().removeObject(miniBrighton);
                Greenfoot.delay(3);
        }
    }
    // This implements the SpecialInterestOrHobby Interface
    public void myHobby(String s) { 
         System.out.println(s);
    }
}
