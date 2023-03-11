package com.bet.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bet.entities.Bet;
import com.bet.repository.BetRepository;

@Service
public class BetServiceImpl implements BetService {
	@Autowired
	private BetRepository betRepo;

	@Override
	public void savelead(Bet bet) {
		betRepo.save(bet);
	}

	@Override
	public List<Bet> getallbets() {
		List<Bet> bets = betRepo.findAll();
		return bets;
	}

	@Override
	public void deletebets(long id) {
		betRepo.deleteById(id);
	}

	@Override
	public Bet updatebets(long id) {
		Optional<Bet> findById = betRepo.findById(id);
		Bet bet = findById.get();
		return bet;

	}

	@Override
	public void saveonebet(Bet bet) {
		betRepo.save(bet);

	}

	@Override
	public List<Bet> getByGame(String game) {
		return betRepo.findByGame(game);

	}

	@Override
	public List<Bet> getByClientid(long clientid) {
		return betRepo.findByClientid(clientid);
	}

	@Override
	public List<Bet> getByDate(LocalDate date) {
		
		return betRepo.findByDate(date);
	}

}
