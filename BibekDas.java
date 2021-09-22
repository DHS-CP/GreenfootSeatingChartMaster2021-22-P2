import greenfoot.*;

  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BibekDas here.
 * 
 * @author (Bibek) 
 * @version (Vfinal)
 */
public class BibekDas extends Student implements SpecialInterestOrHobby
{
    /**
     * Act - do whatever the BibekDas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public BibekDas(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpeg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpeg";
        //GreenfootImage image = new GreenfootImage(portraitFile);
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    public BibekDas() {
        firstName="Bibek";
        lastName="Das";
        mySeatX=3;
        mySeatY=4;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpeg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpeg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
       // GreenfootImage image = new GreenfootImage(portraitFile);
        setImage(portraitFile);
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
                sayName(soundFile);
            
                myHobby("I like to run");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                myAnimation(); // Bibek's special method           
                sitDown();
    }  
}
public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    
    
   /* public void circleClass(){
        setLocation(0,0);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
        // move back
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            Greenfoot.delay(10);
        }      
         // move left
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            Greenfoot.delay(10);
        }      
              // move Forward
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            Greenfoot.delay(10);
        }   
           Greenfoot.delay(20);
           returnToSeat();
    }
   
    */
    
    
     public void myAnimation() {
        setLocation(0,0);
        Greenfoot.delay(10);
        
     for (int i=5; i<=9;i++) {
            //getWorld().setBackground("universe.gif");
            
            for(int a=4;a<=5;a++) {
                setLocation(i,a);
                Greenfoot.delay(10);
            }
            for (int b=3;b<=6;b+=3) {
                setLocation(5,b);
                Greenfoot.delay(10);
                /*for(int c=5;c<=7;c++) {
                    setLocation(c,b);
                    Greenfoot.delay(10);
                } */
            }
            int distance = 5;
            for (int n=0; n<10;n++) {
                move(distance);
                distance *= 2;
                Greenfoot.delay(3);
                turn(45);
                
                
            }
            turn(270);
        }
        
    
}

    
    public void myHobby(String s) {
         System.out.println(s);
    
    
}


}



