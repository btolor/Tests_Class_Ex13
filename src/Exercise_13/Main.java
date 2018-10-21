package Exercise_13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[]args){

        String fName, lName;
        double [] scores = new double[5];
        double newGrade;
        System.out.println("Enter the student's first name: ");
        fName = scan.nextLine();
        System.out.println("Enter the student's last name: ");
        lName = scan.nextLine();
        int num = 1;
        for(int i = 0; i < 5; i++){

            double test;
            System.out.println("Enter test score " + num +"" );
            test = scan.nextDouble();
            scores[i] = test;
            num++;
        }

        Tests sTests = new Tests(fName,lName,scores);

        System.out.println("Enter the student's first name: ");
        fName = scan.nextLine();
        System.out.println("Enter the student's last name: ");
        lName = scan.nextLine();
        num = 1;
        for(int i = 0; i < 5; i++){

            double test;
            System.out.println("Enter test score " + num +"" );
            test = scan.nextDouble();
            scores[i] = test;
            num++;
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
        Vector students = new Vector();
        students.add(Arrays.toString(sTests.toArray()));
        students.add(Arrays.toString(bTests.toArray()));
        System.out.println(students);

    }

}
