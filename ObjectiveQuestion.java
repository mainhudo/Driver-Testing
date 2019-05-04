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
public class ObjectiveQuestion extends question {
    
    public String correctAnswer;
    public ObjectiveQuestion(String q, String d, int p, String a, String c){
        super(q,d,p,a);
        correctAnswer=c;
    }
   
public String Print(){
        String r=null;
        r=question+
        "\r\n"+difficulty+
        "\r\npoint "+point+
        "\r\n"+answerSpace;
        return r;
}
public String Answer(){
        return correctAnswer;
    }
public int Point(){
    return point;
}
}
