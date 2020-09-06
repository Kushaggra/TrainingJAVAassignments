package com.services;
import com.model.Athlete;
import java.util.List;

public interface AthleteInfo {
	public int addAthlete(Athlete user);
	public List<Athlete> showAthletes();
	public boolean deleteAthlete(int deleteID);
}	