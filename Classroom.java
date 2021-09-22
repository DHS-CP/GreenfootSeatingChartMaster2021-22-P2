import java.util.*;
import greenfoot.*;
//import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
//import java.util.List;
//import java.util.Arrays;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//e 
/**
 * Write a description of class Classroom here.
 * 
 * @author Mr. Kaehms 
 * @version 2.0  Note: updated for new desk layout. Goal is to make setting seats easy
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    public static List<Student> studentList;
    private Red red = new Red(); 
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(14, 14, 60); 
        
        prepare();
        
        System.out.println("Press the Key F to find a person in the interactive seating chart!");
    }

    public void act()
    {
        String key = Greenfoot.getKey();
        for (int i = 1; i < 9; i++){
            if ((key != null) && key.equals(""+i)){
                    printMembers(i);
            }
        }
        
        if (Greenfoot.isKeyDown("f"))
        {
            labelStudentCreation();
        }
    }
    public void labelStudentCreation()
        { 
            studentList = getObjects(Student.class); 
            Student foundStudent = StudentDeskGroup.findStudent();
            JoshuaAguilar studentLabel = new JoshuaAguilar();
            studentLabel.setImage("studentLabel.png");
            studentLabel.getImage().scale(60,60);
            addObject(studentLabel,foundStudent.getX(),foundStudent.getY());
            Greenfoot.playSound("scribble.wav");
            Greenfoot.delay(100);
            removeObject(studentLabel);
        }
    /**
     * Prepare the classroom desk layout.  This method should not be chanaged!. Refactored from prepare method.
     */

    private void createDeskLayout(){
        StudentDesk studentdesk = new StudentDesk();
        addObject(studentdesk,2,3);
        StudentDesk studentdesk2 = new StudentDesk();
        addObject(studentdesk2,3,3);
        StudentDesk studentdesk3 = new StudentDesk();
        addObject(studentdesk3,2,4);
        StudentDesk studentdesk4 = new StudentDesk();
        addObject(studentdesk4,3,4);
        StudentDesk studentdesk5 = new StudentDesk();
        addObject(studentdesk5,2,6);
        StudentDesk studentdesk6 = new StudentDesk();
        addObject(studentdesk6,3,6);
        StudentDesk studentdesk7 = new StudentDesk();
        addObject(studentdesk7,2,7);
        StudentDesk studentdesk8 = new StudentDesk();
        addObject(studentdesk8,3,7);
        StudentDesk studentdesk9 = new StudentDesk();
        addObject(studentdesk9,5,3);
        StudentDesk studentdesk10 = new StudentDesk();
        addObject(studentdesk10,6,3);
        StudentDesk studentdesk11 = new StudentDesk();
        addObject(studentdesk11,5,4);
        StudentDesk studentdesk12 = new StudentDesk();
        addObject(studentdesk12,6,4);
        StudentDesk studentdesk13 = new StudentDesk();
        addObject(studentdesk13,5,6);
        StudentDesk studentdesk14 = new StudentDesk();
        addObject(studentdesk14,6,6);
        StudentDesk studentdesk15 = new StudentDesk();
        addObject(studentdesk15,5,7);
        StudentDesk studentdesk16 = new StudentDesk();
        addObject(studentdesk16,6,7);
        StudentDesk studentdesk17 = new StudentDesk();
        addObject(studentdesk17,8,3);
        StudentDesk studentdesk18 = new StudentDesk();
        addObject(studentdesk18,9,3);
        StudentDesk studentdesk19 = new StudentDesk();
        addObject(studentdesk19,8,4);
        StudentDesk studentdesk20 = new StudentDesk();
        addObject(studentdesk20,9,4);
        StudentDesk studentdesk21 = new StudentDesk();
        addObject(studentdesk21,8,6);
        StudentDesk studentdesk22 = new StudentDesk();
        addObject(studentdesk22,9,6);
        StudentDesk studentdesk23 = new StudentDesk();
        addObject(studentdesk23,8,7);
        StudentDesk studentdesk24 = new StudentDesk();
        addObject(studentdesk24,9,7);
        StudentDesk studentdesk25 = new StudentDesk();
        addObject(studentdesk25,8,9);
        StudentDesk studentdesk26 = new StudentDesk();
        addObject(studentdesk26,9,9);
        StudentDesk studentdesk27 = new StudentDesk();
        addObject(studentdesk27,8,10);
        StudentDesk studentdesk28 = new StudentDesk();
        addObject(studentdesk28,9,10);
        StudentDesk studentdesk29 = new StudentDesk();
        addObject(studentdesk29,5,9);
        StudentDesk studentdesk30 = new StudentDesk();
        addObject(studentdesk30,6,9);
        StudentDesk studentdesk31 = new StudentDesk();
        addObject(studentdesk31,5,10);
        StudentDesk studentdesk32 = new StudentDesk();
        addObject(studentdesk32,6,10);
        TeacherDesk teacherdesk = new TeacherDesk();
        addObject(teacherdesk,2,10);
        studentdesk31.setDeskGroup(1);
        studentdesk29.setDeskGroup(1);
        studentdesk30.setDeskGroup(1);
        studentdesk32.setDeskGroup(1);
        studentdesk25.setDeskGroup(2);
        studentdesk27.setDeskGroup(2);
        studentdesk26.setDeskGroup(2);
        studentdesk28.setDeskGroup(2);
        studentdesk21.setDeskGroup(3);
        studentdesk23.setDeskGroup(3);
        studentdesk22.setDeskGroup(3);
        studentdesk13.setDeskGroup(4);
        studentdesk15.setDeskGroup(4);
        studentdesk14.setDeskGroup(4);
        studentdesk16.setDeskGroup(4);
        studentdesk6.setDeskGroup(5);
        studentdesk8.setDeskGroup(5);
        studentdesk5.setDeskGroup(5);
        studentdesk7.setDeskGroup(5);
        studentdesk.setDeskGroup(6);
        studentdesk3.setDeskGroup(6);
        studentdesk4.setDeskGroup(6);
        studentdesk2.setDeskGroup(6);
        studentdesk9.setDeskGroup(7);
        studentdesk11.setDeskGroup(7);
        studentdesk10.setDeskGroup(7);
        studentdesk12.setDeskGroup(7);
        studentdesk17.setDeskGroup(8);
        studentdesk19.setDeskGroup(8);
        studentdesk18.setDeskGroup(8);
        studentdesk20.setDeskGroup(8);
    }
   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {
        addObject(red,6,6);

        
        createDeskLayout();
        // Each student needs to create their specific instance following the KilgoreTrout example.
        // Your current seatX and seatY can be found by right clicking on the corresponding seat in the Classrom.
        // and then clicking on the inspect text
        
        PavanSidhu pavansidhu = new PavanSidhu();
        addObject(pavansidhu, 8,10);
        pavansidhu.assignSeat();

        KevinZhu kevinzhu = new KevinZhu();
        addObject(kevinzhu,9,10);
        kevinzhu.assignSeat();
        
        ShashankThapa shashankthapa = new ShashankThapa();
        addObject(shashankthapa,8,9);
        shashankthapa.assignSeat();
        
        SirishaVelavan sirishavelavan = new SirishaVelavan();
        addObject(sirishavelavan,9,9);
        sirishavelavan.assignSeat();

        AdvaitShewade advaitshewade = new AdvaitShewade();
        addObject(advaitshewade,6,9);
        advaitshewade.assignSeat();

        
        ArinShah arinshah = new ArinShah();
        addObject(arinshah,5,9);
        arinshah.assignSeat();

        MeghaSuresh meghasuresh = new MeghaSuresh();
        addObject(meghasuresh,6,10);
        
        EileenXu eileenxu = new EileenXu();
        addObject(eileenxu,5,10);
        eileenxu.assignSeat();

        AmishSaini amishsaini = new AmishSaini();
        addObject(amishsaini,6,7);

        SrutiMani srutimani = new SrutiMani();
        addObject(srutimani, 5,7);
        srutimani.assignSeat();

        AnishKataria anishkataria = new AnishKataria();
        addObject(anishkataria, 5,6);
        anishkataria.assignSeat();

        ArchithKavalipati archithkavalipati = new ArchithKavalipati();
        addObject(archithkavalipati,6,6);
        archithkavalipati.assignSeat();

        BibekDas bibekDas = new BibekDas();
        addObject(bibekDas,3,4);
        bibekDas.assignSeat();

        VedantAgrawal vedantagrawal = new VedantAgrawal();
        addObject(vedantagrawal,2,3);
        vedantagrawal.assignSeat();
        
        YashChhatre yashchhatre = new YashChhatre(); 
        addObject(yashchhatre, 2,4); 
        yashchhatre.assignSeat(); 
        
        JoshuaAguilar joshuaaguilar = new JoshuaAguilar();
        addObject(joshuaaguilar,3,3);
        joshuaaguilar.assignSeat();
        

        BrightonAlcantara brightonalcantara = new BrightonAlcantara();
        addObject(brightonalcantara, 6, 3);
        brightonalcantara.assignSeat();

        YougiJain yougijain = new YougiJain();
        addObject(yougijain,6,4);
        yougijain.assignSeat(); 
        
        SiddharthAjay siddharthajay = new SiddharthAjay();
        addObject(siddharthajay,5,3);
        siddharthajay.assignSeat();
        
        PranavGuda pranavguda = new PranavGuda();
        addObject(pranavguda, 5,4);
        pranavguda.assignSeat();
    
        ElizabethKoh elizabethkoh = new ElizabethKoh();
        addObject(elizabethkoh, 9, 6);
        elizabethkoh.assignSeat();

        JaspalKhanuja jaspakhanuja = new JaspalKhanuja();
        addObject(jaspakhanuja,8,6);
        jaspakhanuja.assignSeat();
        
        AnyaSengupta anyaSengupta = new AnyaSengupta();
        addObject(anyaSengupta,8,7);
        anyaSengupta.assignSeat(); 
        
        AnishkumarSenthil anishkumarSenthil = new AnishkumarSenthil();
        addObject(anishkumarSenthil,9,7);
        anishkumarSenthil.assignSeat(); 
     
        ArchitKumar architKumar = new ArchitKumar();
        addObject(architKumar,11,7);
        architKumar.setLocation(3,7);
        architKumar.setLocation(2,7);
        
        NatalieLui natalielui = new NatalieLui();
        addObject(natalielui,3,7);
        natalielui.assignSeat();
        
        AnishKasam anishkasam = new AnishKasam();
        addObject(anishkasam, 3, 6);
        anishkasam.assignSeat();
        
        NamitJoshi namitjoshi = new NamitJoshi();
        addObject(namitjoshi, 2, 6);
        namitjoshi.assignSeat();

    }
    
    public Red getRed() {
      return red;
    }
    
    public List<Student> getAllStudents(){
       List<Student> s = getObjects(Student.class);  
       return s;
    }
  
    /**
     * gets a list of all students, and creates a new file that can be cut/pasted in as a prepare statement.
     * 
     */
    public void createNewSeatingChart(){
        boolean lastWrite;
        String timestamp=DateFormatter.makeDate();
      
        String newChartFile="seatingchart-" + timestamp + ".txt";   
        
        List<Student> students = getObjects(Student.class); 
        
        for (Student s:students){
            String studentClassName=s.getFirstName()+s.getLastName(); 
            
            String studentInstanceVar=studentClassName.toLowerCase();
            String instantiate=studentClassName + " " + studentInstanceVar + " = new " + studentClassName + "(); \n";
            String placeStudent="addObject(" + studentInstanceVar + ","+ s.getX() + "," + s.getY()+"); \n";
            String assignSeat = studentInstanceVar + ".assignSeat();\n\n";
           
            appendFile(newChartFile,instantiate);  
            appendFile(newChartFile,placeStudent);  
            appendFile(newChartFile,assignSeat);
            
        }
        Greenfoot.ask("Your file has been saved as: " + newChartFile+"     -Press [Enter] to continue.");
    
    } 
 
    
    // modified from https://beginnersbook.com/2014/01/how-to-append-to-a-file-in-java/
    

   public  void appendFile(String fname, String s){
   {    
      try{
         
        //Specify the file name and path here
        File file =new File(fname);

        /* This logic is to create the file if the
         * file is not already present
         */
        if(!file.exists()){
           file.createNewFile();
        }

        //Here true is to append the content to file
        FileWriter fw = new FileWriter(file,true);
        //BufferedWriter writer give better performance
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        //Closing BufferedWriter Stream
        bw.close();

    System.out.println("Data successfully appended at the end of file");

        //Here true is to append the content to file
        FileWriter fw = new FileWriter(file,true);
        //BufferedWriter writer give better performance
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        //Closing BufferedWriter Stream
        bw.close();
        System.out.println("Data successfully appended at the end of file");
        System.out.println("Data successfully appended at the end of file");

      }catch(IOException ioe){
         System.out.println("Exception occurred:");
         ioe.printStackTrace();
       }
    }
}
    
/**
     * Prints out members of a table group to the terminal
     * <p>
     * The tableNum parameter is used to select the table group whose members 
     * you want printed out. Should be a number from 1 to 8
     * <p>
     * Method of Classroom
     * 
     * 
     * @author Siddharth Ajay, Brighton Alcantara, Pranav Guda, Yougi Jain
     * @param tableNum the table number you want the members of (1-8)
     * @return none
     */    
        
    public void printMembers(int tableNum){
        if (tableNum < 9 && tableNum > 0){
            //Classroom world = (Classroom) getWorld();
            ArrayList<StudentDesk> group = new ArrayList<StudentDesk>();
            for (StudentDesk desk : getObjects(StudentDesk.class)){
                if (desk.getDeskGroup() == tableNum){
                    group.add(desk);
                }
            }
            System.out.println("Table group " + tableNum + "'s Members:");
            for (StudentDesk desk : group){
                Student student = desk.getStudent();
                if (student != null){
                    student.getName();
                }
            }
        }
    }
}
