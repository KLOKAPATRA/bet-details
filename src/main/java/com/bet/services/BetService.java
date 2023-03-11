package com.bet.services;

import java.time.LocalDate;
import java.util.List;

import com.bet.entities.Bet;

public interface BetService {
	
	public void savelead(Bet bet);

	public List<Bet> getallbets();

	public void deletebets(long id);

	public Bet updatebets(long id);

	public void saveonebet(Bet bet);

	public List<Bet> getByGame(String game);
	
	public List<Bet> getByClientid(long clientid);
	
	public List<Bet> getByDate( LocalDate date);
	

	

	

	

	

	

}
