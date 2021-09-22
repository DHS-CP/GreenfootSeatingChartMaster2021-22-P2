import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Megha Suresh
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class MeghaSuresh extends Student implements SpecialInterestOrHobby
{
    /**
     * Constructor for the MeghaSuresh class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String m (firstname)
     * @param String n (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public MeghaSuresh(String m, String n, int r, int s) {
        firstName=m;
        lastName=n;
        mySeatX=r;
        mySeatY=s;
        portraitFile=m.toLowerCase()+n.toLowerCase()+".jpg";    
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=m.toLowerCase()+n.toLowerCase()+".wav";  
        setImage(portraitFile);
        sitting=true;
    }

    public MeghaSuresh() {
        firstName="Megha";
        lastName="Suresh";
        mySeatX=6;
        mySeatY=10;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }

    /**
     * Act - do whatever the MeghaSuresh actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            //  if (sitting){
            sitting=false;
            setImage(standingFile);
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);

            myHobby("I like to sleep!");

            rideBike();  // Megha Suresh's special method

            sitDown();
        }

    } 

    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }

    public void rideBike(){
        setLocation(0,0);
        Greenfoot.delay(10);
        // move right
        for (int i=1;i<=14;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
        // move down
        for (int i=1;i<=14;i++){
            setLocation(13,i);
            Greenfoot.delay(10);
        }         
        Greenfoot.delay(20);
        returnToSeat();
    }

    public void myHobby(String s) {
        System.out.println(s);
    }

}