/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class MultipleChoiceQuestion extends question {
    public String[] possibleAnswer;
    public String correctAnswer;
    public MultipleChoiceQuestion(String q, String d, int p, String a, String[] pos, String c){
        super(q,d,p,a);
        possibleAnswer=pos;
        correctAnswer=c;
    }
    public String Print(){
        String a="";
        for(int i=0;i<possibleAnswer.length;i++){
        a+=possibleAnswer[i]+"\r\n";}
        String r=null;
        r=question+
                "\r\n"+a+
        difficulty+
        "\r\npoint "+point+"\r\n";
        return r;
}
public String Answer(){
    return correctAnswer;
}
    public int Point(){
    return point;
}

}
