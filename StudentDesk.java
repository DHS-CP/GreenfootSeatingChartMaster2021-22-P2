import java.lang.String; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Write a description of class StudentDesk here.
 * 
 * @author Eileen Xu, Arin Shah, Megha Suresh, and Advait Shewade
 * @version September 13, 2021
 */
public class StudentDesk extends Actor
{
    /**
     * Act - do whatever the StudentDesk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deskGroup;
    public void act() 
    {
        if (Greenfoot.isKeyDown("5")) {
            groupMethod(5); 
        }
        // desks should not act.
    } 
    
    public void setDeskGroup(int i){
        if (i>0 && i<9)
           deskGroup=i;
    }
    
    public int getDeskGroup(){
       return deskGroup;
    }
    
    public Student getStudent(){
        Student student = (Student) getOneIntersectingObject(Student.class);
        return student;
    }
    
    public void groupMethod(int tablenum) {
        List <Student> students = getWorld().getObjects(Student.class);
        
        ArrayList<String> stringList = new ArrayList<String>();

        for (int i = 0; i < students.size(); i++) {
            //String studentName = students.get(i).toString();
            //System.out.println(studentName.split("@", 2)[0]);
            
            String firstName = students.get(i).getFirstName().toLowerCase();
            String lastName = students.get(i).getLastName().toLowerCase();
            
            stringList.add(firstName + lastName);
        }
        
    public int getDeskGroup() {
        Random rand = new Random();
        String randomName = stringList.get(rand.nextInt(stringList.size()));
        
        for (int j=1;j<=20;j++){
            for (int i=1;i<=10;i++){
                GreenfootImage iconImage = new GreenfootImage("kilgoretrout.jpg");
                try {
                    iconImage = new GreenfootImage(randomName + ".jpg");
                }
                catch(Exception e) {
                    iconImage = new GreenfootImage(randomName + ".png"); 
                }
                
                int randomX = rand.nextInt(810);
                int randomY = rand.nextInt(810);
                getWorld().getBackground().drawImage(iconImage, randomX, randomY);
            }
            
            Greenfoot.delay(10);
            getWorld().setBackground("csa.jpg");
        }
    public void getCurrentStudents(){
        int deskGroup = getDeskGroup();
        String[] names = {"Shah Arin", "Advait Shewade", "Eileen Xu", "Megha Suresh", "Shashank Thapa", "Sirisha Velavan", "Pavan Sidhu", "Kevin Zhu", "Jaspal Khanuja", "Elizabeth Koh", "Anya Sengupta", "Anishkumar Senthil", "Anish Kataria", "Archith Kavalipati", "Srutilaya Mani", "Amish Saini", "Namit Joshi", "Anish Kasam", "Archit Kumar", "Natalie Lui", "Vedant Agrawal", "Joshua Aguilar", "Yash Chhatre", "Bibek Das", "Siddarth Ajay", "Brighton Alcantara", "Pranav Guda", "Yougi Jain", "Anirudh Annabathula", "Vidit Batta", "Ananya  Jakilati", "Rhea John"};
        
        if (deskGroup == 1){
            for (int i = 0; i < names.length && i < 4; i++){
                System.out.println(names[i]);
            }   
        }else if (deskGroup == 2){
            for (int i = 4; i < names.length && i < 8; i++){
                System.out.println(names[i]);
            }    
        }else if (deskGroup == 3){
            for (int i = 8; i < names.length && i < 12; i++){
                System.out.println(names[i]);
            }    
        }else if (deskGroup == 4){
            for (int i = 12; i < names.length && i < 16; i++){
                System.out.println(names[i]);
            }    
        }else if (deskGroup == 5){
            for (int i = 16; i < names.length && i < 20; i++){
                System.out.println(names[i]);
            }    
        }else if (deskGroup == 6){
            for (int i = 20; i < names.length && i < 24; i++){
                System.out.println(names[i]);
            }    
        }else if (deskGroup == 7){
            for (int i = 24; i < names.length && i < 28; i++){
                System.out.println(names[i]);
            }    
        }else {
            for (int i = 28; i < names.length && i < 32; i++){
                System.out.println(names[i]);
            }
        } 
    }
}
