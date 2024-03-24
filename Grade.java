
public class Grade {
    private int a = 90;
    private int b = 80;
    private int c = 70;
    private int d = 60;
    private int f = 50;
    private String letterGrade = "a,b,c,d,f";


public String getGradeValue(int grade, String letterGrade){
    
    if(grade >= 90){
        letterGrade = "a";
    }
    else if(grade >= 80 && grade < 90 ) {
        letterGrade = "b";
    }
    else if(grade >= 70 && grade < 80) {
        letterGrade = "c";
    }
    else if(grade >= 60 && grade < 70) {
        letterGrade = "d";
    }
    else if(grade >= 50 && grade < 60) {
        letterGrade = "f";
    }
    return letterGrade;
    }
public 
    
}
