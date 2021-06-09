import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class positiveInteger {
    public static void main(String[] args){
        System.out.println("Please enter some numbers");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        StringBuilder userInput1 = new StringBuilder();
        userInput1.append(userInput);
        userInput1.reverse();
        System.out.println("The number you entered is:" +userInput + " and in reverse the number is: " +userInput1);

    }
}
