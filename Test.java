/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class Test{
    
    public question[] q;
    public Test(question[] Question){
        q=Question;
    }
    
    public String toString(){
        String r="";
        for(int i=0; i<q.length;i++){
            r+=i+1+")"+q[i].Print();
        }
        return r;
    }
    
     // would be used to print the test's answer key
    //String[] answer=new String[q.length];
    public String toAnswerString() {
        String r="";
        for(int i=0; i<q.length;i++){
           r+=i+1+"."+q[i].Answer()+"\r\n";
           
    }
       
        return r;
    }
    
    public int getTotalPoints() {
        int sum=0;
        for(int i=0;i<q.length;i++){
            sum+=q[i].Point();
    }
        return sum;
    }
}
