package com.company;



public interface LeagueManager {
	void addFootballClub(SportsClub sportsClub);
	void delFootballClub();
	void DisplayClubDetails(String name);
	void displayPremierLeagueTable();
	void addPlayMatch(String firstTeam,String seccondTeam, int score1,int score2, String date);
	void saveData() ;
	void loadData() ;


}
