package runners;

public class RunnersMain {
    public static Team[]allTeams;
    public static Race[] allRaces;
    public static Runner[]allRunners;

    public static void main(String[] args){
        allTeams = new Team [5];
        allRaces = new Race [10];
        allRunners = new Runner [100];
        allRunners[0] = new Runner("Paco");
        allRunners[1] = new Runner("Bel", "Equip B", true);
        allRunners[2] = new Runner("Toni", "Equip B", true);
        allRunners[3] = new Runner("Pedro", "Equip A", false);
        allRunners[4] = new Runner("Maria");

        allRunners[0].setTeam("Equip C");
        allRunners[0].setProfessional(false);
        allRunners[4].setTeam("Equip C");
        allRunners[4].setProfessional(true);

        allRunners[0].addRace("Palma");
        allRunners[0].addTime(12.5f);
        allRunners[1].addRace("Palma");
        allRunners[1].addTime(10f);
        allRunners[2].addRace("Palma");
        allRunners[2].addTime(13.2f);
        allRunners[3].addRace("Palma");
        allRunners[3].addTime(9.9f);
        allRunners[4].addRace("Palma");
        allRunners[4].addTime(10.1f);

        allTeams[0] = new Team("Equip A", true);
        allTeams[1] = new Team("Equip B", false);
        allTeams[2] = new Team("Equip C", false);

        allTeams[2].addRunner(allRunners[0]);
        allTeams[1].addRunner(allRunners[1]);
        allTeams[1].addRunner(allRunners[2]);
        allTeams[0].addRunner(allRunners[3]);
        allTeams[2].addRunner(allRunners[4]);

        allRaces[0] = new Race("Inca", false, 13);
        allRaces[1] = new Race("MariaDeLaSalut", false, 7);
        allRaces[2] = new Race("Llubí", false, 19);

        allRaces[1].addRunner(allRunners[0]);
        allRaces[1].addTimeToRunner(allRunners[0], 12.5f);
        allRaces[2].addRunner(allRunners[1]);
        allRaces[2].addTimeToRunner(allRunners[1], 7.1f);
        allRaces[1].addRunner(allRunners[4]);
        allRaces[1].addTimeToRunner(allRunners[4], 6.5f);


    }

    public String bestProfessionalRunnerOfTeam(Team t){
        float minTime= Float.MAX_VALUE;
        String name =null;
        for (int i=0; i<t.getNumRunners(); i++){
            Runner r = t.getRunners()[i];
            if(r.isProfessional()){
                float time = r.bestTime();
                if(time<minTime){
                    minTime=time;
                    name=r.getName();
                }
            }
        }
        return name;
    }

    public String bestTeam(){
        Team TheTeam=null;
        float temps= allTeams[1].averageTimes();
        for (int i=1; i< allTeams.length; i++){
            Team t = allTeams[i];
            if(t.averageTimes()<temps){
                TheTeam= t;
            }
        }
        return TheTeam.getName();
    }

    public void printClassifiedRunners(Race r, String nameTeam){
        System.out.printf("Corredors classificats a la carrera %s: \n",r.getRaceID());
        for (int i =0; i< r.getNumRunners();i++){
            Runner runner = r.getRunners()[i];
            float time = r.getTimes()[i];
            if(time<r.getClassificationTime()&& runner.getTeam().equals(nameTeam)){
                System.out.printf("\t%s amb temps %.2f.\n",runner.getName(), time);
            }
        }
    }

    public boolean hasImproved(Runner r,Race[] races){
       float tempsAnterior = Float.MAX_VALUE;
        for(int i=0; i<races.length;i++){
            for (int nr=0; nr<races[i].getNumRunners();nr++){
                if(races[i].getRunners()[nr].equals(r)){
                    float temps = races[i].getTimes()[nr];
                    if(temps>tempsAnterior){
                        return false;
                    }
                    else{
                        tempsAnterior=temps;
                    }
                }
            }
        }
        return true;
    }

    public boolean everClassified(Runner r,Race[] races){
        for(int i=0; i<races.length;i++){
            Race race = races[i];
            for (int nr=0; nr<races[i].getNumRunners();nr++){
                Runner rr = race.getRunners()[nr];
                float times = race.getTimes()[nr];
                if(r.equals(rr) && times> race.getClassificationTime()){
                    return false;
                }
            }
        }
        return true;
    }

    public float averageNumRunners(Race[] races){
       float avr=0;
        for (int i =0; i<races.length; i++){
            avr+=races[i].getNumRunners();
        }
        return avr/races.length;
    }
    public float averageTimesRaces(Race[] races){
        float avt=0;
        for (int i =0; i<races.length; i++){
            avt+=races[i].averageTimes();
        }
        return avt/races.length;
    }
    public String[] racesWhereWinnerIsNotProfessional(Race[] races) {
        String[] racesIDs = new String[races.length];
        int numWinners=0;
        for (int i = 0; i < races.length; i++) {
            String winnerName = races[i].bestRunner();
            for (int j = 0; j < races[i].getNumRunners(); j++) {
                Runner r = races[i].getRunners()[j];
                if (r.getName().equals(winnerName)) {
                    racesIDs[numWinners] = races[i].getRaceID();
                    numWinners++;
                }
                break;
            }
        }
        return racesIDs;
    }

}
