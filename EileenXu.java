import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class EileenXu here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class EileenXu extends Student
{
    /**
     * Constructor for the EileenXu class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     * lists to initalize for different conditions (depending on what constructors have been written.
     * @param String e (firstname)
     * @param String x (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public EileenXu(String e, String x, int r, int s) {
        firstName=e;
        lastName=x;
        mySeatX=r;
        mySeatY=s;
        portraitFile=e.toLowerCase()+x.toLowerCase()+".png";
        rightFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.png";
        leftFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing-left.png";
        upFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing-up.png";
        downFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing-down.png";
        upsidedownFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing-upsidedown.png";
        pandaFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-panda.png"; 
        soundFile=e.toLowerCase()+x.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public EileenXu() {
        firstName="Eileen";
        lastName="Xu";
        mySeatX=4;
        mySeatY=8;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".png";
        rightFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.png";
        leftFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing-left.png";
        upFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing-up.png";
        downFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing-down.png";
        upsidedownFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing-upsidedown.png";
        pandaFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-panda.png";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    /**
     * Act - do whatever the EileenXu actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
                //  if (sitting){
                sitting=false;
                setImage(rightFile);
                System.out.println("");
                getName();
                sayName(soundFile);
                
                myHobby("I like to play soccer!");
            
                dribbleClass();
                sitDown();
                Greenfoot.delay(50);
                setImage(pandaFile);
                Greenfoot.delay(5);
                setImage(portraitFile);;
        }
            
    } 
    
     /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */
   
     /**
     * This is a local method specific to the EileenXu class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void dribbleClass(){
        setLocation(4,10);
        Greenfoot.delay(10);
        // move up
        setImage(upFile);
        for (int i=10;i>=5;i--){
            setLocation(4,i);
            Greenfoot.delay(7);
        }
        // jukes
        for (int i=0; i<3;i++){
            setImage(leftFile);
            Greenfoot.delay(10);
            setImage(rightFile);
            Greenfoot.delay(10);
        }
        //move right
        for (int i=4;i<=7;i++){
            setLocation(i,5);
            Greenfoot.delay(7);
        }      
        // move down
        setImage(downFile);
        for (int i=5;i<=8;i++){
            setLocation(7,i);
            Greenfoot.delay(7);
        }      
        // spin
        for (int i=0;i<=3;i++){
            setImage(downFile);
            Greenfoot.delay(5);
            setImage(upsidedownFile);
            Greenfoot.delay(5);
            setImage(upFile);
            Greenfoot.delay(5);
            setImage(rightFile);
            Greenfoot.delay(5);
        }
        //move right
        for (int i=7;i<=10;i++){
            setLocation(i,8);
            Greenfoot.delay(7);
        }
        //movedown
        setImage(downFile);
        for (int i=8;i<=11;i++){
            setLocation(10,i);
            Greenfoot.delay(7);
        }
        //moveleft
        setImage(leftFile);
        for (int i=10;i>=5;i--){
            setLocation(i,11);
            Greenfoot.delay(7);
        }
        
        Greenfoot.delay(15);
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
