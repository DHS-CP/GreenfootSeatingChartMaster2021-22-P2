import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AmishSaini here.
 * 
 * @author Amish Saini
 * @version Sep 10, 2021
 */
public class AmishSaini extends Student implements SpecialInterestOrHobby
{
public AmishSaini(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".png";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.png";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }

    public AmishSaini() {
        firstName="Amish";
        lastName="Saini";
        mySeatX=6;
        mySeatY=7;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".png";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.png";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
      
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
                sitting=false;
                
                System.out.println("");
                getName();
                sayName(soundFile);
            
                myHobby("I like to study outer space!");
            
                
                superAmish(); 
            
                setImage(standingFile);
                Greenfoot.delay(225);
                sitDown();
            }
        
    } 

    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    public void superAmish(){
        for (int i=17; i>0; i--){
            if (i % 4 == 2){
                setRotation(90);
                Greenfoot.delay(i);
            }
            else if (i % 4 == 1){
                setRotation(180);
                Greenfoot.delay(i);
            }
            else if (i % 4 == 0){
                setRotation(270);
                Greenfoot.delay(i);
            }
            else if (i % 4 == 3){
                setRotation(0);
                Greenfoot.delay(i);
            }
            if (i == 1){
                for (int j = 1; j < 20; j++){
                    setRotation(90);
                    Greenfoot.delay(1);
                    setRotation(180);
                    Greenfoot.delay(1);
                    setRotation(270);
                    Greenfoot.delay(1);
                    setRotation(0);
                    Greenfoot.delay(1);
                }
            }
            
            setRotation(0);
            
        }
    }
   
     public void myHobby(String s) {
         System.out.println(s);
}

}
