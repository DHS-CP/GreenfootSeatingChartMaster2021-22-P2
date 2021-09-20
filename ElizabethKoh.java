import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class ElizabethKoh extends Student implements SpecialInterestOrHobby
{
    /**
     * Constructor for the KilgoreTrout class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */    
    public ElizabethKoh(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public ElizabethKoh() {
        firstName="Elizabeth";
        lastName="Koh";
        mySeatX= 6;
        mySeatY= 3;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            //  if (sitting){
            sitting=false;
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            corner();
            sayName(soundFile);
            
            myHobby("I like to play piano and make things with my hands!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
            //upDown();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
            
            collage();
            
            sitDown();
            }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){    
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    /**
     * This method sets the image of the class instance to a series of pictures, giving the
     * impression of a collage being built. There are time delays in between and afterwards
     */
    public void collage(){
        Greenfoot.delay(20);
        setLocation(6, 6);
        
        int i = 1;
        for(i = 1; i <=23; i++){
            setImage("/elizabethkoh/" + i + ".png");
            Greenfoot.delay(10);
        }
        Greenfoot.delay(40);
    }
    void corner(){
        setLocation(1,1);
                Greenfoot.delay(20);
                  setLocation(2,1);
                Greenfoot.delay(20);
                  setLocation(2,2);
                Greenfoot.delay(20);
                  setLocation(1,2);
                Greenfoot.delay(20);
                //corner 1
         setLocation(11,1);
                Greenfoot.delay(20);
                 setLocation(12,1);
                Greenfoot.delay(20);
                 setLocation(12,2);
                 Greenfoot.delay(20);
                 setLocation(11,2);
                 //corner 2
        Greenfoot.delay(20);
                setLocation(0,10);
                
                 Greenfoot.delay(20);
                 setLocation(1,10);
                
                 Greenfoot.delay(20);
                 setLocation(1,11);
                
                 Greenfoot.delay(20);
                 setLocation(0,11);
                 //corner3
                
                 Greenfoot.delay(20);
                 setLocation(10,10);
                  Greenfoot.delay(20);
                  setLocation(11,10);
                  Greenfoot.delay(20);
                  setLocation(11,11);
                  Greenfoot.delay(20);
                  setLocation(10,11);
                  Greenfoot.delay(20);
                  //corner4


    }
   
    /**
     * Moves actor up and down, no longer used
     */
    public void upDown(){
         Greenfoot.delay(10);
        // move back
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            Greenfoot.delay(10);
        }      
        // move forward
        for (int i=5;i>=0;i--){
            setLocation(9,i);
            Greenfoot.delay(10);
        }   
        //move back again
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            Greenfoot.delay(10);
        }      
        // move forwards again
        for (int i=5;i>=0;i--){
            setLocation(9,i);
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
    public void myHobby(String s) {
        System.out.println(s);
    }
}