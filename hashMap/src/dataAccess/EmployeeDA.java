package dataAccess;

import domain.Employee;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDA {
    private HashMap<String, Employee> employeeMap;

    public EmployeeDA() {
        employeeMap = new HashMap<>();
    }

    public HashMap<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public Employee create(String empNo) {
        if (employeeMap.containsKey(empNo)) {
            return employeeMap.get(empNo);
        } else {
            try {
                Scanner employeeFile = new Scanner(new FileReader("src/emp.csv"));

                // Disregard header text
                employeeFile.nextLine();

                while (employeeFile.hasNext()) {
                    String employeeLineData = employeeFile.nextLine();
                    String[] employeeLineDataSpecific = employeeLineData.split(",");

                    if (employeeLineDataSpecific[0].trim().equals(empNo)) {
                        Employee employee = new Employee();
                        employee.setEmpNo(empNo);
                        employee.setLastName(employeeLineDataSpecific[1].trim());
                        employee.setFirstName(employeeLineDataSpecific[2].trim());
                        employee.setJob(employeeLineDataSpecific[3].trim());

                        employeeMap.put(empNo, employee);
                        return employee;
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
