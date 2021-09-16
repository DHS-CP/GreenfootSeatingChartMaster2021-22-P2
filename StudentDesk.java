import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    } 
    public void setDeskGroup(int i){
        if (i>0 && i<9)
           deskGroup=i;
        }
    public int getDeskGroup(){
        
           return deskGroup;
        }
    
    /**
     * Prints out members of a table group to the terminal
     * 
     * The tableNum parameter is used to select the table group whose members 
     * you want printed out. Should be a number from 1 to 8
     * 
     * Method of StudentDesk
     * 
     * 
     * @author Siddharth Ajay, Brighton Alcantara, Pranav Guda, Yougi Jain
     * @param tableNum the table number you want the members of (1-8)
     * @return none
     */    
        
    public void printMembers(int tableNum){
        if (tableNum < 9 && tableNum > 0){
        Classroom world = (Classroom) getWorld();
        ArrayList<StudentDesk> group = new ArrayList<StudentDesk>();
        for (StudentDesk desk : world.getObjects(StudentDesk.class)){
            if (desk.getDeskGroup() == tableNum){
                group.add(desk);
            }
        }
        System.out.println("Members:");
        for (StudentDesk desk : group){
            Student student = (Student) desk.getOneIntersectingObject(Student.class);
            if (student != null){
                student.getName();
            }
        }
        }
    }
}
