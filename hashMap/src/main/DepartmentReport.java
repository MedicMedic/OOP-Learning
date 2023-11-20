package main;

import dataAccess.DepartmentDA;

public class DepartmentReport {
    public static void main(String[] args) {
        DepartmentDA departmentDA = new DepartmentDA();
        departmentDA.create();
        departmentDA.printDepartment();
    }
}
