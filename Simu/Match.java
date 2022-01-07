package Simu;
import project.*;

import java.util.ArrayList;
import java.util.Date;

public class Match {

		private int matchNumber;
		private Date date;
		private ArrayList<Team> teams;
		private Venue venue;



		public Match(int matchNumber, Date date, ArrayList<Team> teams, Venue venue) {
			super();
			this.matchNumber = matchNumber;
			this.date = date;
			this.teams = teams;
			this.venue = venue;
		}



		public int getMatchNumber() {
			return matchNumber;
		}



		public void setMatchNumber(int matchNumber) {
			this.matchNumber = matchNumber;
		}



		public Date getDate() {
			return date;
		}



		public void setDate(Date date) {
			this.date = date;
		}



		public ArrayList<Team> getTeams() {
			return teams;
		}



		public void setTeams(ArrayList<Team> teams) {
			this.teams = teams;
		}



		public Venue getVenue() {
			return venue;
		}



		public void setVenue(Venue venue) {
			this.venue = venue;
		}
		
		// playmatch(); - func for renga
		// sendmail()
		
		
	}

