package Simu;

import java.util.ArrayList;

public class PointsTable {
    private ArrayList<Team> team;
    private ArrayList<Integer> position, played, won, lost, netRunRate;

    public PointsTable(ArrayList<Team> team, ArrayList<Integer> position, ArrayList<Integer> played, ArrayList<Integer> won, ArrayList<Integer> lost, ArrayList<Integer> netRunRate) {
        this.team = team;
        this.position = position;
        this.played = played;
        this.won = won;
        this.lost = lost;
        this.netRunRate = netRunRate;
    }

    public ArrayList<Team> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Team> team) {
        this.team = team;
    }

    public ArrayList<Integer> getPosition() {
        return position;
    }

    public void setPosition(ArrayList<Integer> position) {
        this.position = position;
    }

    public ArrayList<Integer> getPlayed() {
        return played;
    }

    public void setPlayed(ArrayList<Integer> played) {
        this.played = played;
    }

    public ArrayList<Integer> getNetRunRate() {
        return netRunRate;
    }

    public void setNetRunRate(ArrayList<Integer> netRunRate) {
        this.netRunRate = netRunRate;
    }
}
