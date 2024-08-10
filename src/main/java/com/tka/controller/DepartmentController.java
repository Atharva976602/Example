package com.tka.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Department;
import com.tka.service.DepartmentService;

@RestController
public class DepartmentController {

	DepartmentService service = new DepartmentService();

	@PostMapping("/add-department")
	public String addDepartment(@RequestBody Department department) {
		String msg = service.addDepartment(department);
		return msg;
	}

	@GetMapping("/all-department")
	public ArrayList<Department> allDepartment() {
		ArrayList<Department> list = service.allDepartment();
		System.out.println(list);
		return list;
	}

	@GetMapping("/get-department/")
	public Object getDepartment(@RequestParam String name) {
		Object dep = service.getDepartment(name);
		return dep;
	}
}
