/**
 * The purpose of this program is to read data from
 * an input file.
 *
 * @author APCS Team
 * @version2025
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        String token = "";
        File fileName = new File("familymembers.txt");
        Scanner inFile = new Scanner(fileName);
        
        int twoBoys = 0;
        int twoGirls = 0;
        int mixed = 0;
        int totalFamilies;

        //while loop will continue while inFile has a next token to read
        while( inFile.hasNext() )
        {
            token = inFile.next( );      //read next token from file
            if (token.equals("BB"))
            {
                twoBoys++;
            }
            else if (token.equals("GG"))
            {
                twoGirls++;
            }
            else
            {
                mixed++;
            }
        }

        inFile.close();                 //close input file
        
        totalFamilies = twoBoys + twoGirls + mixed;

        System.out.println("Composition statistics for families with two children.");
        System.out.println("");
        System.out.println("Total number of families: " + totalFamilies);
        System.out.println("");
        System.out.println("Number of families with");
        System.out.println("\t2 boys: " + twoBoys + " represents " + (((int) (10000.0 * twoBoys / totalFamilies))/100.0) + "%");
        System.out.println("\t2 girls: " + twoGirls + " represents " + (((int) (10000.0 * twoGirls / totalFamilies))/100.0) + "%");
        System.out.println("\t1 boy and 1 girl: " + mixed + " represents " + (((int) (10000.0 * mixed / totalFamilies))/100.0) + "%");
        
    }
}

