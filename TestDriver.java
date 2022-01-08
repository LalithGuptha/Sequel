import Simu.Team;
import project.Event;
import project.Venue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class TestDriver {
    public static void main(String[] args) throws IOException {
        Event e1;
        Venue chennai, mumbai,bengaluru, hyderabad, jaipur, kolkata, chandigarh, delhi;
        Team csk, mi, rcb, srh, rr, kkr, kxip, dd;
        /*String d1, d2, ;
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
*/

        Scanner s1= new Scanner(new File("ExcelFiles//Venue.csv"));
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
    }
}

