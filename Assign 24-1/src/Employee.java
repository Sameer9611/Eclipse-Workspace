
public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String city;
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public int compareTo(Employee o) {
	return this.name.compareTo(o.name);	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

	

	
	

}
