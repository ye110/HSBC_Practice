package com.userfeedback.service;

import java.util.List;
import com.userfeedback.dao.UserRatingsDao;
import com.userfeedback.model.UserRatings;
import com.userfeedback.DBUtil.DBUtil;

public class UserRatingsService {

	UserRatingsDao userRatingsDao = new UserRatingsDao();

	void addUserRating(String username, int rating, String comment) {

		DBUtil.open();
		this.userRatingsDao.setConnection(DBUtil.get());

		userRatingsDao.saveUserRating(username, rating, comment);
	}

	List<UserRatings> listAll() {

		DBUtil.open();
		this.userRatingsDao.setConnection(DBUtil.get());

		return this.userRatingsDao.selectAll();
	}

	float averageRating() {

		DBUtil.open();
		this.userRatingsDao.setConnection(DBUtil.get());

		return this.userRatingsDao.getAverage();

	}

	int userCount() {

		DBUtil.open();
		this.userRatingsDao.setConnection(DBUtil.get());

		return this.userRatingsDao.getTotalUsers();

	}

}