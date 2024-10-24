import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.
//        If the number is a multiple of 5, you need to print "Buzz" instead of that
//        number.
//        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
//        instead of that number.

//        for (int i = 1; i <= 100; i++) {
//
//            if((i % 3 == 0) && (i % 5 == 0)){System.out.println("FizzBuzz");}
//
//            if (i % 3 == 0){System.out.println("Fizz");}
//            else if (i % 5 == 0)System.out.println("Buzz");
//            else System.out.println(i);
//        }

//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse
//        string: xof nworb kciuq ehT

//        --------- updated --------
        // System.out.println("Type a string to be reversed: ");
        //    String word = input.nextLine();
        //    String revword = "";

        //    for (int i = (word.length() - 1); i >=0; --i) {
        //        revword +=word.charAt(i);
        //    }
        //        System.out.println(revword);

//        3.Write a program to find the factorial value of any number entered
//        through the keyboard.

//        n! = (n - 1)! × n

//        System.out.println("Please enter a number to find the factorial.");
//        int fnum = input.nextInt();
//        int fsum = 1;
//
//        for (int i = fnum; i > 0 ; i--) {
//
//            fsum *= i;
//
//        }
//        System.out.println("the factorial: "+fsum);

//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method)

//        System.out.println("Type a two number to find the value of one number raised to the power of another.");
//        int n1 = input.nextInt();
//        System.out.println("Enter second number(power).");
//        int n2 = input.nextInt();
//        int sumofpower = n1;
//
//        for (int i = 0; i < n2; i++) {
//
//            sumofpower = n1 * n1;
//
//        }
//        System.out.println("Result: "+sumofpower);

//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.

//        System.out.println("Please enter numbers to find the total of even and add or 0 to quiet.");
//        int n1 = input.nextInt();
//        int sumeven=0;
//        int sumodd=0;
//        while(n1 != 0){
//            if (n1 % 2 == 0) {
//                sumeven = sumeven + n1;
//            }else {sumodd = sumodd + n1;}
//            System.out.println("Please RE enter a number to add or 0 for quiet. ");
//              n1= input.nextInt();
//        }
//
//        System.out.println("sum for even: "+sumeven);
//        System.out.println("sum for odd : "+sumodd);

//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.

//        System.out.println("Please enter a positive integer: ");
//        int n = input.nextInt();
//        boolean flag = true;
//
//        if (n <= 1) {
//            System.out.println("is not a prime number.");
//            flag =false;
//        } else {
//            for (int i = 2; i <= n / 2; i++) {
//                if ((n % i) == 0) {
//                    System.out.println("is not a prime number.");
//                    flag =false;
//
//                    break;
//                }
//            }
//        }
//        if (flag){
//            System.out.println("is a prime number.");
//
//        }
//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1
//        Day1
//        Day2
//        Day3
//        Day4
//        Day5
//        Day6
//        Day7
//        Week 2
//        Day1
//        Day2

//        for (int i = 1; i <= 4; i++) {
//            System.out.println("Week "+i);
//            for (int j = 1; j <= 7; j++) {
//                System.out.println("Day "+j);
//
//            }
//
//        }

//        8.Write a program thats check if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left.

//        System.out.println("Please enter a word to check if it's a palindrome.");
//        String word = input.nextLine();
//        String revword = "";
//
//        for (int i = (word.length() - 1); i >=0; --i) {
//            revword +=word.charAt(i);
//        }
//
//        if(word.equals(revword)){
//            System.out.println("The word is a palindrome");
//        }else System.out.println("The word is not a palindrome");

    }
}
