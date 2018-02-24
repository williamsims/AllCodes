//**************************************************
//              Programming Project 1 MP3
//  William Simunek                     2/26/18
//**************************************************
public class GlobalReplace
{
    private static String[] savedText = new String[100];
	private static int index = 0;
    
    public GlobalReplace(String input)
    {
        savedText[index] = "";
        index = index + 1;
        savedText[index] = input;
    }
    
    public static void replaceOne(String text, int i, int n, String sub)
    {
        index ++;
        savedText[index] = text.substring(0,i) + sub + text.substring(i+n, text.length());
        
    }
    public static void replaceAll(String text, String what, String sub)
    {
        index ++;
        while(text.indexOf(what) >= 0)
        {
          int temp = text.indexOf(what);
          text = text.substring(0,temp) + sub + text.substring(temp + 1, text.length());
        }
        savedText[index] = text;
    }
    public static void undoReplaceAll()
    {
        index --;
    }
    public static void redoReplaceAll()
    {
        index ++;
    }
    public String toString()
    {
        return savedText[index];
    }
    
}