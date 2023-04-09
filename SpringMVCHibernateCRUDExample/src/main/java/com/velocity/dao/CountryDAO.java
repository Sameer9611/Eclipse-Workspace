package com.velocity.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.velocity.model.Country;
//database 
@Repository
public class CountryDAO {

	@Autowired//we have the bean of sessionfactory:in spring-servlet.xml @line:30 that is autowired here
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Country> getAllCountries() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Country> countryList = session.createQuery("from Country").list();//till now we used session.save.get.load
		return countryList;													   //session.createQwery(HQLString)
	}

	public Country getCountry(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Country country = (Country) session.get(Country.class, new Integer(id));
		return country;
	}

	public Country addCountry(Country country) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(country);
		return country;
	}

	public void updateCountry(Country country) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(country);
	}

	public void deleteCountry(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Country p = (Country) session.load(Country.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}	
}