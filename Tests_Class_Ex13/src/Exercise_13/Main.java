package Exercise_13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    static Scanner scan = new Scanner(System.in);
    /**
     * This static function is a for loop to get input form the
     * user for the student's 5 test scores. The function's
     * return value is a double array...
     * */
    public static double[] testScores(){
        int num = 1;
        double test;
        double[] testScores = new double[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter test score " + num +"" );
            test = scan.nextDouble();
            testScores[i] = test;
            num++;
        }
        return testScores;
    }

    public void gradeChange(int a, double b){

    }

    public static void main(String[]args){

        String fName, lName;
        double [] scores = new double[5];
        boolean changeTestGrande;

        /**System.out.println("Enter the student's first name: ");
        fName = scan.nextLine();
        System.out.println("Enter the student's last name: ");
        lName = scan.nextLine();
        scores = testScores();

        Tests sTests = new Tests(fName,lName,scores);*/

        changeTestGrande = true;
        while (changeTestGrande){
            int yesOrNo;
            int test = 0;
            double newScore = 0;
            System.out.print("Would you like to modify one of 's test scores? Type 1 for Yes:  ");
            while (!scan.hasNextInt()){
                scan.next();
                System.out.println("Invalid entry. Try Again!");
            }
            yesOrNo = scan.nextInt();
            System.out.println();
            if(yesOrNo == 1){
                System.out.print("Which test score would you like to modify (e.g. Test1 = 1, Test2 = 2 etc...):  ");
                while (!scan.hasNextInt()){
                    scan.next();
                    System.out.println("Invalid entry. Try Again!");
                }
                test = scan.nextInt();
                if(test <6){
                    System.out.println();
                    System.out.print("What would you like to change the test score to: ");
                    while (!scan.hasNextInt()){
                        scan.next();
                        System.out.println("Invalid entry. Try Again!");
                    }
                    newScore = scan.nextDouble();

                }else {
                    System.out.println("Invalid entry!");
                }
                //sTests.modifyTestGrade(test, newScore);
            }else {
                changeTestGrande = false;
            }
        }




       // }

        /**System.out.println("Enter the student's first name: ");
        fName = scan.nextLine();
        System.out.println("Enter the student's last name: ");
        lName = scan.nextLine();
        num = 1;
        for(int i = 0; i < 5; i++){

            double test;
            System.out.println("Enter test score " + num +"" );
            test = scan.nextDouble();
            scores[i] = test;

        }
        Tests bTests = new Tests(fName,lName,scores);
       /* System.out.println("Which grade would you like to modify:(e.g. 1 = grade1, 2 = grade 2 etc...)");
        int index = scan.nextInt();
        System.out.println("Which grade would you like to modify:(e.g. 1 = grade1, 2 = grade 2 etc...)");
        newGrade = scan.nextDouble();
        System.out.println(Arrays.toString(sTests.gettScores()) + " is now ");
        sTests.modifyTestGrade(index,newGrade);
        System.out.println(Arrays.toString(sTests.gettScores()) + " is now ");*/

       /**
        * The instances of Vector class vector object lets me store an
        * array of Tests class objects instantiated with an Tests class
        * string[] array. Each Tests class object is added to the vector
        * using the java.lang Arrays.toString method that passes as a
        * parameter the Tests class's toArray() method...
        * */
        /**Vector students = new Vector();
        students.add(sTests.toString());
        //students.add(bTests.toString());
        System.out.println(students);*/

    }

}
