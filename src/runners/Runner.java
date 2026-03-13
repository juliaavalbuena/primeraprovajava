package runners;

public class Runner {
    private String name;
    private String team;
    private String[] raceIDs;
    private float[] times;
    private int numRaces;
    private boolean professional;

    public Runner(String name) {
        this.name = name;
        this.team=null;
        this.raceIDs= new String[5];
        this.times= new float[5];
        this.numRaces=0;
        this.professional = false;
    }

    public Runner(String name, String team, boolean professional) {
        this.name = name;
        this.team = team;
        this.raceIDs= new String[5];
        this.times= new float[5];
        this.numRaces=0;
        this.professional = professional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String[] getRaceIDs() {
        return raceIDs;
    }

    public void setRaceIDs(String[] raceIDs) {
        this.raceIDs = raceIDs;
    }

    public float[] getTimes() {
        return times;
    }

    public void setTimes(float[] times) {
        this.times = times;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }

    public boolean isProfessional() {
        return professional;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    //mètodes
    public void addRace(String raceID){
        if (numRaces<5){
            this.raceIDs[numRaces]=raceID;
            numRaces++;
        }
        else{
            System.out.println("Màxim esgotat de carrrerees.");
        }
    }
    public void addTime(float time){
        if (numRaces<=5){
            this.times[numRaces-1]=time;
        }
        else{
            System.out.println("Màxim esgotat de carrrerees.");
        }
    }
    public float bestTime(){
       float minTime=9999999;
        for (int i=0;i<numRaces;i++){
            if(times[i]<minTime) {
                minTime = times[i];
            }
        }
        return minTime;
    }
    public float averageTimes(){
        float mitjanaTemps=0;
        if(numRaces>0) {
            for (int i = 0; i < numRaces; i++) {
                mitjanaTemps+=times[i];
            }
            return mitjanaTemps/numRaces;
        }
        else{
            return 0f;
        }
    }
    public String bestRace (){
        float minTime=9999999;
        String fastestRace=null;
        for (int i=0;i<numRaces;i++){
            if(times[i]<minTime) {
                minTime = times[i];
                fastestRace=raceIDs[i];
            }
        }
        return fastestRace;
    }
}
