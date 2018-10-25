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
        double[] testScores = new double[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter test score " + num +"" );
            while (!scan.hasNextDouble()){
                scan.next();
                System.out.println("Invalid entry. Try Again!");
            }
            testScores[i] = scan.nextDouble();
            num++;
        }
        System.out.println(Arrays.toString(testScores));
        return testScores;
    }



    public static void main(String[]args){

        //First Student...
        String fName, lName;
        double [] scores ;
        boolean changeTestGrande;

        System.out.println("Enter the student's first name: ");
        while (!scan.hasNext()){
            scan.next();
            System.out.println("Invalid entry. Try Again!");
        }
        fName = scan.nextLine();
        System.out.println("Enter the student's last name: ");
        while (!scan.hasNext()){
            scan.next();
            System.out.println("Invalid entry. Try Again!");
        }
        lName = scan.nextLine();
        scan.nextLine();

        scores = testScores();
        System.out.println(Arrays.toString(scores));
        Tests studentA = new Tests(fName,lName,scores);
        /*changeTestGrande = true;
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
                    while (!scan.hasNextDouble()){
                        scan.next();
                        System.out.println("Invalid entry. Try Again!");
                    }
                    newScore = scan.nextDouble();
                }else {
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentA.modifyTestGrade(test, newScore);
        }
        studentA.calculateTestAvg();
        studentA.calculateLetterGrade();*/
        System.out.println(studentA.getfName() + "      " + studentA.getlName()+ "        "+Arrays.toString(studentA.gettScores()));
        //Second Student...
        /**System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentB = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentB.modifyTestGrade(test, newScore);
        }
        studentB.calculateTestAvg();
        studentB.calculateLetterGrade();
        //Third Student...
        System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentC = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentC.modifyTestGrade(test, newScore);
        }
        studentC.calculateTestAvg();
        studentC.calculateLetterGrade();
        //Fourth Student...
        System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentD = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentD.modifyTestGrade(test, newScore);
        }
        studentD.calculateTestAvg();
        studentD.calculateLetterGrade();
        //Fifth Student...
        System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentE = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentE.modifyTestGrade(test, newScore);
        }
        studentE.calculateTestAvg();
        studentE.calculateLetterGrade();
        //Sixth Student...
        System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentF = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentF.modifyTestGrade(test, newScore);
        }
        studentF.calculateTestAvg();
        studentF.calculateLetterGrade();
        //Seventh Student...
        System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentG = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentG.modifyTestGrade(test, newScore);
        }
        studentG.calculateTestAvg();
        studentG.calculateLetterGrade();
        //Eighth Student...
        System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentH = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentH.modifyTestGrade(test, newScore);
        }
        studentH.calculateTestAvg();
        studentH.calculateLetterGrade();
        //Nineth Student...
        System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentI = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentI.modifyTestGrade(test, newScore);
        }
        studentI.calculateTestAvg();
        studentI.calculateLetterGrade();
        //Tenth Student...
        System.out.println("Enter the student's first name: ");
        fName = scan.next();
        System.out.println("Enter the student's last name: ");
        lName = scan.next();
        scores = testScores();
        Tests studentJ = new Tests(fName,lName,scores);
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
                    System.out.println("Invalid entry! This student only has 5 test scores.");
                }
            }else {
                changeTestGrande = false;
            }
            studentJ.modifyTestGrade(test, newScore);
        }
        studentJ.calculateTestAvg();
        studentJ.calculateLetterGrade();







       /**
        * The instances of Vector class vector object lets me store an
        * array of Tests class objects instantiated...
        *
        Vector students = new Vector();
        students.add(studentA);
       students.add(studentB);
        students.add(studentC);
        students.add(studentD);
        students.add(studentE);
        students.add(studentF);
        students.add(studentG);
        students.add(studentH);
        students.add(studentI);
        students.add(studentJ);
        System.out.println(students);*/

    }

}
