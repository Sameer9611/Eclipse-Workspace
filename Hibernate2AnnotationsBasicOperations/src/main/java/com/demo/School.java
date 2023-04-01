package com.demo;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity//all annotations present in @javax.persistance//to make this class table
//@Table(name="Schoolrename")>>renaming annotation

/*this annotations are about 2nd level cache*/
@Cacheable//>>javax.persistance
@Cache(usage =CacheConcurrencyStrategy.READ_ONLY, region = "School")//>>org.hibernate.annotations.Cache
public class School{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//ratta mar//PK
	private int id;
	//@Column(name="studentname") >>change column name
	private String name;
	private String lastname;//no need to define property//automatic column consideration
	private String city;
	private int salary;
	
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", lastname=" + lastname + ", city=" + city + ", salary="
				+ salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
