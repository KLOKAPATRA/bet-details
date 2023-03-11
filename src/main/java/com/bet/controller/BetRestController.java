package com.bet.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bet.entities.Bet;
import com.bet.repository.BetRepository;
import com.bet.services.BetService;

@RestController
@RequestMapping("/api/bets")
public class BetRestController {

	@Autowired
	private BetRepository betRepo;

	@Autowired
	private BetService betservices;

	@GetMapping("/get")
	public List<Bet> getallbets() {
		List<Bet> bets = betRepo.findAll();
		return bets;
	}



	@RequestMapping("/find/{id}")
	public Bet getonebet(@PathVariable("id") long id) {
		Optional<Bet> findbyid = betRepo.findById(id);
		Bet bet = findbyid.get();
		return bet;
	}

	@GetMapping("/game/{game}")
	public ResponseEntity<List<Bet>> getByGame(@PathVariable String game) {
		List<Bet> byGame = betservices.getByGame(game);
		return new ResponseEntity<>(byGame, HttpStatus.OK);
	}

	@GetMapping("/client/{clientid}")
	public ResponseEntity<List<Bet>> getByClientid(@PathVariable long clientid) {
		List<Bet> byClientid = betservices.getByClientid(clientid);
		return new ResponseEntity<>(byClientid, HttpStatus.OK);
	}
	
	@GetMapping("/date/{date}")
	public ResponseEntity<List<Bet>> getByClientid(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date) {
		List<Bet> response = betservices.getByDate(date);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	

}
