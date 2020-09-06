package com.dao.extractor;

import java.sql.*;
import java.util.*;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.model.Athlete;



public class AtheleteDataExtractor implements ResultSetExtractor<List<Athlete>> {

	public List<Athlete> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Athlete> userList = new ArrayList<>();
		
		while(rs.next()) {
			Athlete user = new Athlete();
			
			user.setIDshow(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setGender(rs.getNString(3));
			user.setCategory(rs.getNString(3));
			user.setEmail(rs.getNString(4));
			user.setMobile(rs.getString(5));

			userList.add(user);
			
			}
		
		return userList;
	}

}
