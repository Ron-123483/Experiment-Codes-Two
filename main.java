/* public class main {
    public static void main(String[] args) {

        //values

        final double PI = 3.1415926;
        double Radius = 60;
        double a = 10;
        double b = 20;
        double c = 30;
        //storing prem and COTC(Circumference of the circle)

        double prem = 0.0;
        double COTC = 0.0;
        // Compute the perimeter of a Triangle

        prem = a + b + c;
        // Compute the Circumference of the Circle

        COTC = (2 * PI * Radius);
        // Result prem and Circumfrence of a circle

        System.out.println("The perimeter of a Triangle with sides 'a', 'b', 'c' is " + prem);
        System.out.println("The perimeter of a Circle of radius is " + COTC);


    }
}

*/
/*
public class main {
    public static void main(String[] args) {

        // naming the variables
        final double PI = 3.1415926;
        double radius = 5.400000;
        double b = 4.0;
        double h = 5.0;
        double l = 6.0;

        // storing VOS and VTP
        double VOS = 0.0;
        double VTP = 0.0;

        // I didn't know how to put them in fraction form, so I put it in decimal form.
        VOS = 1.3 * PI * (radius * radius * radius);

        VTP = 0.5 * (b * h * l) ;


        // Printing out the final result
        System.out.println("Volume of a Circle of radius 5.400000 is : " + VOS);

        System.out.println("The volume of a Triangular Prism with base: '50 height' , '40 base', '60 length' : " + VTP);

// Compute the volume of a Triangular Prism

        //Compute the perimeter of a Sphere
        //You can use the following formula for computing the volume of Sphere:
        //You can use the following formula for computing the volume of the Triangular Prism:
        //After computing the volume of each shape, print of the shapes volume value to the console. See the example output below.
        //We are going to use the following value of PI : 3.1415926


   }
 }
 */


import java.sql.SQLOutput;
import java.util.Scanner;

//public class main {
   // public static void main(String[] args) {

        //short x = Short.MAX_VALUE;
        //System.out.println(x-2);


        // Need to go over don't understand
       //int x = 25;
       //System.out.println(25 % 5);

       // int x = 25;
       // System.out.println(1 % 5);

       // System.out.println(55555555666666l % 100);

        //System.out.println

        // n % m 0, m-1

    /*

    confusing as shit need to go over

    x /= 10;   // Syntatcic sugar



        int x = 21;
        int sumOfDigit = 0;
        sumOfDigit = x % 10;

        x = x / 10;
        sumOfDigit = sumOfDigit + (x % 100);
        System.out.println(sumOfDigit);

     */

    //int x = 21;
    //x ++;

  //  System.out.println(++x);   // confusing as shit need to go over

      //int x = 21;
        //System.out.println();

        // Alt + Enter wil import Scanner for me


        // Basic python stuff have to relearn in java
/*
//        final double PI = 3.14159;
        double radius;

        // Confusing as hell

        String source; "33";
        Scanner userInput = new Scanner(source: "33")//System.in);
        System.out.print("Enter a radius as integer: ");
        userInput.nextInt();
        radius = userInput.nextInt();







    }
    }


*/

//volume = (4./3.) * PI * (radius*radius*radius);
// This is how we do correctly so we don't have to use decimal




//public class main {
   // public static void main(String[] args) {

        //int joker = 38;
       // int king = 31;
        //int sum = joker - king;
       // System.out.println(sum);

       // int tester = 117 % 18;
       // System.out.print(tester);


        //double myNumber1 = 30 - 20 / 3;
        //double myNumber2 = (30 - 20) / 3;

       // System.out.println(myNumber1);
       // System.out.println(myNumber2);
 //   }
  //  }

import java.util.Scanner;
/*
public class main {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your favorite food? ");
        String food = scanner.nextLine();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old. " );
        System.out.println("You like " + food );



    }
}

*/

/*
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);





    }


}


*/

/*

public class main{

    public static void main(String[] args){

        int friends = 10;

        friends--;

        System.out.println(friends);





    }

}

*/



/*

import javax.swing.JOptionPane;

public class main{

    public static void main (String[] args){

        String name =JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");


    }


}

*/

/*
import java.util.Scanner;

public class main{

    public static void main (String[] args) {

        //Added scanner for bet
        Scanner userInput = new Scanner (System.in);
        int money = 100;
        int bet;
        // took the print statements outside so they don't repeat.
        // didn't know we only needed one of these

        System.out.println("You have, $" + money + " left.");
        System.out.print("How much do you want to bet? ");
        bet = userInput.nextInt();

        // The use if statement to print out the following statements.
        if (money < 5) {
            System.out.print("Caution!  Bet carefully.");

        } else if (money < 10) {
            System.out.print("Consider betting moderately.");

        } else {
            System.out.print("You may bet liberally. ");
            }


    }
}


*/

// correct code
/*
public class main {

    public static void main(String[] args) {

        int x = 15;

        if (x % 5 == 0 && x % 3 == 0) {
            System.out.println("The value is a multiple of both 5 and 3");
        } else if (x % 5 == 0) {
            System.out.println("The value is a multiple of 5");
        } else if (x % 3 == 0) {
            System.out.println("The value is a multiple of 3");
        }


    }
}

/*

// incorrect code


public class main {

    public static void main(String[] args) {

        int x = 15;

        if (x % 5 == 0) {
            System.out.println("The value is a multiple of 5");
        } else if (x % 3 == 0) {
            System.out.println("The value is a multiple of 3");
        } else if (x % 5 == 0 && x % 3 == 0) {
            System.out.println("The value is a multiple of both 3 and 5");
        }
    }
}


*/



import java.util.Scanner;

public class main {

    public static void main(String[] args) {

    double grade = 85;

    if (grade >= 90){

        System.out.println("A");

    }
    else{
        if(grade <= 50){
            System.out.println("F");

        }
    }


    }
}












































































