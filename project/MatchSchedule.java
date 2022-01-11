package project;

import Simu.Match;
import Simu.Team;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;


public class MatchSchedule implements sendEmail{

	private int noOfTeams;
	private LocalDate startdate;
	private LocalDate enddate;
	private ArrayList<Team> teams;
	private ArrayList<Venue> venues;
	private Queue<Match> schedule = new LinkedList<>();


	public MatchSchedule(int noOfTeams, LocalDate startdate, LocalDate enddate, ArrayList<Team> teams, ArrayList<Venue> venues) {
		this.noOfTeams = noOfTeams;
		this.startdate = startdate;
		this.enddate = enddate;
		this.teams = teams;
		this.venues = venues;
	}

	public int getNoOfTeams() {

		return noOfTeams;
	}


	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}


	public LocalDate getStartdate() {
		return startdate;
	}


	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}


	public LocalDate getEnddate() {
		return enddate;
	}


	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}


	public ArrayList<Team> getTeams() {
		return teams;
	}


	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}


	public Queue<Match> getSchedule() {
		return schedule;
	}


	public void setSchedule(Queue<Match> schedule) {
		this.schedule = schedule;
	}

	public ArrayList<Venue> getVenues() {
		return venues;
	}

	public void setVenues(ArrayList<Venue> venues) {
		this.venues = venues;
	}


	public void schedule() throws FileNotFoundException {
		// matches = new Match();
		int matchCount = 1;
		long add = 0;


		//i tried
		int[][] arr = {{0, 1, 2, 3}, {4, 5, 6, 7}};
		String sch = new String();
		int t1, t2;


		//m1.setMatchNumber(matchCount);
		//m1.setDate(startdate);
		//m1.setTeamsofmatch(this.teams.get(arr[0][0]),this.teams.get(arr[1][0]));
		//m1.setVenue(venues.get(arr[0][1]));

		//schedule.add(m1);


		for (int loop = 0; loop < 2; loop++) {
			Random random = new Random();
			if (loop == 1) {
				int x = random.nextInt(5);
				Collections.swap(teams, 0, x);
			}

			for (int i = 0; i < 4; i++) {
				if (loop % 2 == 0)
					schedule.add(new Match(matchCount, this.startdate.plusDays(add), this.teams.get(arr[0][i]), this.teams.get(arr[1][i]), this.venues.get(arr[0][i])));
				else {
					schedule.add(new Match(matchCount, this.startdate.plusDays(add), this.teams.get(arr[0][i]), this.teams.get(arr[1][i]), this.venues.get(arr[1][i])));
				}

				matchCount++;
				add++;
			}
			//sch = sch + "..";
			for (int i = 0; i < 6; i++) {
				t1 = arr[0][3];
				t2 = arr[1][0];
				for (int j = 3; j > 1; j--) {
					arr[0][j] = arr[0][j - 1];

				}
				for (int n = 0; n < 3; n++) {
					arr[1][n] = arr[1][n + 1];
				}
				arr[1][3] = t1;
				arr[0][1] = t2;
				for (int k = 0; k < 4; k++) {
					//sch = sch + "(" + arr[0][k] + "," + arr[1][k] + ")";
					if (loop % 2 == 0)
						schedule.add(new Match(matchCount, this.startdate.plusDays(add), this.teams.get(arr[0][k]), this.teams.get(arr[1][k]), this.venues.get(arr[0][k])));
					else
						schedule.add(new Match(matchCount, this.startdate.plusDays(add), this.teams.get(arr[0][k]), this.teams.get(arr[1][k]), this.venues.get(arr[1][k])));

					matchCount++;
					add++;
				}


			}
		}

		for (int i = 0; i < 4; i++) {
			schedule.add(new Match(matchCount, this.startdate.plusDays(add), null, null, null));
			matchCount++;
			add++;
		}




	}
	//Files
	final String COMMA_DELIMITER = ",";
	final String NEWLINE = "\n";
	final String FILE_HEADER = "MatchNumber,Date,Team1,Team2,Venue";
	FileWriter filewriter = null;
	public void write(){

		try{
			filewriter = new FileWriter("trial.txt");
			filewriter.append(FILE_HEADER.toString());
			filewriter.append(NEWLINE);
			ListIterator new_list = (ListIterator) schedule.iterator();
			while(new_list.hasNext()){
				filewriter.append(String.valueOf(new_list.next()));
				filewriter.append(NEWLINE);
			}
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	public void sendMail(){
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true"); //TLS
		Session session = Session.getInstance(prop,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});
		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("prrelationsequel@gmail.com"));
			message.setRecipients(
					Message.RecipientType.TO,
					InternetAddress.parse("rvpspran@gmail.com, bmeghadharsan@gmail.com")
			);
			message.setSubject("Match Schedule");
			BodyPart bp = new MimeBodyPart();
			BodyPart bp1 = new MimeBodyPart();
			bp1.setText("Checking email");
			String filename = "C:\\Users\\Rengaraj\\IdeaProjects\\Sequel\\trial.txt";
			DataSource src = new FileDataSource(filename);
			bp.setDataHandler(new DataHandler(src));
			bp.setFileName(filename);
			Multipart mp = new MimeMultipart();
			mp.addBodyPart(bp);
			mp.addBodyPart(bp1);
			message.setContent(mp);
			Transport.send(message);
			System.out.println("Done");

		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}


}





	// reschedule() - func
	// reschedule(,) - func
	// sendMail();
	// organiseeliminators() - ask renga

	
	


	
	
	
	


