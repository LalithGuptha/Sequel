import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) throws IOException {
        String d1, d2;
        LocalDate start, end;
        Scanner s = new Scanner(new File("D:\\Semester3\\OOPS\\codes\\final lab\\src\\dates.txt"));
        d1 = s.nextLine();
        d2 = s.nextLine();
        try {
            start = LocalDate.parse(d1);
            end = LocalDate.parse(d2);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(MessageFormat.format("Exception arrised {0}", e));
        }
        
    }
}

