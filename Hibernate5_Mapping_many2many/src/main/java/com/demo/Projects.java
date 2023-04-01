package com.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int project_Id;
	private String Project_Name;
	private int Duration;
	
	@ManyToMany(fetch=FetchType.LAZY)//if mapped both>>exception>>Illegal use of mappedBy on both sides of the relationship
	private Set<Employees> employeeset=new HashSet<Employees>();//this would have created a join column but as it is a set will create a new table:projects_Employee


	public int getProject_Id() {
		return project_Id;
	}

	public void setProject_Id(int project_Id) {
		this.project_Id = project_Id;
	}

	public String getProject_Name() {
		return Project_Name;
	}

	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public Set<Employees> getEmployeeset() {
		return employeeset;
	}

	public void setEmployeeset(Set<Employees> employeeset) {
		this.employeeset = employeeset;
	}
	
	


}
