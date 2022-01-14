package Simu;

import Players.Batsman;
import Players.Bowler;

import java.io.FileWriter;
import java.io.IOException;
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

    public Simulation(Team t1, Team t2) throws IOException {
        this.t1 = t1;
        this.t2 = t2;
        this.score.add(0, (short) 0);
        this.score.add(1, (short) 0);
        this.wickets.add(0, (short) 0);
        this.wickets.add(1, (short) 0);
        this.ballsbowled.add(0, (short) 0);
        this.ballsbowled.add(1, (short) 0);
    }

    public Simulation(Match match) throws IOException {
        this.t1 = match.getTeams().get(0);
        System.out.println(this.t1);
        this.t2 = match.getTeams().get(1);
        this.score.add(0, (short) 0);
        this.score.add(1, (short) 0);
        this.wickets.add(0, (short) 0);
        this.wickets.add(1, (short) 0);
        this.ballsbowled.add(0, (short) 0);
        this.ballsbowled.add(1, (short) 0);
    }


    public void setTeam1batsman() {
        int i = 0, count =0;
        while (i < t1.getPlayers().size() && count<6) {
            if (t1.getPlayers().get(i).getRole().equals("Batsmen") || t1.getPlayers().get(i).getRole().equals("Captain")) {
                team1batsman.add(new Batsman(t1.getPlayers().get(i)));
                count++;
                i++;
            } else {
                i++;
            }
        }
    }

    public void setTeam2batsman() {
        int i = 0, count =0;
        while (i < t2.getPlayers().size() && count<6) {
            if (t2.getPlayers().get(i).getRole().equals("Batsmen") || t2.getPlayers().get(i).getRole().equals("Captain")) {
                team2batsman.add(new Batsman(t2.getPlayers().get(i)));
                count++;
                i++;
            } else {
                i++;
            }
        }
    }

    public void setTeam1bowler() {
        int i = 0, count =0;
        while (i < t1.getPlayers().size() && count<5) {
            if (t1.getPlayers().get(i).getRole().equals("Bowler") || t1.getPlayers().get(i).getRole().equals("All-Rounder")) {
                team1bowler.add(new Bowler(t1.getPlayers().get(i)));
                count++;
                i++;
            } else {
                i++;
            }
        }
    }

    public void setTeam2bowler() {
        int i = 0, count =0;
        while (i < t2.getPlayers().size() && count<5) {
            if (t2.getPlayers().get(i).getRole().equals("Bowler") || t2.getPlayers().get(i).getRole().equals("All-Rounder")) {
                team2bowler.add(new Bowler(t2.getPlayers().get(i)));
                count++;
                i++;
            } else {
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

    public List<Bowler> getTeam1bowler() {
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

    public void setTeam1Score(short a) {
        score.set(0, (short) (getTeam1Score() + a));
    }

    public void setTeam2Score(short a) {
        score.set(1, (short) (getTeam2Score() + a));
    }

    public short getTeam1Wickets() {
        return wickets.get(0);
    }

    public short getTeam2Wickets() {
        return wickets.get(1);
    }

    public void setTeam1Wickets(short a) {
        score.set(0, (short) (getTeam1Wickets() + a));
    }

    public void setTeam2Wickets(short a) {
        score.set(1, (short) (getTeam2Wickets() + a));
    }

    public int bat() {
        return r.nextInt(7);
    }

    public int bowl() {
        return r.nextInt(7);
    }

    public void write(String s) {
        try {
            String filename = new String("Excel\\"+t1.getTeamName()+t2.getTeamName());
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.append(s);
            fileWriter.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void play() throws IOException {
        Toss toss = new Toss(t1, t2);
        Team winning = toss.coinFlip();
        System.out.println(winning.getTeamName()+" "+toss.getChoice());
        if(winning.equals(t1)){
            if(toss.getChoice().equals("Batting")){
                setTeam1batsman();
                setTeam1bowler();
                setTeam2bowler();
                while(ballsbowled.get(1)<120 && wickets.get(0)<10){
                    int a = bat();
                    int b = bowl();
                    if(a==b){
                        if((ballsbowled.get(1)<6)||(ballsbowled.get(1)<=30&&ballsbowled.get(1)>=35)||(ballsbowled.get(1)<=60&&ballsbowled.get(1)>=65)||(ballsbowled.get(1)<=90&&ballsbowled.get(1)>=95)){
                            team2bowler.get(0).setWicketstaken (team2bowler.get(0).getWicketstaken()+1);
                            if(!team1batsman.isEmpty()){
                                team1batsman.remove();
                            }
                        }
                        else if(((ballsbowled.get(1) <= 6) && (ballsbowled.get(1) >= 11)) || ((ballsbowled.get(1) <= 36) && (ballsbowled.get(1) >= 41)) || ((ballsbowled.get(1) <= 66) && (ballsbowled.get(1) >= 71)) || ((ballsbowled.get(1) <= 96) && (ballsbowled.get(1) >= 101)))
                        {

                            team2bowler.get(1).setWicketstaken (team2bowler.get(1).getWicketstaken()+1);
                            if(!team1batsman.isEmpty()){
                                team1batsman.remove();
                            }

                        }
                        else if((ballsbowled.get(1)<=12&&ballsbowled.get(1)>=17)||(ballsbowled.get(1)<=42&&ballsbowled.get(1)>=47)||(ballsbowled.get(1)<=72&&ballsbowled.get(1)>=77)||(ballsbowled.get(1)<=102&&ballsbowled.get(1)>=107)){

                            team2bowler.get(2).setWicketstaken (team2bowler.get(2).getWicketstaken()+1);
                            if(!team1batsman.isEmpty()){
                                team1batsman.remove();
                            }

                        }

                        else if((ballsbowled.get(1)<=18&&ballsbowled.get(1)>=23)||(ballsbowled.get(1)<=48&&ballsbowled.get(1)>=53)||(ballsbowled.get(1)<=78&&ballsbowled.get(1)>=83)||(ballsbowled.get(1)<=108&&ballsbowled.get(1)>=113)){

                            team2bowler.get(3).setWicketstaken (team2bowler.get(3).getWicketstaken()+1);
                            if(!team1batsman.isEmpty()){
                                team1batsman.remove();
                            }
                        }

                        else if((ballsbowled.get(1)<=24&&ballsbowled.get(1)>=29)||(ballsbowled.get(1)<=54&&ballsbowled.get(1)>=59)||(ballsbowled.get(1)<=84&&ballsbowled.get(1)>=89)||(ballsbowled.get(1)<=114&&ballsbowled.get(1)>=119)) {

                            team2bowler.get(4).setWicketstaken(team2bowler.get(4).getWicketstaken() + 1);
                            if (!team1batsman.isEmpty()) {
                                team1batsman.remove();
                            }
                        }
                        wickets.set(0, (short) (wickets.get(0)+1));
                    }
                    else if(a!=b){
                        score.add(0, (short) (score.get(0)+a));
                        if (!team1batsman.isEmpty())
                            team1batsman.peek().setRunsscored(team1batsman.peek().getRunsscored()+a);
                        if(a==6){
                            if (!team1batsman.isEmpty())
                                team1batsman.peek().setNoof6(team1batsman.peek().getNoof6()+1);
                        }
                        else if(a==4){
                            if (!team1batsman.isEmpty())
                                team1batsman.peek().setNoof4(team1batsman.peek().getNoof4()+1);

                        }
                        if((ballsbowled.get(1)<6)||(ballsbowled.get(1)<=30&&ballsbowled.get(1)>=35)||(ballsbowled.get(1)<=60&&ballsbowled.get(1)>=65)||(ballsbowled.get(1)<=90&&ballsbowled.get(1)>=95)){
                            team2bowler.get(0).setRunsconceded(team1bowler.get(0).getRunsconceded()+a);
                        }
                        else if(((ballsbowled.get(1) <= 6) && (ballsbowled.get(1) >= 11)) || ((ballsbowled.get(1) <= 36) && (ballsbowled.get(1) >= 41)) || ((ballsbowled.get(1) <= 66) && (ballsbowled.get(1) >= 71)) || ((ballsbowled.get(1) <= 96) && (ballsbowled.get(1) >= 101)))
                        {
                            team2bowler.get(1).setRunsconceded(team1bowler.get(1).getRunsconceded()+a);
                        }


                        else if((ballsbowled.get(1)<=12&&ballsbowled.get(1)>=17)||(ballsbowled.get(1)<=42&&ballsbowled.get(1)>=47)||(ballsbowled.get(1)<=72&&ballsbowled.get(1)>=77)||(ballsbowled.get(1)<=102&&ballsbowled.get(1)>=107)){

                               team2bowler.get(2).setRunsconceded(team1bowler.get(2).getRunsconceded()+a);
                        }

                        else if((ballsbowled.get(1)<=18&&ballsbowled.get(1)>=23)||(ballsbowled.get(1)<=48&&ballsbowled.get(1)>=53)||(ballsbowled.get(1)<=78&&ballsbowled.get(1)>=83)||(ballsbowled.get(1)<=108&&ballsbowled.get(1)>=113)){

                            team2bowler.get(3).setRunsconceded(team1bowler.get(3).getRunsconceded()+a);
                        }

                        else if((ballsbowled.get(1)<=24&&ballsbowled.get(1)>=29)||(ballsbowled.get(1)<=54&&ballsbowled.get(1)>=59)||(ballsbowled.get(1)<=84&&ballsbowled.get(1)>=89)||(ballsbowled.get(1)<=114&&ballsbowled.get(1)>=119)){

                            team2bowler.get(4).setRunsconceded(team1bowler.get(4).getRunsconceded()+a);
                        }

                    }
                    ballsbowled.set(1, (short) (ballsbowled.get(1)+1));

                }
                System.out.println("Team1 score is "+ getTeam1Score());
            }
            if(toss.getChoice().equals("Bowling")){


            }
        }
        }
    }

