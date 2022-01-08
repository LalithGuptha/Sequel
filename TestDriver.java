import project.Event;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        }catch (Exception e){
            System.out.println(MessageFormat.format("Exception arrised {0}", e));
        }
        String venuename, location;
        long capacity;
        try{
            BufferedReader f = new BufferedReader(new FileReader("D:\\Semester3\\OOPS\\codes\\PeriodicTable\\src\\codes\\periodensystem.csv"));

        }catch (Exception e){

        }

    }
}

