package Java_W2_Day_01_doituong.Xaydung_lopStopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long stopTime;
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
//    public void setStartTime(int startTime) {
//        this.startTime = startTime;
//    }

    public  long getStartTime(){
        return startTime;
    }
    public  long getStopTime(){
        return stopTime;
    }
    public long start(){
      return startTime= System.currentTimeMillis();
    }
    public long stop(){
        return stopTime= System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return stopTime-startTime;
        //Giả sử trong trường hợp này có thể tạo ra phương thức { return stop()-start() được không
    }
}
