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

    /**
     * The modifyTestGrade() method is used to modify an individual test score
     * of the student. The method takes in two parameters, index and newGrade.
     * The index int variable is used to select the index of the element in the
     * test scores array and the newGrade double variable is used to replace the
     * value of the selected index's element value. A scores double[] array
     * variable is assigned the return value of the gettScores() method and the
     * scores[] index - 1 element is assigned the newScore double variable. The
     * settScores() method sets the tScores[] private double array to equal the
     * score[] double array and the method returns the return value of the
     * gettScores() method...
     * */
    public double[] modifyTestGrade(int index, double newScore){
        double [] scores = gettScores();
        scores[index - 1] = newScore;
        settScores(scores);
        return gettScores();
    }



    /**
     * The calculateLetterGrade() method calculates the letter grade
     * of the students test average using if and else if statements.
     * The method uses a double variable named grade that is assigned
     * the return value of the getAvg() method. If the grade double
     * variable value is greater than or equal to 90 the setlGrade()
     * setter method sets the lGrade private string variable value to
     * "A". Else if the grade double variable value is less than or equal
     * to 89 and greater than or equal to 80 the setlGrade() setter
     * method sets the lGrade private string variable value to "B". Else
     * if the grade double variable value is less than or equal to 79
     * and greater than or equal to 70 the setlGrade() setter method sets
     * the lGrade private string variable value to "C". Else if the grade
     * double variable value is less than or equal to 69 and greater than
     * or equal to 60 the setlGrade() setter method sets the lGrade
     * private string variable value to "D". Else if the grade double
     * variable value is less than 60 the setlGrade() setter method sets
     * the lGrade private string variable value to "F". Once the if/else
     * statements are executed the method's return statement returns the
     * return value of the getlGrade() method
     * */
    public String calculateLetterGrade(){
        double grade = getAvg();
        if(grade >= 90){
            setlGrade("A");
        }else if (grade <= 89 && grade >= 80){
            setlGrade("B");
        }else if (grade <= 79 && grade >= 70){
            setlGrade("C");
        }else if (grade <= 69 && grade >= 60){
            setlGrade("D");
        }else if (grade <= 59){
            setlGrade("F");
        }
        return getlGrade();
    }



}
