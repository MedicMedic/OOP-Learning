package dataAccess;

import domain.Department;
import domain.Employee;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class DepartmentDA {
    private HashMap<String, Department> departmentMap;
    private EmployeeDA employeeDA;

    public DepartmentDA() {
        departmentMap = new HashMap<>();
        employeeDA = new EmployeeDA();
    }

    public HashMap<String, Department> getDepartmentMap() {
        return departmentMap;
    }

    public void create() {
        try {
            Scanner departmentFile = new Scanner(new FileReader("src/dep.csv"));

            // Disregard header text
            departmentFile.nextLine();

            while (departmentFile.hasNext()) {
                String departmentLineData = departmentFile.nextLine();
                String[] departmentLineDataSpecific = departmentLineData.split(",");

                Department department = new Department();
                department.setDepCode(departmentLineDataSpecific[0].trim());
                department.setDepName(departmentLineDataSpecific[1].trim());

                readDepEmp(department);

                departmentMap.put(department.getDepCode(), department);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void readDepEmp(Department department) {
        try {
            Scanner deptEmpFile = new Scanner(new FileReader("src/deptemp.csv"));

            // Disregard header text
            deptEmpFile.nextLine();

            while (deptEmpFile.hasNext()) {
                String deptEmpLineData = deptEmpFile.nextLine();
                String[] deptEmpLineDataSpecific = deptEmpLineData.split(",");

                if (department.getDepCode().equals(deptEmpLineDataSpecific[0].trim())) {
                    String empNo = deptEmpLineDataSpecific[1].trim();
                    Double salary = Double.parseDouble(deptEmpLineDataSpecific[2].trim());

                    Employee employee = employeeDA.create(empNo);
                    if (employee != null) {
                        employee.setSalary(salary);
                        department.addEmployee(employee);
                        department.setDepTotalSalary(department.getDepTotalSalary() + salary);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void printDepartment() {
        for (Department department : departmentMap.values()) {
            System.out.println("Department code: " + department.getDepCode());
            System.out.println("Department name: " + department.getDepName());
            System.out.println("Department total salary: " + department.getDepTotalSalary());
            System.out.println("---------------------Details -------------------------");
            System.out.println("EmpNo\tEmployee Name\t\tSalary"); // Use fixed-width format for alignment

            for (Employee employee : department.getEmployeeMap().values()) {
                System.out.printf("%s\t%-20s\t%.2f\n", employee.getEmpNo(), employee.getLastName() + ", " + employee.getFirstName(), employee.getSalary());
            }
            System.out.println();
        }
    }

}
