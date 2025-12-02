/**
 * Randomly generate passwords.
 *
 * @author Garrison Winters
 * @version 12-1-2025
 * */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 0; 
        
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
        
        while(userChoice.equalsIgnoreCase("Y"))
        {
            String password = ""; 
            
            System.out.print("Enter a password Length (6 or more): ");
            if(in.hasNextInt()) {
                pwLength = in.nextInt();
            } else {
                in.next(); //Clear invalid input!
                pwLength = 0;
            }

            while(pwLength < 6)
            {
                System.out.println("\tPassword length too short. Please try again.");
                System.out.print("Enter a password Length (6 or more): ");
                if(in.hasNextInt()) {
                    pwLength = in.nextInt();
                } else {
                    in.next(); 
                }
            }

/*
            for(int i = 0; i < pwLength; i++)
            {
                int choice = (int)(Math.random() * 3);
                int asciiVal = 0;

                if(choice == 0) {
                    asciiVal = (int)(Math.random() * 10) + 48;
                }
                else if(choice == 1) {
                    asciiVal = (int)(Math.random() * 26) + 65;
                }
                else {
                    asciiVal = (int)(Math.random() * 26) + 97;
                }

                password += (char)asciiVal;
            }
*/
            
            for(int i = 0; i < pwLength; i++)
            {
                int asciiVal = (int)(Math.random() * 75) + 48;

                while(!((asciiVal >= 48 && asciiVal <= 57) || (asciiVal >= 65 && asciiVal <= 90) || (asciiVal >= 97 && asciiVal <= 122)))
                {
                    asciiVal = (int)(Math.random() * 75) + 48;
                }

                // concatenate the character to the password
                password += (char)asciiVal;
            }

            
            outFile.println(password);
            System.out.println("\nA password has been written to the text file");

            System.out.print("Would you like to generate another password? Y/N ");
            userChoice = in.next();
        }

        outFile.close();

        System.out.println("\nThank you for using the Pass Code Generator.\n");

        System.out.println("Here are your randomly generated codes:");
        
        Scanner fileScanner = new Scanner(new File("passwords.txt"));
        int count = 1;
        while(fileScanner.hasNext())
        {
            String token = fileScanner.next();
            System.out.println(count + ".\t" + token);
            count++;
        }
        fileScanner.close();

    }
}
