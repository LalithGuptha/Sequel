package Simu;

import Players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Simulation {
    Queue<Player> team1batsman, team2batsman;
    List<Player> team1bowler, team2bowler;
    ArrayList<Short> score, wickets, ballsbowled;

    public Simulation(Queue<Player> team1batsman, Queue<Player> team2batsman, List<Player> team1bowler, List<Player> team2bowler, ArrayList<Short> score, ArrayList<Short> wickets, ArrayList<Short> ballsbowled) {
        this.team1batsman = team1batsman;
        this.team2batsman = team2batsman;
        this.team1bowler = team1bowler;
        this.team2bowler = team2bowler;
        this.score = score;
        this.wickets = wickets;
        this.ballsbowled = ballsbowled;
    }

    public Queue<Player> getTeam1batsman() {
        return team1batsman;
    }

    public void setTeam1batsman(Queue<Player> team1batsman) {
        this.team1batsman = team1batsman;
    }

    public Queue<Player> getTeam2batsman() {
        return team2batsman;
    }

    public void setTeam2batsman(Queue<Player> team2batsman) {
        this.team2batsman = team2batsman;
    }

    public List<Player> getTeam1bowler() {
        return team1bowler;
    }

    public void setTeam1bowler(List<Player> team1bowler) {
        this.team1bowler = team1bowler;
    }

    public List<Player> getTeam2bowler() {
        return team2bowler;
    }

    public void setTeam2bowler(List<Player> team2bowler) {
        this.team2bowler = team2bowler;
    }

    public ArrayList<Short> getScore() {
        return score;
    }

    public void setScore(ArrayList<Short> score) {
        this.score = score;
    }

    public ArrayList<Short> getWickets() {
        return wickets;
    }

    public void setWickets(ArrayList<Short> wickets) {
        this.wickets = wickets;
    }

    public ArrayList<Short> getBallsbowled() {
        return ballsbowled;
    }

    public void setBallsbowled(ArrayList<Short> ballsbowled) {
        this.ballsbowled = ballsbowled;
    }
}
