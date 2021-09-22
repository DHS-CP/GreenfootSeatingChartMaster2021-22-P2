import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * 
 * This is a container for methods that could be called from the Classroom.  Possible methods could include the following:
 * public void assignSeatsToDeskGroups();  // iterates through all seats and sets the deskGroup based on position of each seat
 * public void getCurrentStudents(int deskGroup)  // list all students in a current deskGroup  (prints to console)
 * Can you think of others?
 * 
 * methods should be public, so they can be called when the scenario is in pause mode.
 * 
 * @author (your name (add your groups names here, and tie to any method that you add) 
 * @version (a version number or a date. Update this for each revision)
 */
public class StudentDeskGroup extends Actor
{

    /**
     * 
     * This is a container for methods that could be called from the Classroom.  Possible methods could include the following:
     * public void assignSeatsToDeskGroups();  // iterates through all seats and sets the deskGroup based on position of each seat
     * public void getCurrentStudents(int deskGroup)  // list all students in a current deskGroup  (prints to console)
     * Can you think of others?
     * 
     * methods should be public, so they can be called when the scenario is in pause mode.
     * 
     * @author (your name (add your groups names here, and tie to any method that you add) 
     * @version (a version number or a date. Update this for each revision)
     */
    StudentDesk studentDesk = new StudentDesk();
    private int deskGroup = studentDesk.getDeskGroup();
    //public List<String> Images= new List<String>();
    public void act() 
    {
        
    }   
    
    /**
     * Press the Key F to find a student. The method below finds the student and circles it.
     * 
     * @author Joshua Aguilar, Bibek Das, Vedant Argawal, Yash Chhatre
     * 
     * @param (For each student in the studentList)
     * Prints each students full name and notifies that all student names have been printed
     * 
     * @param (foundStudent has not been found)
     * Will continue to ask a name for a student on the list if foundStudent has not been found. If the foundStudent has been found then it will return the student
     * 
     * @version 1
     */
    public static Student findStudent()
    {   
        Student foundStudent = null;
        boolean firstLoop = true;
        
        System.out.println("");
        System.out.println("All Student Name's Below:");
        for (Student s:Classroom.studentList)
        {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
        
        while (foundStudent == null)
        {
            if (!firstLoop)
            {
                System.out.println("Re-Enter a name please. The name you inputted was inccorect: ");
            }
            String findingStudent = Greenfoot.ask("Please enter the name of the student you want to find (Enter First and Last Name!): ");
            for (Student s:Classroom.studentList)
            {
                if (findingStudent.toLowerCase().equals(s.getFirstName().toLowerCase() + " " + s.getLastName().toLowerCase()))
                {
                    foundStudent = s;
                }
            }
            firstLoop = false;
        }
        
        return foundStudent;
    }
}

