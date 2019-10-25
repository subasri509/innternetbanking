package com.ibproject.innternetbanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibproject.innternetbanking.dao.MainDao;
import com.ibproject.innternetbanking.model.DashBoard;
import com.ibproject.innternetbanking.model.DetailedStatemnt;

@Service
public class MainService {
	
	@Autowired
	private MainDao mainDao;

	public DashBoard getDashBoard(String username) {
		return mainDao.getDashBoard(username);
	}

	public DetailedStatemnt getDetailedStatement(String username) {
		return mainDao.getDetailedStatement(username);
	}

}
