package viope_9;

class Employee {
	private String name;
	private String email;
	private Department department;

	public Employee(String name, String email, Department department) {
		this.name = name;
		this.email = email;
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		String output = "";

		output += this.name + " (" + this.email + "), " + this.department.getName() + " department";

		return output;
	}

}
