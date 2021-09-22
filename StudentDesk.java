import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Write a description of class StudentDesk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    }
}
