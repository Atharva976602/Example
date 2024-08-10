package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.model.Department;

public class DepartmentDao {

	ArrayList<Department> list = new ArrayList<Department>();

	public String addDepartment(Department department) {
		list.add(department);
		return "successfully department added..! ";
	}

	public ArrayList<Department> allDepartment() {
		return list;
	}

	public Department getDepartment(String name) {
		for (Department dep : list) {
			if (dep.getName().equals(name)) {
				System.out.println(dep);
				return dep;
			}
		}
		return null;
	}

}
