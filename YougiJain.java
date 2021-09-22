import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YougiJain here.
 * 
 * @author Yougi Jain 
 * @version 9/10/2021
 */
public class YougiJain extends Student implements SpecialInterestOrHobby
{
    private static int i = 0;
    private int x;
    public YougiJain() {
        firstName="Yougi";
        lastName="Jain";
        mySeatX=3;
        mySeatY=5;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".JPG";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Act - do whatever the YougiJain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            x = getRandomNumber(1,4);
            if (x==1){move1();}
            if (x==2){move2();}
            if (x==3){move3();}
            if (x==4){move4();}
            wavRunner();
            getName();
            sayName(soundFile);
            myHobby("I like to play video games.");
        }
    }
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void move1(){
        while (i<=9){
            this.setLocation(5, i);
            i++;
            Greenfoot.delay(10);
        }
        i=0;
    }
    public void move2(){
        while (i<=5){
            this.setLocation(i, 9);
            i++;
            Greenfoot.delay(10);
        }
        i=0;
    }
    public void move3(){
        i=18;
        while (i>=9){
            this.setLocation(5, i);
            i--;
            Greenfoot.delay(10);
        }
        i=0;
    }
    public void move4(){
        i=10;
        while (i>=5){
            this.setLocation(i, 9);
            i--;
            Greenfoot.delay(10);
        }
        i=0;
        
    }
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public void wavRunner(){
        //rn wav file here
    }
    public void myHobby(String s) {
        System.out.println(s);
    }
}
