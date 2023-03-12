package com.bet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bet.entities.Bet;
import com.bet.services.BetService;

@Controller
public class BetController {

	@RequestMapping("/leads")
	public String leads() {
		return "lead";
	}

	@Autowired
	private BetService betService;

	@RequestMapping("/savebets")
	public String saveLeads(@ModelAttribute("bet") Bet bet, Model model) {
		betService.savelead(bet);
		List<Bet> bets = betService.getallbets();
		model.addAttribute("bets", bets);
		return "listbets";
	}

	@RequestMapping("/listbets")
	public String listBets(Model model) {
		List<Bet> bets = betService.getallbets();
		model.addAttribute("bets", bets);
		return "listbets";
	}

	@RequestMapping("/delete")
	public String DeleteBets(@RequestParam("id") long id, Model model) {
		betService.deletebets(id);

		List<Bet> bets = betService.getallbets();
		model.addAttribute("bets", bets);
		return "listbets";
	}

	@RequestMapping("/update")
	public String updateBets(@RequestParam("id") long id, Model model) {
		Bet bet = betService.updatebets(id);
		model.addAttribute("bet", bet);
		return "update";
	}

	@RequestMapping("/updatebets")
	public String updateAllBets(@ModelAttribute("bet") Bet bet, Model model) {
		betService.saveonebet(bet);
		List<Bet> bets = betService.getallbets();
		model.addAttribute("bets", bets);
		return "listbets";
	}

}
