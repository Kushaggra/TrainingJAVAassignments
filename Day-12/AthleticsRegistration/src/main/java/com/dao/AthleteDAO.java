package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dao.extractor.AtheleteDataExtractor;
import com.model.Athlete;
import com.services.AthleteInfo;


public class AthleteDAO implements AthleteInfo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int addAthlete(Athlete user) {
		String query = "INSERT INTO athlete VALUES(?,?,?,?,?,?)";
		int id = Athlete.getID();
		int status = jdbcTemplate.update(query,id, user.getName(),user.getGender(),user.getCategory(),user.getEmail(),user.getMobile());
		if(status==1)
			return id;
		else
			return -1;
	}

	
	public List<Athlete> showAthletes() {
		String sql = "SELECT * FROM athlete";
		List<Athlete> userList = jdbcTemplate.query(sql, new AtheleteDataExtractor());
		return userList;
	}

	@Override
	public boolean deleteAthlete(int deleteID) {
		String sql = "delete from athlete where athlete_id=?";
		int status = jdbcTemplate.update(sql,deleteID);
		if(status==1)
				return true;
		else
			return false;
	}

	
	
}
