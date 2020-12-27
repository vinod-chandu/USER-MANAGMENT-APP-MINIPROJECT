package com.user.info.Repository.Implements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.info.Entity.CityData;
import com.user.info.Entity.CountryData;
import com.user.info.Entity.StateData;
import com.user.info.Entity.UserRegesiter;
import com.user.info.Repository.CityRepository;
import com.user.info.Repository.CountaryDataRepository;
import com.user.info.Repository.StateDataRepository;
import com.user.info.Repository.UserRegisterRepository;

@Service
public class UserServiceImpal implements UserService {

	@Autowired
	private UserRegisterRepository userRegisterRepository;
	@Autowired
	private StateDataRepository stateDataRepository;
	@Autowired
	private CountaryDataRepository countaryDataRepository;
	@Autowired
	private CityRepository cityRepository;

	@Override
	public Map<Integer, String> findCountary() {

		List<CountryData> countryData = countaryDataRepository.findAll();
		HashMap<Integer, String> hashMap = new HashMap<>();
		for (CountryData countryData2 : countryData) {
			hashMap.put(countryData2.getCountaryId(), countryData2.getCountaryName());
		}
		return hashMap;
	}

	@Override
	public Map<Integer, String> findState(Integer countaryId) {
		List<StateData> findByCountaryId = stateDataRepository.findByCountaryId(countaryId);
		HashMap<Integer, String> hashMap = new HashMap<>();
		for (StateData stateData : findByCountaryId) {
			hashMap.put(stateData.getStateiD(), stateData.getStateName());
		}

		return hashMap;

	}

	@Override
	public Map<Integer, String> findCity(Integer StateId) {
		List<CityData> findBystateiD = cityRepository.findBystateiD(StateId);
		HashMap<Integer, String> hashMap = new HashMap<>();
		for (CityData cityData : findBystateiD) {
			hashMap.put(cityData.getCityId(), cityData.getCityName());
		}
		return hashMap;
	}

	@Override
	public boolean saveUser(UserRegesiter userRegesiter) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmailUnique(String emailId) {

		Optional<UserRegesiter> findById = userRegisterRepository.findById(emailId);
		UserRegesiter userRegesiter = findById.get();
		if (userRegesiter.getEmail() != null) {
			return true;
		} else if (userRegesiter.getEmail().contains(emailId)) {
			return false;
		} else if (userRegesiter.getEmail().isBlank()) {
			return false;
		}
		return false;

	}

	@Override
	public boolean userPassword(Integer userPassWord) {
		Optional<UserRegesiter> userPassword = userRegisterRepository.findById(userPassWord);
		UserRegesiter userRegesiter = userPassword.get();
		if (userRegesiter == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String isEmailIdAndPassword(String email, String password) {
		String findByEmailIdAndUserPassword = userRegisterRepository.findByEmailIdAndUserPassword(password, email);
		if (findByEmailIdAndUserPassword != null || findByEmailIdAndUserPassword.contains("")
				|| findByEmailIdAndUserPassword.isBlank()
				|| findByEmailIdAndUserPassword.equalsIgnoreCase(findByEmailIdAndUserPassword)) {
			return "SORRY U ARE EMAIL ID AND PASSWORD ARE NOT VALID";
		} else {
			return findByEmailIdAndUserPassword;
		}
	}

}