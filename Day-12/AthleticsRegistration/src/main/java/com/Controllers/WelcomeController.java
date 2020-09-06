package com.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AthleteDAO;
import com.model.Athlete;



@Controller
public class WelcomeController {
//------Athlete Registration Controller---------
	
	@Autowired
	AthleteDAO userDao;
	
	
//	@RequestMapping(value="welcome")
//	public String getHome() {
//		return "pseudoHome";
//	}
	
	@RequestMapping(value="addAthleteTag")
	public String getForm() {
		return "addAthlete";
	}
	
	@RequestMapping(value="delete")
	public String getDeleteForm() {
		return "delAthlete";
	}
	
	@RequestMapping(value="showAthleteTag")
	public ModelAndView getAthletes(){
		List<Athlete> userList = userDao.showAthletes();
//		System.out.println(userList);
		return new ModelAndView("showAthlete", "userList", userList);
	}
	
	
	@RequestMapping(value="/addFormTag", method=RequestMethod.POST)	
	public ModelAndView AddAthlete(@ModelAttribute Athlete user) {
		int id=userDao.addAthlete(user);	
		ModelAndView modelAndView = new ModelAndView("athleteAdded"); // view name		
		modelAndView.addObject("user", id); //model object name-value		
		return modelAndView;
	}
	
	@RequestMapping(value="/deleteTag", method=RequestMethod.POST)	
	public ModelAndView delete(@RequestParam int deleteID) {
		boolean status=userDao.deleteAthlete(deleteID);	
		
		
		if(status) {
			ModelAndView modelAndView = new ModelAndView("athleteDeleted"); // view name		
			modelAndView.addObject("user", deleteID);	
			return modelAndView;
		}else
			return new ModelAndView("deletionFailed");	
	}
}	