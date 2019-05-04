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
public class question {
    public String question;
    public String difficulty;
    public int point;
    public String answerSpace;
    public question(String q, String d, int p, String a){
        question=q;
        difficulty=d;
        point=p;
        answerSpace=a;
    }
    
    public int getPoint(){
        return point;
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
        return "";
    }
    public int Point(){
    return point;
}
    /*public String answerSpace(int a){
        String r=null;
        for(int i=0;i<a;i++){
            r+="\n";
        }
        return r;
    }*/  
    


}