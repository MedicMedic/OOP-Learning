package domain;

import java.util.HashMap;
import java.util.Map;

public class Department {
    private String depCode;
    private String depName;
    private Double depTotalSalary;
    private Map<String, Employee> employeeMap;

    public Department() {
        depTotalSalary = 0.0;
        employeeMap = new HashMap<>();
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Double getDepTotalSalary() {
        return depTotalSalary;
    }

    public void setDepTotalSalary(Double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;
    }

    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmpNo(), employee);
    }
}
