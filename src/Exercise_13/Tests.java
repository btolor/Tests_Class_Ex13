package Exercise_13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tests {

    private String fName, lName, lGrade;
    private double [] tScores = new double[5];
    private double avg, cAvg;

    public Tests(String fName, String lName, double[] tScores){
        this.fName = fName;
        this.lName = lName;
        this.tScores = tScores;
        //System.out.println(fName + "*******" + lName + "******" + Arrays.toString(tScores));
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlGrade() {
        return lGrade;
    }

    public void setlGrade(String lGrade) {
        this.lGrade = lGrade;
    }

    public double[] gettScores() {
        return tScores;
    }

    public void settScores(double[] tScores) {
        this.tScores = tScores;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getcAvg() {
        return cAvg;
    }

    public void setcAvg(double cAvg) {
        this.cAvg = cAvg;
    }


}
