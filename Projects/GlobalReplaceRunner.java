//**************************************************
//              Programming Project 1 MP3
//  William Simunek                     2/26/18
//**************************************************
public class GlobalReplaceRunner
{
    public static void main(String[] args)
    {
        GlobalReplace text = new GlobalReplace("this is the test for these methods");
        System.out.println(text);
        text.undoReplaceAll();
        System.out.println(text);
        text.redoReplaceAll();
        System.out.println(text);
        text.replaceOne(text.toString(),12,4,"trial run");
        System.out.println(text);
        text.replaceOne(text.toString(),26,12,"this class");
        text.replaceAll(text.toString(),"h","*");
        System.out.println(text);
        text.replaceAll(text.toString(),"t","!");
        System.out.println(text);
        text.undoReplaceAll();
        text.undoReplaceAll();
        text.undoReplaceAll();
        System.out.println(text);
        text.redoReplaceAll();
        text.redoReplaceAll();
        text.redoReplaceAll();
        System.out.println(text);
        
    }
}