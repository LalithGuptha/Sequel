import project.Event;
import project.Venue;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Scanner;
public class TestDriver {
    public static void main(String[] args) throws IOException {
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

        String eventname, manager;
        long budget;
        try {
            Scanner s1 = new Scanner(new File("ExcelFiles//dates.txt"));
            eventname = s1.nextLine();
            manager = s1.nextLine();
            budget = s1.nextLong();
            Event e1 = new Event(eventname, manager, budget);
            s1.close();
        }catch (Exception e){
            System.out.println(MessageFormat.format("Exception arrised {0}", e));
        }
        try{
            String i;
            Scanner s1= new Scanner(new File("ExcelFiles//Venue.csv"));
            String[] dummy = new String[3];
            dummy = (s1.nextLine()).split(",", 0);
            Venue chennai = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
            dummy = (s1.nextLine()).split(",", 0);
            Venue mumbai = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
            dummy = (s1.nextLine()).split(",", 0);
            Venue hyderabad = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
            dummy = (s1.nextLine()).split(",", 0);
            Venue jaipur = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
            dummy = (s1.nextLine()).split(",", 0);
            Venue kolkatta = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
            dummy = (s1.nextLine()).split(",", 0);
            Venue  chandigarh = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
            dummy = (s1.nextLine()).split(",", 0);
            Venue Delhi = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        }catch (Exception e){
            System.out.println(MessageFormat.format("Exception arrised {0}", e));
        }

    }
}

