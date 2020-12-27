package com.user.info.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.info.Entity.CountryData;

public interface CountaryDataRepository  extends JpaRepository<CountryData, Serializable>{

}
