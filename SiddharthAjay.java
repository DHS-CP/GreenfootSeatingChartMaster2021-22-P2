import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SiddharthAjay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SiddharthAjay extends Student implements SpecialInterestOrHobby
{
    /**
     * Act - do whatever the SiddharthAjay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage portrait;
    public SiddharthAjay(){
        firstName = "Siddharth";
        lastName = "Ajay";
        mySeatX=5;
        mySeatY=3;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portrait = new GreenfootImage(portraitFile);
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            System.out.println("");
            getName();
            sayName(soundFile);
            myHobby("I like to build robots and code games.");
            
            animation();
            
            sitDown();
            
            StudentDesk desk = (StudentDesk) getOneIntersectingObject(StudentDesk.class);
            
        }
        
    }
    
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    public void myHobby(String hobby){
        System.out.println(hobby);
    }
    
    public void animation(){
        Classroom clas = (Classroom) getWorld();
        for (int i = 0; i < 150; i++){
            this.setLocation(this.getX()+Greenfoot.getRandomNumber(3)*(-1+Greenfoot.getRandomNumber(3)),this.getY()+Greenfoot.getRandomNumber(3)*(-1+Greenfoot.getRandomNumber(3)));
            portrait.scale(60+Greenfoot.getRandomNumber(100),60+Greenfoot.getRandomNumber(100));
            setImage(portrait);
            clas.getRed().fadeIn(1);
            Greenfoot.delay(1);
            
        }
        clas.getRed().resetOpacity();
    }
}
