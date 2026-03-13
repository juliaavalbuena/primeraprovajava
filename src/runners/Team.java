package runners;

public class Team {
    private String name;
    private Runner[]Runners;
    private int numRunners;
    private boolean international;

    public Team(String name, boolean international) {
        this.name = name;
        this.Runners = new Runner[5];
        this.international = international;
        this.numRunners=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Runner[] getRunners() {
        return Runners;
    }

    public void setRunners(Runner[] Runners) {
        this.Runners = Runners;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public void addRunner(Runner r){
        if (numRunners<5){
            Runners[numRunners]=r;
            numRunners++;
        }
        else{
            System.out.println("Màxim de corredors per equip sobrepassat.");
        }
    }
    public float averageTimes(){
       if(numRunners!=0){
           float tempsMig = 0;
           for (int i = 0; i < numRunners; i++) {
               Runner r = this.Runners[i];
               tempsMig += r.averageTimes();
           }
           return tempsMig / numRunners;
       }
       else{return 0;}
    }
    public boolean areAllProfessionals(){
        for (int i=0; i<numRunners;i++){
            Runner r = Runners[i];
            if (!r.isProfessional()){
                return false;
            }
        }
        return true;
    }
    public int getNumProfessionals(){
        int professionalsEquip=0;
        for (int i=0; i<numRunners;i++){
            Runner r = Runners[i];
            if (r.isProfessional()){
                professionalsEquip++;
            }
        }
        return professionalsEquip;
    }
}
