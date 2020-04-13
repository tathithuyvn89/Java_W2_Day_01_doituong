package Java_W2_Day_01_doituong.Xaydung_lopStopWatch;

import java.util.Arrays;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
      // Tao ra mang so nguyen gom 100,000 so, tao ra bang cach su dung ham random;
        int [] arr= new int[100000];
        for (int i=0; i<arr.length;i++){
            arr[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(arr));
        // khoi tao doi tuong stopWatch;
        StopWatch stopWatch= new StopWatch();
        System.out.print("Start time : ");
        System.out.println(stopWatch.start()+" Milisecond");
        Arrays.sort(arr);
        System.out.print("Stop after sort Array time : ");
        System.out.println(stopWatch.stop() + " Milisecond");
        System.out.print(" Array with index 100,000 taken ");
        System.out.println(stopWatch.getElapsedTime()+" Milisecond");

    }
}
