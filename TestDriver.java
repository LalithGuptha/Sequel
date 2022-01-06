import java.util.*;
import java.io.*;
import java.time.*;
public class TestDriver {
	public static void main(String args[]) throws IOException {
		String d1, d2;
		LocalDate start, end;
		Scanner s = new Scanner(new File("D:\\Semester3\\OOPS\\codes\\final lab\\src\\dates.txt"));
		d1 = s.nextLine();
		d2 = s.nextLine();
		try {
			start = LocalDate.parse(d1);
			end = LocalDate.parse(d2);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception arrised "+ e);
		}
}
	}

