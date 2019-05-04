/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Driver {
public static final int SENTINEL=4;
public static int Compare(String[] a, String[] b){
    int r=0;
    for(int i=0;i<a.length;i++){
        for(int u=0;u<b.length;i++){
        if(a[i]!=b[u]){
            r=i;
        }
        else{
            Compare(a,b);
        }
        }
    }
    return r;
}
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        //testbank class for extra credit
        /*TestBank quest=new TestBank();
        question[] qtest1=quest.TestB();
        
        Random rnd=new Random();
        int questNumber=0; 
        
        question[] qtest=new question[SENTINEL];
        for(int i=0;i<qtest.length;i++){
            
        questNumber=rnd.nextInt(qtest1.length);
        for(int u=0; u<qtest.length;u++){
        if(qtest1[questNumber]!=qtest[u]){
        qtest[i]=qtest1[questNumber];
        }
        
        }
        }*/
        //this is normal code if there is no testBank class
        question[] qtest= {new ObjectiveQuestion("1+1= ","MIN_DIFFICULTY",1,"\r\n\r\n\r\n","2"),
                          new question("2+3= ","MID_DIFFICULTY",2,"\r\n\r\n\r\n"),
                          new MultipleChoiceQuestion("1+1*2= ","MAX_DIFFICULTY",3,"\r\n\r\n\r\n",
                                new String[]{"a.2","b.3","c.4","d.5 "},"c"),
                          new FillInTheBlankQuestion("___",", everyone loves her ","MAX_DIFFICULTY",2,"yo mama is so beautiful that"),
                          new FillInTheBlankQuestion("___",", everyone loves him ","MAX_DIFFICULTY",3,"yo papa is so sick that")};

        Test theTest=new Test(qtest);
        //String s=theTest.toString();
        System.out.println("Test: ");
        System.out.println(theTest.toString());
        System.out.println("Total Point: ");
        System.out.println(theTest.getTotalPoints());
        System.out.println("Answerkey: ");
        System.out.println(theTest.toAnswerString());
            
        
        try {
            PrintWriter printWriter = new PrintWriter("output.txt");
            printWriter.println("Test ");
            printWriter.println(theTest.toString());
            printWriter.println("Total Point: ");
            printWriter.println(theTest.getTotalPoints());
            printWriter.println("Answerkey: ");
            printWriter.println(theTest.toAnswerString());
            printWriter.println();
            printWriter.close ();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            System.exit(0);
        }
        
    }
    
}
