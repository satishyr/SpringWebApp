package com.app.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;


@Controller
public class EmployeeController {

	@RequestMapping("/show")
	public ModelAndView showMsg()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("Home");
		m.addObject("eid",10);

		//adding object data

		Employee e=new Employee();
		e.setEid(101);
		e.setEname("satish");
		e.setEsal(12300);
		m.addObject("emp", e);

		//adding array data
		String[] arr= {"ajay","sai","hmd"};
		m.addObject("mydata",arr);

		//adding list data

		List<String> al=Arrays.asList("sai","kumar");
		m.addObject("lsobj", al);

		//adding Map data


		Map<Integer,String> map=new HashMap<>();

		map.put(25, "sai");
		map.put(23, "ram");
		map.put(26, "uday");

		m.addObject("mapobj",map);

		return m;






	}
}
