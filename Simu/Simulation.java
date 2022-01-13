package Simu;

import Players.Batsman;
import Players.Bowler;

import java.util.*;

public class Simulation {
    private Team t1, t2;
    private Queue<Batsman> team1batsman = new LinkedList<>();
    private Queue<Batsman> team2batsman = new LinkedList<>();
    private List<Bowler> team1bowler = new ArrayList<>();
    private List<Bowler> team2bowler = new ArrayList<>();
    private ArrayList<Short> score = new ArrayList<>();
    private ArrayList<Short> wickets = new ArrayList<>();
    private ArrayList<Short> ballsbowled = new ArrayList<>();

    Random r = new Random();

    public Simulation(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
        this.score.add(0,(short)0);
        this.score.add(1,(short)0);
        this.wickets.add(0, (short) 0);
        this.wickets.add(1, (short) 0);
        this.ballsbowled.add(0, (short) 0);
        this.ballsbowled.add(1, (short) 0);
        setTeam1batsman();
        setTeam1bowler();
        setTeam2batsman();
        //setTeam2bowler();
    }
    public Simulation(Match match){
        this.t1 = match.getTeams().get(0);
        this.t2 = match.getTeams().get(1);
        this.score.add(0, (short) 0);
        this.score.add(1, (short) 0);
        this.wickets.add(0, (short) 0);
        this.wickets.add(1, (short) 0);
        this.ballsbowled.add(0, (short) 0);
        this.ballsbowled.add(1, (short) 0);
        setTeam1batsman();
        setTeam1bowler();
        setTeam2batsman();
        //setTeam2bowler();
    }


    public void setTeam1batsman() {
        int i=0;
        while(i<t1.getPlayers().size()){
            if(t1.getPlayers().get(i).getRole().equals("Batsmen")||t1.getPlayers().get(i).getRole().equals("Captain")){
                team1batsman.add(new Batsman(t1.getPlayers().get(i)));
                i++;
            }
            else{
                i++;
            }
        }
    }
    public void setTeam2batsman() {
        int i=0;
        while(i<t2.getPlayers().size()){
            if(t2.getPlayers().get(i).getRole().equals("Batsmen")||t2.getPlayers().get(i).getRole().equals("Captain")){
                team2batsman.add(new Batsman(t2.getPlayers().get(i)));
                i++;
            }
            else{
                i++;
            }
        }
    }

    public void setTeam1bowler() {
        int i=0;
        while(i<t1.getPlayers().size()){
            if(t1.getPlayers().get(i).getRole().equals("Bowler")||t1.getPlayers().get(i).getRole().equals("All-Rounder")){
                team1bowler.add(new Bowler(t1.getPlayers().get(i)));

                i++;
            }
            else{
                i++;
            }
        }
    }

    public void setTeam2bowler() {
        int i=0;
        while(i<t2.getPlayers().size()){
            if(t2.getPlayers().get(i).getRole().equals("Bowler")||t2.getPlayers().get(i).getRole().equals("All-Rounder")){
                team2bowler.add(new Bowler(t2.getPlayers().get(i)));
                i++;
            }
            else{
                i++;
            }
        }
    }


    public Team getT1() {
        return t1;
    }

    public Team getT2() {
        return t2;
    }

    public Queue<Batsman> getTeam1batsman() {
        return team1batsman;
    }

    public Queue<Batsman> getTeam2batsman() {
        return team2batsman;
    }

    public List <Bowler> getTeam1bowler() {
        return team1bowler;
    }

    public List<Bowler> getTeam2bowler() {
        return team2bowler;
    }

    public ArrayList<Short> getScore() {
        return score;
    }

    public ArrayList<Short> getWickets() {
        return wickets;
    }

    public ArrayList<Short> getBallsbowled() {
        return ballsbowled;
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

    public short getTeam1Wickets() {
        return wickets.get(0);
    }

    public short getTeam2Wickets() {
        return wickets.get(1);
    }

    public void setTeam1Wickets(short a){
        score.set(0, (short) (getTeam1Wickets()+a));
    }

    public void setTeam2Wickets(short a){
        score.set(1, (short) (getTeam2Wickets()+a));
    }
    public int bat(){
        return r.nextInt(7);
    }
    public int bowl(){
       return  r.nextInt(7);
    }
    public void write(){

    }
    public void play() {
        Toss toss = new Toss(t1, t2);
        Team winning = toss.coinFlip();
        if (winning == t1) {
            if(toss.getChoice().equals("Batting")){
                while(ballsbowled.get(0)<120&&wickets.get(0)<10){
                    int a = bat();
                    int b = bowl();
                    if(a==b){
                        wickets.set(0, (short) (wickets.get(0)+1));
                        team1batsman.remove();
                    }
                    else{
                        team1batsman.peek().setRunsscored(team1batsman.peek().getRunsscored()+a);
                        setTeam1Score((short)a);
                    }
                    ballsbowled.set(0, (short) (ballsbowled.get(0)+1));
                }
                System.out.println(ballsbowled.get(0)+" "+wickets.get(0)+" "+score.get(0));
                while(ballsbowled.get(1)<120&&wickets.get(1)<10&&score.get(1)<=score.get(0)){
                    int a =bat();
                    int b = bowl();
                    if(a==b){
                        wickets.set(0, (short) (wickets.get(0)+1));
                    }
                    else{
                        setTeam2Score((short)a);
                    }
                    ballsbowled.set(1, (short) (ballsbowled.get(1)+1));
                }
                System.out.println(ballsbowled.get(1)+" "+wickets.get(1)+" "+score.get(1));
            }
            else if(toss.getChoice().equals("Bowling")){
                int a = bat();
                int b = bowl();
                if(a==b){

                }
            }
        }
        else if(winning==t2){
            if(toss.getChoice().equals("Batting")){

            }
            else if(toss.getChoice().equals("Bowling")){

            }
        }
    }
}
