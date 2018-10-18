package Exercise_13;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[]args){

        String fName, lName;
        double [] scores = new double[5];

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
        System.out.println(sTests.calculateTestAvg());
    }

}
