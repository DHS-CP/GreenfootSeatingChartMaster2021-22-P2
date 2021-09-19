import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * @author Anish Kasam
 */
public class AnishKasam extends Student implements SpecialInterestOrHobby
{
    public AnishKasam(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        
        mySeatX=r;
        mySeatY=s;
        
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  
        setImage(portraitFile);
        sitting=true;
    }
    
    public AnishKasam() {
        firstName="Anish";
        lastName="Kasam";
        
        mySeatX=2;
        mySeatY=3;
        
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            sitting=false;
            setImage(standingFile);
            System.out.println(""); 
            getName();
            sayName(soundFile);
            
            myHobby("I like to play basketball with my friends!");
            
            circleClass();
           
            sitDown();
        }
    } 
    
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }

    public void circleClass(){
        setLocation(3,6);
        Greenfoot.delay(10);
                
        // move up and right
        for (int i=1;i<=5;i++){
            setLocation(3+i,6+i);
            changeBackground();
            Greenfoot.delay(10);
        }
        // move down and right
        for (int i=1;i<=5;i++){
            setLocation(8+i,11-i);
            changeBackground();
            Greenfoot.delay(10);
        }      
        // move down and left
        for (int i=1;i<=5;i++){
            setLocation(13-i,6-i);
            changeBackground();
            Greenfoot.delay(10);
        }      
        // move up and left
        for (int i=1;i<=5;i++){
            setLocation(8-i,1+i);
            changeBackground();
            Greenfoot.delay(10);
        }  
        
        getWorld().setBackground("csa.jpg");
        
        Greenfoot.delay(10);
        returnToSeat();
    }
     
    public void myHobby(String s) {
        System.out.println(s);
    }
    
    public void changeBackground() {
        List<String> colors = Arrays.asList("red", "blue", "yellow", "green");
        Random rand = new Random();
        String randomColor = colors.get(rand.nextInt(colors.size()));
        
        GreenfootImage backgroundImage = new GreenfootImage(randomColor + ".png");
        
        getWorld().setBackground(backgroundImage);
    }
}