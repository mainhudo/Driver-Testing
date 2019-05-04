/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author Admin
 */
public class TestBank {
public question[] TestB(){
    question[] ArrayTest= new question[4];
    
    
    ArrayTest[0]=new ObjectiveQuestion("1*5= ","MIN_DIFFICULTY",1,"\n\n\n","2");
    ArrayTest[1]=new question("6*8= ","MID_DIFFICULTY",2,"\n\n\n");
    ArrayTest[2]=new MultipleChoiceQuestion("14*75= ","MAX_DIFFICULTY",3,"\n\n\n",
    new String[]{"a.216","b.3","c.43","d.5 "},"c");
    ArrayTest[3]=new FillInTheBlankQuestion("___",",was the 16th US President. ","MAX_DIFFICULTY",3,"ok this is not funny");
   
    return ArrayTest;
}
}
