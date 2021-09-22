import greenfoot.*; 
import java.lang.String; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
         /*{
            int dayScale = Integer.parseInt(Greenfoot.ask("How was your day from a scale of 1-10"));
            if (dayScale > 7)
            {
                System.out.println("Hope your happiness lasts!");
                
            }
            else if (dayScale > 4)
            {
                System.out.println("Hope your day gets better than boring!");
                
            }
            else
            {
                System.out.println("At least the day can't get any worse... right?");
            
            }
        }
        
        {
            System.out.println("Please enter a valid number!");
        
            
        } */
    } 
    public void setDeskGroup(int i){
        if (i>0 && i<9)
           deskGroup=i;
           
        }
     public int getDeskGroup(){
        
           return deskGroup;
        }
      /*  public void studentFeeling() {
    {
            
        
        } */
    }

