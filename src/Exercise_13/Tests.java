package Exercise_13;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * The Tests class stores the student's first name,
 * last name, five test scores, test avg, letter
 * grade, class avg, and class grade. The Tests
 * class has a constructor that sets the student's
 * first name, last name, and 5 test scores. The
 * class also has methods to calculate test averages
 * and return test averages, calculate and return
 * grades, and modify individual test scores. The
 * Test class will also store each Tests class object
 * in a string array using the array toString method...
 * */
public class Tests {

    //Tests class private variables...
    private String fName, lName, lGrade;
    private double [] tScores = new double[5];
    private double avg, cAvg;

    /**Test class constructor that sets the student's
     *  first name , last name, and 5 test scores...
     *  */
    public Tests(String fName, String lName, double[] tScores){
        this.fName = fName;
        this.lName = lName;
        this.tScores = tScores;
        //System.out.println(fName + "*******" + lName + "******" + Arrays.toString(tScores));
    }


    /**
     * Getters and Setters
     * */
    //The getter method to return the value of the student's first name...
    public String getfName() {
        return fName;
    }
    //The setter method to set the value of the student's first name...
    public void setfName(String fName) {
        this.fName = fName;
    }
    //The getter method to return the value of the student's last name...
    public String getlName() {
        return lName;
    }
    //The setter method to set the value of the student's last name...
    public void setlName(String lName) {
        this.lName = lName;
    }
    //The getter method to return the value of the student's letter grade...
    public String getlGrade() {
        return lGrade;
    }
    //The setter method to set the value of the student's letter grade...
    public void setlGrade(String lGrade) {
        this.lGrade = lGrade;
    }
    //The getter method to return the value of the student's test scores...
    public double[] gettScores() {
        return tScores;
    }
    //The setter method to set the value of the student's test scores...
    public void settScores(double[] tScores) {
        this.tScores = tScores;
    }
    //The getter method to return the value of the student's test average...
    public double getAvg() {
        return avg;
    }
    //The setter method to set the value of the student's test average...
    public void setAvg(double avg) {
        this.avg = avg;
    }
    //The getter method to return the value of the students class average...
    public double getcAvg() {
        return cAvg;
    }
    //The setter method to set the value of the students class average...
    public void setcAvg(double cAvg) {
        this.cAvg = cAvg;
    }

    /**
     * The calculateTestAvg() method calculates the average of
     * the student's 5 test scores using a scores double array
     * variable that is assigned the return value of the
     * gettScores() method. A gradeAvg double variable that is
     * set to zero to a "variable might not have be initialized"
     * error. A for each loop that loops through the scores double
     * array and adds each double element value to the gradeAve
     * double variable. The gradeAvg double variable is then
     * divided by the number of elements inside of the scores
     * double array using the scores.length method. The students
     * test average is set to equal the value of the gradeAve
     * double variable using the setAvg() method, then the
     * calculateTestAvg() method returns the value of the getAvg()
     * method...
     * */
    public double calculateTestAvg(){
        double[] scores = gettScores();
        double gradeAvg = 0 ;

        for (double score: scores) {
            gradeAvg += score;
        }
        gradeAvg = gradeAvg / scores.length;
        setAvg(gradeAvg);
        return getAvg();
    }



}
