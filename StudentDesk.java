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
    public void act() {
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


}