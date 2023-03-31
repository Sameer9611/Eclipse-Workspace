package com.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employees {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_id;
	private String fullname;
	private String skillSet;
	
	@ManyToMany(mappedBy="employeeset")
	private Set<Projects> projecteset=new HashSet<Projects>();//this would have created a joincolumn but as it is a set will create a new table: Employee_projects
	//and if mapping given will create one table only
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public Set<Projects> getProjecteset() {
		return projecteset;
	}

	public void setProjecteset(Set<Projects> projecteset) {
		this.projecteset = projecteset;
	}
	
	
	

	

}
