package ss4_object.bai_tap.StopWatch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class StopElapsedTime {
    private Date startTime, stopTime;
    public void start() {
        startTime = new Date();
    }
    public void stop() {
        stopTime = new Date();
    }
    public float getElapsed() {
        return stopTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        StopElapsedTime time = new StopElapsedTime();
        double arr[] = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.floor(Math.random() * 100);
        }
        System.out.println("Mang truoc khi sort ");
        System.out.println(Arrays.toString(arr));
        time.start();
        Arrays.sort(arr);
        time.stop();
        System.out.println("Mang sau khi sort");
        System.out.println(Arrays.toString(arr));
        System.out.println("Thoi gian sort man la "+time.getElapsed() + " ms");
    }
}
