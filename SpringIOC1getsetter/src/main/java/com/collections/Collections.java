package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {
	
	private List<Integer> ids;
	private Set<String> names;
	private Map<Float,String> versions;
	private Properties properties;
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	public Set<String> getNames() {
		return names;
	}
	public void setNames(Set<String> names) {
		this.names = names;
	}
	public Map<Float, String> getVersions() {
		return versions;
	}
	public void setVersions(Map<Float, String> versions) {
		this.versions = versions;
	}
	@Override
	public String toString() {
		return "Collections [ids=" + ids + ", names=" + names + ", versions=" + versions + ", properties=" + properties + "]";
	}
	
	
	

}
