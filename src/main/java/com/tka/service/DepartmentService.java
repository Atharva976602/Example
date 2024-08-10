package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.DepartmentDao;
import com.tka.model.Department;

public class DepartmentService {

	DepartmentDao dao = new DepartmentDao();

	public String addDepartment(Department department) {
		String msg = dao.addDepartment(department);
		return msg;
	}

	public ArrayList<Department> allDepartment() {
		ArrayList<Department> list = dao.allDepartment();
		return list;
	}

	public Object getDepartment(String name) {
		Department dep = dao.getDepartment(name);
		if (dep != null) {
			return dep;
		}
		return "parameter is wrong";
	}
}
