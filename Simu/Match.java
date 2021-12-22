package Simu;
import project.*;

import java.util.Date;

public class Match {

		private int matchNumber;
		private Date date = new Date() ;
		public List<Team> teams = new ArrayList[2]<Team>;
		private Venue venue;



		public Match(int matchNumber, Date date, List<Team> teams, Venue venue) {
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



		public List<Team> getTeams() {
			return teams;
		}



		public void setTeams(List<Team> teams) {
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

}
