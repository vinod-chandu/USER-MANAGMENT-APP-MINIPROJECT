package com.user.info.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Countary_Data")
public class CountryData {

	private Integer countaryId;
	private String countaryName;

	public Integer getCountaryId() {
		return countaryId;
	}

	public void setCountaryId(Integer countaryId) {
		this.countaryId = countaryId;
	}

	public String getCountaryName() {
		return countaryName;
	}

	public void setCountaryName(String countaryName) {
		this.countaryName = countaryName;
	}

	@Override
	public String toString() {
		return "CountryData [countaryId=" + countaryId + ", countaryName=" + countaryName + "]";
	}

}
