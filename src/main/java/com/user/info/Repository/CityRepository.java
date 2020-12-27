package com.user.info.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.info.Entity.CityData;

public interface CityRepository  extends JpaRepository<CityData, Serializable>{
 public List<CityData> findBystateiD(Integer stateId);
}
