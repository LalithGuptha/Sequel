import Players.Player;
import Simu.Team;
import project.Event;
import project.Venue;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class TestDriver {
    public static void main(String[] args) throws IOException {

        Venue chennai, mumbai,bengaluru, hyderabad, jaipur, kolkata, chandigarh, delhi;
        Team csk, mi, rcb, srh, rr, kkr, kxip, dd;

        Scanner s1= new Scanner(new File("ExcelFiles//event.csv"));
        Event e1 = new Event(s1.nextLine(), s1.nextLine(), s1.nextLong());

        s1= new Scanner(new File("ExcelFiles//Venue.csv"));
        String[] dummy;
        dummy = (s1.nextLine()).split(",", 0);
        chennai = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        dummy = (s1.nextLine()).split(",", 0);
        mumbai = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        dummy = (s1.nextLine()).split(",", 0);
        bengaluru = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        dummy = (s1.nextLine()).split(",", 0);
        hyderabad = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        dummy = (s1.nextLine()).split(",", 0);
        jaipur = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        dummy = (s1.nextLine()).split(",", 0);
        kolkata = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        dummy = (s1.nextLine()).split(",", 0);
        chandigarh= new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        dummy = (s1.nextLine()).split(",", 0);
        delhi = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);

        s1= new Scanner(new File("ExcelFiles//team.csv"));
        csk = new Team(s1.nextLine(), chennai);
        mi = new Team(s1.nextLine(), mumbai);
        rcb = new Team(s1.nextLine(), bengaluru);
        srh = new Team(s1.nextLine(), hyderabad);
        rr = new Team(s1.nextLine(), jaipur);
        kkr = new Team(s1.nextLine(), kolkata);
        kxip = new Team(s1.nextLine(), chandigarh);
        dd = new Team(s1.nextLine(), delhi);

        s1= new Scanner(new File("ExcelFiles//player.csv"));
        ArrayList<Player> players = new ArrayList<>();
        int i=0;
        while(s1.hasNext()){
            dummy = (s1.nextLine()).split(",", 0);
            switch (dummy[2]) {
                case "Chennai Super Kings":
                    players.add(new Player(dummy[0], dummy[1], csk));
                    break;
                case "Mumbai Indians":
                    Player p = new Player(dummy[0], dummy[1], mi);
                    players.add(p);
                    break;
                case "Royal Challengers Bangalore":
                    players.add(new Player(dummy[0], dummy[1], rcb));
                    break;
                case "Sunrisers Hyderabad":
                    players.add(new Player(dummy[0], dummy[1], srh));
                    break;
                case "Rajasthan Royals":
                    players.add(new Player(dummy[0], dummy[1], rr));
                    break;
                case "Kolkata Knight Riders":
                    players.add(new Player(dummy[0], dummy[1], kkr));
                    break;
                case "Kings XI Punjab":
                    players.add(new Player(dummy[0], dummy[1], kxip));
                    break;
                case "Delhi Daredevils":
                    players.add(new Player(dummy[0], dummy[1], dd));
                    break;
            }

        }
        String d1, d2;
        LocalDate start, end;
        try{
            Scanner s = new Scanner(new File("ExcelFiles//dates.txt"));
            d1 = s.nextLine();
            d2 = s.nextLine();
            start = LocalDate.parse(d1);
            end = LocalDate.parse(d2);
            s.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(MessageFormat.format("Exception arrised {0}", e));
        }
    }
}

