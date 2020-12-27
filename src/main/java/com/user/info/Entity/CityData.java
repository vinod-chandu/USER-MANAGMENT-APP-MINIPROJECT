package com.user.info.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CITY_DATA")
public class CityData {

	private Integer cityId;
	private String cityName;
	private Integer stateiD;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getStateiD() {
		return stateiD;
	}

	public void setStateiD(Integer stateiD) {
		this.stateiD = stateiD;
	}

	@Override
	public String toString() {
		return "CityData [cityId=" + cityId + ", cityName=" + cityName + ", stateiD=" + stateiD + "]";
	}

}
