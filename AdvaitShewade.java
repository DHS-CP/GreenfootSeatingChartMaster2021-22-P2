import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AdvaitShewade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdvaitShewade extends Student
{
    /**
     * Act - do whatever the AdvaitShewade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public AdvaitShewade(String a, String b, int r, int s) {
        firstName=a;
        lastName=b;
        mySeatX=r;
        mySeatY=s;
        portraitFile=a.toLowerCase()+b.toLowerCase()+".jpg";   
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        //soundFile=a.toLowerCase()+b.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    public void sayName(){
        Greenfoot.playSound("advaitshewade.wav");
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public AdvaitShewade() {
        firstName="Advait";
        lastName="Shewade";
        mySeatX=6;
        mySeatY=9;
       //imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
       //setImage();
        sitting=true;
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName();
           
                myHobby();
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                snakeClass();  
           
                sitDown();
            }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void snakeClass(){
        setImage(standingFile);
        setLocation(0,0);
         Greenfoot.delay(10);
        // move right
        for (int i=0;i<=13;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
        setLocation(0,3);
         Greenfoot.delay(10);
        for (int i=0;i<=13;i++){
            setLocation(i,3);
            Greenfoot.delay(10);
        }
        setLocation(0,6);
         Greenfoot.delay(10);
        for (int i=0;i<=13;i++){
            setLocation(i,6);
            Greenfoot.delay(10);
        }
        setLocation(0,9);
         Greenfoot.delay(10);
        for (int i=0;i<=13;i++){
            setLocation(i,9);
            Greenfoot.delay(10);
        }
         setLocation(0,12);
         Greenfoot.delay(10);
        for (int i=0;i<=13;i++){
            setLocation(i,10);
            Greenfoot.delay(10);
        }
           Greenfoot.delay(20);
           returnToSeat();
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby() {
         System.out.println("I love to watch Star Wars! My favorite character is Darth Vader.");
}
}
