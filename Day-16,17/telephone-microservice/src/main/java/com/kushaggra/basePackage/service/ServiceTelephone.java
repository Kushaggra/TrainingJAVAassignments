package com.kushaggra.basePackage.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushaggra.basePackage.exceptions.TelephoneBeanException;
import com.kushaggra.basePackage.model.TelephoneBean;
import com.kushaggra.basePackage.repository.ITelephoneRepository;

@Service
public class ServiceTelephone implements IServiceTelephone {

		@Autowired
		ITelephoneRepository repository;
		

		@Override
		public TelephoneBean getById(long id) {
			return repository.findById(id).orElse(null);
		}
		
		
		
		@Override
		public String addTelephone(TelephoneBean bean) {
			TelephoneBean b = getById(bean.getTelephoneNumber());
			String statement="Record couldn't be Added...";
			if(b==null) {
				repository.save(bean);
				statement="Addition Successful!";
			}else
				throw new TelephoneBeanException("The number you are trying to add already exists in the records!");
		return statement;		
		}


		@Override
		public List<TelephoneBean> showAll() {
			List<TelephoneBean> list = new ArrayList<TelephoneBean>();
			if(repository.count()==0)
				return null;
			else {
				list= repository.findAll();
			}
			return list;
		}


		@Override
		public TelephoneBean getByNum(long num) {
			return repository.findByTelephoneNumber(num);
		}



		@Override
		public TelephoneBean updateTel(TelephoneBean bean) {
			return repository.save(bean);
		}



		@Override
		public void delById(TelephoneBean bean) {
			repository.delete(bean);
		}


}
