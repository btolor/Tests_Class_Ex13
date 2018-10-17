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

        for(int i = 0; i < 5; i++){
            int num = 1;
            double test;
            System.out.println("Enter test score " + num +"" );
            test = scan.nextDouble();
            scores[i] = test;
        }

        Tests sTests = new Tests(fName,lName,scores);
    }

}
