package runners;

public class Race {
    private String raceID;
    private Runner[] Runners;
    private float[]times;
    private boolean isFinals;
    private int numRunners;
    private float classificationTime;

    public Race(String raceID) {
        this.raceID = raceID;
        this.Runners = new Runner[8];
        this.times= new float[8];
        this.isFinals = false;
        this.numRunners=0;
        this.classificationTime=0f;
    }

    public Race(String raceID, boolean isFinals, float classificationTime) {
        this.raceID = raceID;
        this.Runners = new Runner[8];
        this.times= new float[8];
        this.isFinals = isFinals;
        this.numRunners=0;
        this.classificationTime = classificationTime;
    }

    public String getRaceID() {
        return raceID;
    }

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }

    public Runner[] getRunners() {
        return Runners;
    }

    public void setRUNNERS(Runner[] Runners) {
        this.Runners = Runners;
    }

    public float[] getTimes() {
        return times;
    }

    public void setTimes(float[] times) {
        this.times = times;
    }

    public boolean isFinals() {
        return isFinals;
    }

    public void setFinals(boolean finals) {
        isFinals = finals;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public float getClassificationTime() {
        return classificationTime;
    }

    public void setClassificationTime(float classificationTime) {
        this.classificationTime = classificationTime;
    }

    public void addRunner( Runner r){
        if (numRunners<Runners.length) {
            Runners[numRunners] = r;
            numRunners++;
        }
        else{
            System.out.println("Màxim esgotat de carrrerees.");
        }
    }
   public void addTimeToRunner(Runner r,float f){
        for (int i=0; i<numRunners;i++) {
            if (Runners[i]==r){
                times[i]+=f;
                break;
            }
       }
   }
   public float bestTime(){
       float minTime=9999999;
       for (int i=0;i<numRunners;i++){
           if(times[i]<minTime) {
               minTime = times[i];
           }
       }
       return minTime;
   }
   public String bestRunner(){
       float minTime=9999999;
       String fastestRunner=null;
       for (int i=0;i<numRunners;i++){
           if(times[i]<minTime) {
               minTime = times[i];
               fastestRunner=Runners[i].getName();
           }
       }
       return fastestRunner;
   }
   public float averageTimes(){
       float mitjanaTemps=0;
       if(numRunners>0) {
           for (int i = 0; i < numRunners; i++) {
               mitjanaTemps+=times[i];
           }
           return mitjanaTemps/numRunners;
       }
       else{
           return 0f;
       }
   }
   public float differenceBestFromWorst(){
       float maxTime=Float.MIN_VALUE;
       for (int i=0;i<numRunners;i++){
           if(times[i]>maxTime) {
               maxTime = times[i];
           }
       }
       return maxTime-bestTime();
   }
}
