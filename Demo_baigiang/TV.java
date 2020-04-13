package Java_W2_Day_01_doituong.Demo_baigiang;

public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean on =false;
    public TV(){

    }
    public TV(boolean on,int channel,int volumeLevel){
        this.on=on;
        this.volumeLevel=volumeLevel;
        this.channel=channel;
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff(){
        on=false;
    }
    public void setChannel(int newChannel){
        if(on&&newChannel>=1&&newChannel<=120)
            channel=newChannel;
    }
    public void setVolume(int newVolumeLevel){
        if (on&&newVolumeLevel>=1&&newVolumeLevel<=7)
            volumeLevel=newVolumeLevel;
    }
    public void channelUp(){
        if (on&&channel<120)
            channel++;
    }
    public void channelDown(){
        if (on&&channel>1)
            channel--;
    }
    public void volumeUp(){
        if (on&&volumeLevel<7)
            volumeLevel++;
    }
    public void volumeDown(){
        if (on&&volumeLevel>1)
            volumeLevel--;
    }
//    public boolean turnOn(){
//        return this.on=true;
//    }
//    public boolean turnOff(){
//        return this.on=false;
//    }
//    public int setChannel( int newChannel){
//        if (this.on&&newChannel>=1&&newChannel<=120) {
//            this.channel = newChannel;
//        }
//        return this.channel;
//
//    }
//    public int setVolume(int newVolume){
//        if (this.on&&newVolume>=1&&newVolume<=8) {
//            this.volumeLevel = newVolume;
//        }
//        return this.volumeLevel;
//    }


}
