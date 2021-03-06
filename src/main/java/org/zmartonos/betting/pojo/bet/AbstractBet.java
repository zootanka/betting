package org.zmartonos.betting.pojo.bet;

import org.codehaus.jackson.annotate.JsonIgnore;

public class AbstractBet implements Bet{
	protected float odds;
	protected float stake;
	
	@JsonIgnore
	protected boolean won= false;
	
	protected AbstractBet(){		
	}
	
	public AbstractBet(float odds, float stake) {
		super();
		this.odds = odds;
		this.stake = stake;
	}

	public float getOdds() {
		return odds;
	}

	public void setOdds(float odds) {
		this.odds = odds;
	}
	
	public float getStake() {
		return stake;
	}
	
	public void setStake(float stake) {
		this.stake = stake;
	}

	public boolean isWon() {
		return won;
	}

	public void setWon(boolean won) {
		this.won = won;
	}
	
	public boolean hasWon(){
		return won;
	}
}
