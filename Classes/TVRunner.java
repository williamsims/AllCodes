//
//
public class TVRunner
{
    public static void main(String[] args)
    {
        TV t1 = new TV(15, 2);
        t1.power();
        System.out.println(t1.toString());
        t1.changeChannel(199);
        t1.volumeDown();
        t1.volumeDown();
        t1.volumeDown();
        t1.channelUp();
        t1.channelUp();
        System.out.println(t1.toString());
        t1.power();
        System.out.println(t1.toString());
    }
}