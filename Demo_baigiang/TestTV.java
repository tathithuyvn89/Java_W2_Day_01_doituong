package Java_W2_Day_01_doituong.Demo_baigiang;

public class TestTV {
    public static void main(String[] args) {
        TV tivi1 = new TV();
        tivi1.turnOn();
        tivi1.setChannel(0);
        tivi1.setVolume(8);
       TV tivi2 = new TV();
        tivi2.turnOn();
        tivi2.channelUp();
        tivi2.channelUp();
        tivi2.channelUp();
        System.out.println("Tv1's channel is "+ tivi1.channel+ " and volume level is "+tivi1.volumeLevel);
        System.out.println("Tv2's channel is "+ tivi2.channel+ " and volume level is "+tivi2.volumeLevel);
    }
}
