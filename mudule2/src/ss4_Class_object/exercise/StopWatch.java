package ss4_Class_object.exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


public class StopWatch {
    private long startTime, endTime;

    private StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

//    private StopWatch(long startTime, long endTime) {
//        this.startTime = System.currentTimeMillis();
//        this.endTime = System.currentTimeMillis();
//    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    private long start() {
        return (startTime = System.currentTimeMillis());

    }
    private long stop() {
        return (endTime = System.currentTimeMillis());

    }
    public long getElapsedTime() {
        return (endTime - startTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int sum =0;
        for (int i =0; i < 1000000000; i++){
            sum+=i;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
