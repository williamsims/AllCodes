//**************************************************
//                     Capstone
//  William Simunek                     12/19/17
//**************************************************
import java.util.Scanner;
public class FirstCode
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in the name of the state you want to check the probability"
                            +"for different weather events:");
        String state = scan.nextLine().toLowerCase();
        System.out.println("Enter in the integer for the month you want to look at the data for"
                           + "\nJanuary being 1, February being 2, and etc.");
        int month = scan.nextInt();
        System.out.println();
        double hurricane = 0;
        double earthquake = 0;
        double tornado = 0;
        double place3 = 0;
        double place4 = 0;
        int validator = 0;
        
        if(month == 1)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 0;
                earthquake = 0.463;
                tornado = 12.328;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.148;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.279;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.37;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 0;
                earthquake = 3.843;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.519;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 2)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 0;
                earthquake = 0.463;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.284;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.148;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.198;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.0463;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.0463;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.279;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 0;
                earthquake = 3.843;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.519;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 3)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 0;
                earthquake = 0.463;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.284;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.148;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 19.434;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 19.434;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 0;
                earthquake = 3.843;
                tornado = 31.432;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.519;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 4)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 0;
                earthquake = 0.463;
                tornado = 26.153;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.149;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 31.432;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 24.658;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 30.199;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 24.658;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 28.914;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 0;
                earthquake = 3.843;
                tornado = 46.130;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.519;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 5)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 0;
                earthquake = 0.463;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.148;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.592;
                tornado = 30.199;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 34.871;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 30.199;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 53.740;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 19.493;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 19.493;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 30.199;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 35.944;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 1.414;
                earthquake = 0.046;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 46.130;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 24.658;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 0;
                earthquake = 3.843;
                tornado = 57.166;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 25.159;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 6)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 0;
                earthquake = 0.463;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.148;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 36.986;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 1.414;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 8.485;
                earthquake = 0;
                tornado = 24.658;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 28.914;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 34.871;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 40.890;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 4.243;
                earthquake = 0.046;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 26.153;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 39.950;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 1.414;
                earthquake = 0.139;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 1.414;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 31.432;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 1.414;
                earthquake = 0.139;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 34.871;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 14.142;
                earthquake = 3.843;
                tornado = 44.452;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 26.153;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.519;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 7)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 4.243;
                earthquake = 0.463;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.148;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 28.914;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 8.485;
                earthquake = 0;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 24.658;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 2.282;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 30.199;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 1.414;
                earthquake = 0.139;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 4.243;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 27.568;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 4.243;
                earthquake = 0.139;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 8.618;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 12.728;
                earthquake = 3.843;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.519;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 8)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 2.828;
                earthquake = 0.463;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.284;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.148;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 2.828;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 33.941;
                earthquake = 0;
                tornado = 24.658;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 11.314;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 17.346;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.185;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 21.213;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 7.071;
                earthquake = 0.139;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 5.657;
                earthquake = 0.139;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 25.456;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 2.282;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 11.314;
                earthquake = 0.139;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 16.971;
                earthquake = 3.843;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 5.657;
                earthquake = 0.602;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.159;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 9)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 14.142;
                earthquake = 0.463;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.184;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 2.828;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 42.426;
                earthquake = 0;
                tornado = 26.153;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 7.071;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.185;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 36.77;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 7.071;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 9.9;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 12.728;
                earthquake = 0.139;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 2.828;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 7.071;
                earthquake = 0.139;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 28.284;
                earthquake = 0.046;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 7.071;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 15.556;
                earthquake = 0.139;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.307;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 24.042;
                earthquake = 3.843;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 7.071;
                earthquake = 0.602;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.5199;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 10)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 2.828;
                earthquake = 0.463;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.184;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 48.083;
                earthquake = 0;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 8.485;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 11.314;
                earthquake = 0.0446;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 1.414;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 2.828;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 2.828;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 7.071;
                earthquake = 0.046;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 17.436;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 1.414;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 8.485;
                earthquake = 0.139;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 5.657;
                earthquake = 3.843;
                tornado = 27.568;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 2.282;
                earthquake = 0.602;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.092;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.519;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 11)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 0;
                earthquake = 0.463;
                tornado = 23.065;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.184;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 2.282;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 8.719;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 21.354;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 1.414;
                earthquake = 0.046;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 0;
                earthquake = 3.843;
                tornado = 25.153;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.519;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
                if(month == 12)
        {
            if(state.compareTo("alabama") == 0)
            {
                hurricane = 0;
                earthquake = 0.463;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("alaska") == 0)
            {
                hurricane = 0;
                earthquake = 100;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arizona") == 0)
            {
                hurricane = 0;
                earthquake = 2.824;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo("arkansas") == 0)
            {
                hurricane = 0;
                earthquake = 3.148;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "california") == 0)
            {
                hurricane = 0;
                earthquake = 71.528;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "colorado") == 0)
            {
                hurricane = 0;
                earthquake = 2.593;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "connecticut") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "deleware") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "florida") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "georgia") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "hawaii") == 0)
            {
                hurricane = 0;
                earthquake = 9.259;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "idaho") == 0)
            {
                hurricane = 0;
                earthquake = 4.398;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "illinois") == 0)
            {
                hurricane = 0;
                earthquake = 0.231;
                tornado = 8.718;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "indiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.185;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "iowa") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kansas") == 0)
            {
                hurricane = 0;
                earthquake = 4.815;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "kentucky") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "louisiana") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maine") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "maryland") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "massachusetts") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "michigan") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "minnesota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "mississippi") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 15.010;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "missouri") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 12.329;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "montana") == 0)
            {
                hurricane = 0;
                earthquake = 4.120;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nebraska") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "nevada") == 0)
            {
                hurricane = 0;
                earthquake = 23.75;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new hampshire") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new jersey") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new mexico") == 0)
            {
                hurricane = 0;
                earthquake = 1.759;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "new york") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north carolina") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "north dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.046;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "ohio") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oklahoma") == 0)
            {
                hurricane = 0;
                earthquake = 79.352;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "oregon") == 0)
            {
                hurricane = 0;
                earthquake = 0.787;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "pennsylvania") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "rhode island") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south caroina") == 0)
            {
                hurricane = 0;
                earthquake = 0.139;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "south dakota") == 0)
            {
                hurricane = 0;
                earthquake = 0.278;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "tennessee") == 0)
            {
                hurricane = 0;
                earthquake = 0.370;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "texas") == 0)
            {
                hurricane = 0;
                earthquake = 3.943;
                tornado = 19.494;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "utha") == 0)
            {
                hurricane = 0;
                earthquake = 3.194;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "vermont") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.602;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "washington") == 0)
            {
                hurricane = 0;
                earthquake = 2.778;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "west virginia") == 0)
            {
                hurricane = 0;
                earthquake = 0.093;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wisconsin") == 0)
            {
                hurricane = 0;
                earthquake = 0;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            if(state.compareTo( "wyoming") == 0)
            {
                hurricane = 0;
                earthquake = 23.529;
                tornado = 0;
                place3 = 0;
                place4 = 0;
                validator = 1;
            }
            
        }
        if(month >= 1 && month <= 12)
        {
            if(month == 1 && validator == 1)
            {
                System.out.println("In January, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 2 && validator == 1)
            {
                System.out.println("In February, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 3 && validator == 1)
            {
                System.out.println("In March, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 4 && validator == 1)
            {
                System.out.println("In April, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 5 && validator == 1)
            {
                System.out.println("In May, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 6 && validator == 1)
            {
                System.out.println("In June, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 7 && validator == 1)
            {
                System.out.println("In July, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 8 && validator == 1)
            {
                System.out.println("In August, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 9 && validator == 1)
            {
                System.out.println("In September, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 10 && validator == 1)
            {
                System.out.println("In October, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 11 && validator == 1)
            {
                System.out.println("In November, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
            if(month == 12 && validator == 1)
            {
                System.out.println("In December, the percent chance of events happening in " + state
                                    + " are as follows:\nhurricane:\t" + hurricane + "%\nearthquake:\t" 
                                    + earthquake + "%\ntornado:\t" + tornado +"%\nplace3:\t\t" + place3
                                    + "%\nplace4:\t\t" +place4);
            }
        } 
        if(validator == 0)
            System.out.println("Invalid State Name");
        if(month < 1)
            System.out.println("Invalid Month Entry");
        if(month > 12)
            System.out.println("Invalid Month Entry");

    }
}