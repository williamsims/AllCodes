//**************************************************
//                   Classwork
//  William Simunek                     12/14/17
//**************************************************
import java.util.Scanner;
public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String story = "One day there was a guy named ___ who lived in ___."
                        + "\nHe was no ordinary man, he was a ___ and had the secret identity: ___ man."
                        + "\nHe was a very ___ person and was well known around his city.";
        final String BLANK = "___";
        String name1, place1, occupation1, adj1, adj2;
        
        System.out.println("Enter a name:");
        name1 = scan.nextLine();
        System.out.println("Enter a place:");
        place1 = scan.nextLine();
        System.out.println("Enter an occupation");
        occupation1 = scan.nextLine();
        System.out.println("Enter an adjective");
        adj1 = scan.nextLine();
        System.out.println("Enter an adjective");
        adj2 = scan.nextLine();
        
        story = story.substring(0, story.indexOf(BLANK)) + name1 + story. substring((story.indexOf(BLANK) + BLANK.length()));
        story = story.substring(0, story.indexOf(BLANK)) + place1 + story. substring((story.indexOf(BLANK) + BLANK.length()));
        story = story.substring(0, story.indexOf(BLANK)) + occupation1 + story. substring((story.indexOf(BLANK) + BLANK.length()));
        story = story.substring(0, story.indexOf(BLANK)) + adj1 + story. substring((story.indexOf(BLANK) + BLANK.length()));
        story = story.substring(0, story.indexOf(BLANK)) + adj2 + story. substring((story.indexOf(BLANK) + BLANK.length()));
                
        System.out.println("\n" + story);
        
        
    }
}