package domain;

public class Employee {
    private String empNo;
    private String lastName;
    private String firstName;
    private String job;
    private Double salary;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
