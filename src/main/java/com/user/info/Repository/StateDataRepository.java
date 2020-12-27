package com.user.info.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.info.Entity.StateData;

public interface StateDataRepository extends JpaRepository<StateData, Serializable> {

	public List<StateData> findByCountaryId(Integer countryId);

}
