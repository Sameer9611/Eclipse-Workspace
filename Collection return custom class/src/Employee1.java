
public class Employee1 {
	int id=10;
	String name ="ram";
	String salary="5000";//even tho we have initialized them: still we can get and set the copy(edit) them later
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "c1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


}
