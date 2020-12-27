package com.user.info.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Satate_Data")
public class StateData {

	private Integer stateiD;
	private String stateName;
	private Integer countaryId;
	public Integer getStateiD() {
		return stateiD;
	}
	public void setStateiD(Integer stateiD) {
		this.stateiD = stateiD;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Integer getCountaryId() {
		return countaryId;
	}
	public void setCountaryId(Integer countaryId) {
		this.countaryId = countaryId;
	}
	@Override
	public String toString() {
		return "StateData [stateiD=" + stateiD + ", stateName=" + stateName + ", countaryId=" + countaryId + "]";
	}
	
}
