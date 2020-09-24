package com.szq27.state;
/**
 * 抽奖活动
 */
public class RaffleActivity {
	
	// 当前状态
	State state = null;
	int count = 0;
	State noRaffleState = new NoRaffleState(this);
	State canRaffleState = new CanRaffleState(this);
	
	State dispenseState = new DispenseState(this);
	State dispenseOutState = new DispenseOutState(this);
	
	public RaffleActivity(int count) {
		this.state = getNoRaffleState();
		this.count = count;
	}
	
	public void reduceMoney() {
		state.reduceMoney();
	}

	public void raffle() {
		if (state.raffle()) {
			state.dispensePrize();;
		}
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		int curCount = count;
		count--;
		return curCount;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getNoRaffleState() {
		return noRaffleState;
	}

	public void setNoRaffleState(State noRaffleState) {
		this.noRaffleState = noRaffleState;
	}

	public State getCanRaffleState() {
		return canRaffleState;
	}

	public void setCanRaffleState(State canRaffleState) {
		this.canRaffleState = canRaffleState;
	}

	public State getDispenseState() {
		return dispenseState;
	}

	public void setDispenseState(State dispenseState) {
		this.dispenseState = dispenseState;
	}

	public State getDispenseOutState() {
		return dispenseOutState;
	}

	public void setDispenseOutState(State dispenseOutState) {
		this.dispenseOutState = dispenseOutState;
	}
	
}