import OptimalityCalculator.Equipment;
import OptimalityCalculator.PRRelation;
import OptimalityCalculator.Sponsor;
import PitchAnalysis.Pace;
import PitchAnalysis.Pitch;
import PitchAnalysis.Rebound;
import Players.Player;
import Simu.Simulation;
import Simu.Team;
import project.Event;
import project.MatchSchedule;
import project.Venue;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class TestDriver {
    public static void main(String[] args) throws IOException {

        Venue chennai, mumbai, bengaluru, hyderabad, jaipur, kolkata, chandigarh, delhi;
        Team csk, mi, rcb, srh, rr, kkr, kxip, dd;

        Scanner s1 = new Scanner(new File("ExcelFiles//event.txt"));
        Event e1 = new Event(s1.nextLine(), s1.nextLine(), s1.nextLong());

        s1 = new Scanner(new File("ExcelFiles//Venue.csv"));
        String[] dummy;
        ArrayList<Venue> venues = new ArrayList<>();
        dummy = (s1.nextLine()).split(",", 0);
        chennai = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(chennai);
        dummy = (s1.nextLine()).split(",", 0);
        mumbai = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(mumbai);
        dummy = (s1.nextLine()).split(",", 0);
        bengaluru = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(bengaluru);
        dummy = (s1.nextLine()).split(",", 0);
        hyderabad = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(hyderabad);
        dummy = (s1.nextLine()).split(",", 0);
        jaipur = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(jaipur);
        dummy = (s1.nextLine()).split(",", 0);
        kolkata = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(kolkata);
        dummy = (s1.nextLine()).split(",", 0);
        chandigarh = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(chandigarh);
        dummy = (s1.nextLine()).split(",", 0);
        delhi = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(delhi);

        s1 = new Scanner(new File("ExcelFiles//team.csv"));
        csk = new Team(s1.nextLine(), chennai);
        mi = new Team(s1.nextLine(), mumbai);
        rcb = new Team(s1.nextLine(), bengaluru);
        srh = new Team(s1.nextLine(), hyderabad);
        rr = new Team(s1.nextLine(), jaipur);
        kkr = new Team(s1.nextLine(), kolkata);
        kxip = new Team(s1.nextLine(), chandigarh);
        dd = new Team(s1.nextLine(), delhi);
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(csk);
        teams.add(mi);
        teams.add(rcb);
        teams.add(srh);
        teams.add(rr);
        teams.add(kkr);
        teams.add(kxip);
        teams.add(dd);
        s1 = new Scanner(new File("ExcelFiles//player.csv"));
        ArrayList<Player> players = new ArrayList<>();
        while (s1.hasNext()) {
            dummy = (s1.nextLine()).split(",", 0);
            switch (dummy[2]) {
                case "Chennai Super Kings" -> players.add(new Player(dummy[0], dummy[1], csk));
                case "Mumbai Indians" -> players.add(new Player(dummy[0], dummy[1], mi));
                case "Royal Challengers Bangalore" -> players.add(new Player(dummy[0], dummy[1], rcb));
                case "Sunrisers Hyderabad" -> players.add(new Player(dummy[0], dummy[1], srh));
                case "Rajasthan Royals" -> players.add(new Player(dummy[0], dummy[1], rr));
                case "Kolkata Knight Riders" -> players.add(new Player(dummy[0], dummy[1], kkr));
                case "Kings XI Punjab" -> players.add(new Player(dummy[0], dummy[1], kxip));
                case "Delhi Daredevils" -> players.add(new Player(dummy[0], dummy[1], dd));
            }

        }
        for (Player player : players) {
            if (csk.equals(player.getTeamName())) {
                csk.setPlayer(player);
            }
            else if (mi.equals(player.getTeamName())) {
                mi.setPlayer(player);
            }
            else if (rcb.equals(player.getTeamName())) {
                rcb.setPlayer(player);
            }
            else if (srh.equals(player.getTeamName())) {
                srh.setPlayer(player);
            }
            else if (rr.equals(player.getTeamName())) {
                rr.setPlayer(player);
            }
            else if (kkr.equals(player.getTeamName())) {
                kkr.setPlayer(player);
            }
            else if (kxip.equals(player.getTeamName())) {
                kxip.setPlayer(player);
            }
            else if (dd.equals(player.getTeamName())) {
                dd.setPlayer(player);
            }

        }
        // File for Pitch
      ArrayList<Pitch> pitches = new ArrayList<Pitch>();
        s1 = new Scanner(new File("ExcelFiles\\pitch.csv"));

        while(s1.hasNext())
        {
            dummy = (s1.nextLine()).split(",", 0);
            pitches.add(new Pitch(Double.parseDouble(dummy[0]),dummy[1],dummy[2],Double.parseDouble(dummy[3]),Double.parseDouble(dummy[4])));
        }

        //File for Rebound
        ArrayList<Rebound> rebound = new ArrayList<Rebound>();
        s1 = new Scanner(new File("ExcelFiles\\Rebound.csv"));

        //File for Pace
        ArrayList<Pace> pace = new ArrayList<Pace>();
        s1 = new Scanner(new File("ExcelFiles\\Pace.csv"));

        while(s1.hasNext())
        {
            dummy = (s1.nextLine()).split(",", 0);
            pace.add(new Pace(Double.parseDouble(dummy[0]),Double.parseDouble(dummy[1])));
        }


        while(s1.hasNext())
        {
            dummy = (s1.nextLine()).split(",", 0);
            rebound.add(new Rebound(Double.parseDouble(dummy[0]),Double.parseDouble(dummy[1]),Double.parseDouble(dummy[2]),Double.parseDouble(dummy[3]),Double.parseDouble(dummy[4]),Double.parseDouble(dummy[5]),Double.parseDouble(dummy[6])));
        }

        //File for Equipment

        ArrayList<Equipment> eq = new ArrayList<Equipment>();
        ArrayList<Equipment> eqb = new ArrayList<Equipment>();

        s1 = new Scanner(new File("ExcelFiles\\Equipment.csv"));

        while(s1.hasNext())
        {
            dummy = (s1.nextLine()).split(",", 0);
            switch(dummy[2]) {
                case "Bat" -> eq.add(new Equipment(dummy[0], dummy[1], dummy[2], Integer.parseInt(dummy[3]), Integer.parseInt(dummy[4])));
                case "Ball" -> eqb.add(new Equipment(dummy[0], dummy[1], dummy[2], Integer.parseInt(dummy[3]), Integer.parseInt(dummy[4])));
            }
        }
        //File for Sponsor
        ArrayList<Sponsor> sp = new ArrayList<Sponsor>();
        s1 = new Scanner(new File("ExcelFiles\\sponsors.csv"));

        while(s1.hasNext())
        {
            dummy = (s1.nextLine()).split(",", 0);
            sp.add(new Sponsor(dummy[0],Double.parseDouble(dummy[1]),Integer.parseInt(dummy[2])));
        }

        //File for PR Relation
        ArrayList<PRRelation> pr = new ArrayList<PRRelation>();
        s1 = new Scanner(new File("ExcelFiles\\PRRelation.csv"));

        while(s1.hasNext())
        {
            dummy = (s1.nextLine()).split(",", 0);
            pr.add(new PRRelation(dummy[0],dummy[1],Integer.parseInt(dummy[2]),Double.parseDouble(dummy[3])));
        }






        System.out.println(pitches.get(1).toString());
        // System.out.println(pr.get(2));
        //System.out.println(pace.get(4));

        System.out.println(dd.getPlayers().get(10).getPlayerName());
        System.out.println(teams);
        String d1, d2;
        LocalDate start, end;
        s1 = new Scanner(new File("ExcelFiles//dates.txt"));

        start = LocalDate.parse(s1.nextLine());
        end = LocalDate.parse(s1.nextLine());


        MatchSchedule matchSchedule = new MatchSchedule(teams.size(), start, end, teams, venues);
        matchSchedule.schedule();
        matchSchedule.write();
        System.out.println(matchSchedule.getSchedule().size());

        Sponsor s = new Sponsor();
        s.opCalc(sp);
        Equipment e = new Equipment();
        e.opCalc(eq);
        Equipment f =new Equipment();
        f.opCalc(eqb);
        Simulation simulation;
        int i =1;

        while(!matchSchedule.getSchedule().isEmpty())
        {
            System.out.println(i++);
            simulation = new Simulation(matchSchedule.getSchedule().peek());
            Team winner  = simulation.play();
            if(!Objects.isNull(winner)){
                System.out.println(winner.getTeamName());
            }
            else if(!Objects.isNull(winner)){
                System.out.println("Match is draw");
            }
            matchSchedule.getSchedule().remove();
        }

    }
}

