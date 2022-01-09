package Simu;

import project.Venue;

import java.time.LocalDate;
import java.util.ArrayList;

public class Match {

		private int matchNumber;
		private LocalDate date;
		private ArrayList<Team> teams;
		private Venue venue;



		public Match(int matchNumber, LocalDate date, ArrayList<Team> teams, Venue venue) {
			super();
			this.matchNumber = matchNumber;
			this.date = date;
			this.teams = teams;
			this.venue = venue;
		}

		public Match()
		{

		}


		public int getMatchNumber() {
			return matchNumber;
		}



		public void setMatchNumber(int matchNumber) {
			this.matchNumber = matchNumber;
		}



		public LocalDate getDate() {
			return date;
		}



		public void setDate(LocalDate date) {
			this.date = date;
		}



		public ArrayList<Team> getTeams() {
			return teams;
		}



		public void setTeams(Team a, Team b) {
			this.teams.set(0,a);
			this.teams.set(1,b);
		}



		public Venue getVenue() {
			return venue;
		}



		public void setVenue(Venue venue) {
			this.venue = venue;
		}

	@Override
	public String toString() {
		return "Match{" +
				"matchNumber=" + matchNumber +
				", date=" + date +
				", teams=" + teams +
				", venue=" + venue +
				'}';
	}

	// playmatch(); - func for renga
		// sendmail()
		
		
	}

