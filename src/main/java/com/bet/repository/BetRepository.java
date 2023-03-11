package com.bet.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bet.entities.Bet;

public interface BetRepository extends JpaRepository<Bet, Long> {
	
	 List<Bet> findByGame(String game);
	
	 List<Bet> findByClientid(long clientid);
	 
	 List<Bet> findByDate(LocalDate date);

}
