import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;
    private long totalTime;
    public StopWatch(){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date startTime(){
        return new Date();
    }

    public long start(){
        return startTime = System.currentTimeMillis();
    }
    public long stop(){
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return totalTime = (long)(this.startTime - this.endTime);
    }
}
