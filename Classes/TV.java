
public class TV
{
    private int channel;
    private int volume;
    private boolean power;
    private final int MAX_CHANNEL = 200;
    private final int MAX_VOLUME = 30;
    private final int MIN_CHANNEL = 1;
    private final int MIN_VOLUME = 0;
    
    public TV()
    {
        channel = 1;
        volume = 0;
        power = false;
    }
    public TV(int c, int v)
    {
        if (c >= 1 && c <= 200)
            channel = c;
        if (v >= 0 && v <=30)
            volume = v;
        power = false;
    }
    public void channelUp()
    {
        channel++;
        if (channel > 200)
            channel = MAX_CHANNEL;
    }
    public void channelDown()
    {
        channel--;
        if (channel < 1)
            channel = MIN_CHANNEL;
    }
    public void changeChannel(int c)
    {
        channel = c;
        if (channel > 200 || channel < 1)
            channel = MAX_CHANNEL;
    }
    public void volumeUp()
    {
        volume++;
        if (volume > 30)
            volume = MAX_VOLUME;
    }
    public void volumeDown()
    {
        volume--;
        if (volume < 0)
            volume = MIN_VOLUME;
    }
    public void power()
    {
        if(power)
            power = false;
        else
            power = true;
    }
    public int getChannel()
    {
        return channel;
    }
    public int getVolume()
    {
        return volume;
    }
    public boolean getPower()
    {
        return power;
    }
    public String toString()
    {
        return "Power: " + power + "\nChannel: " + channel + "\nVolume: " + volume;
    }
        
}