package Simu;

import Players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Simulation {
    private Team t1, t2;
    private Queue<Player> team1batsman, team2batsman;
    private List<Player> team1bowler, team2bowler;
    private ArrayList<Short> score = new ArrayList<>(2);
    private ArrayList<Short> wickets = new ArrayList<>(2);
    private ArrayList<Short> ballsbowled = new ArrayList<>(2);

    public Simulation(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
        this.score.set(0, (short) 0);
        this.score.set(1, (short) 0);
        this.wickets.set(0, (short) 0);
        this.wickets.set(1, (short) 0);
        this.ballsbowled.set(0, (short) 0);
        this.ballsbowled.set(1, (short) 0);
    }

    public void setTeam1batsman() {
        int i=0;
        while ((t1.getPlayers().get(i).getRole().equals("Batsmen")||t1.getPlayers().get(i).getRole().equals("Captain"))&&i<t1.getPlayers().size()){
            team1batsman.add(t1.getPlayers().get(i));
        }
        i++;
    }
    public void setTeam1bowler() {
        int i=0;
        while ((t1.getPlayers().get(i).getRole().equals("Bowler")||t1.getPlayers().get(i).getRole().equals("All-Rounder"))&&i<t1.getPlayers().size()){
            team1bowler.add(t1.getPlayers().get(i));
        }
        i++;
    }
    public void setTeam2batsman() {
        int i=0;
        while ((t2.getPlayers().get(i).getRole().equals("Batsmen")||t2.getPlayers().get(i).getRole().equals("Captain"))&&i<t2.getPlayers().size()){
            team2batsman.add(t2.getPlayers().get(i));
        }
        i++;
    }
    public void setTeam2bowler() {
        int i=0;
        while ((t2.getPlayers().get(i).getRole().equals("Bowler")||t2.getPlayers().get(i).getRole().equals("All-Rounder"))&&i<t2.getPlayers().size()){
            team2bowler.add(t2.getPlayers().get(i));
        }
        i++;
    }


    public short getTeam1Score() {
        return score.get(0);
    }
    public short getTeam2Score() {
        return score.get(1);
    }
    public void setTeam1Score(short a){
        score.set(0, (short) (getTeam1Score()+a));
    }

    public void setTeam2Score(short a){
        score.set(1, (short) (getTeam2Score()+a));
    }
    public short getTeam1wickets() {
        return wickets.get(0);
    }
    public short getTeam2Wickets() {
        return wickets.get(1);
    }
    public void setTeam1Wickets(short a){
        score.set(0, (short) (getTeam1Score()+a));
    }

    public void setTeam2Wickets(short a){
        score.set(1, (short) (getTeam2Score()+a));
    }


}
