import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
        // desks should not act.
    } 
    public void setDeskGroup(int i){
        if (i>0 && i<9)
           deskGroup=i;
        }
    public int getDeskGroup(){
        
           return deskGroup;
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
