package com.bet.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "bets")
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @Column(name = "num_bets")
	private long numbets;
    @Column(name = "games")
	private String game;
    @Column(name = "stakes")
	private double stake;
    @Column(name = "returns")
	private double returns;
    @Column(name = "client_id")
	private long clientid;
    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNumbets() {
		return numbets;
	}
	public void setNumbets(long numbets) {
		this.numbets = numbets;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public double getStake() {
		return stake;
	}
	public void setStake(double stake) {
		this.stake = stake;
	}
	public double getReturns() {
		return returns;
	}
	public void setReturns(double returns) {
		this.returns = returns;
	}
	public long getClientid() {
		return clientid;
	}
	public void setClientid(long clientid) {
		this.clientid = clientid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
    
	
}
