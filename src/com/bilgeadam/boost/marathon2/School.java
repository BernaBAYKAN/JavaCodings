package com.bilgeadam.boost.marathon2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
	
	Teacher t;
	Teacher t1;
	
	private List<Employee> employeeList;
	private HashMap<String, Course> courseList;
	private HashMap<String, Teacher> teacherList;
	private HashMap<String, Student> studentList;
	private HashMap<String, Double> salaryList;
	private List<Employee> oldEmployeeList = new ArrayList<>();

	
	public School() {
		this.employeeList = new ArrayList<>();
		this.teacherList = new HashMap<>();
		this.studentList = new HashMap<>();
		this.courseList = new HashMap<>();
		this.salaryList = new HashMap<>();
	}
	
	public void addEmployee() {
		Officer o = new Officer("Ezgi", "SAYAN",false, "female", true, LocalDate.of(1997, 5, 14), LocalDate.of(2015, 5, 15), LocalDate.of(2016, 5, 10), 9000, "05368779032", "03125427790");
		Officer o1 = new Officer("Nil", "BAKAN",false, "female", false, LocalDate.of(1997, 5, 14), LocalDate.of(2015, 5, 15), LocalDate.of(2017, 5, 10), 11000, "05368779032", "03125427790");
		
		employeeList.add(o);
		o.incresaSalary();
		salaryList.put(o.getName(), o.getCurrentSalary());
		employeeList.add(o1);
		o1.incresaSalary();
		salaryList.put(o1.getName(), o1.getCurrentSalary());
		
		t = new Teacher("Babür", "SOMER", true,"male",true,LocalDate.of(1964, 1, 10), LocalDate.of(2010, 6, 22), null, 25000, "05386517299", "03124448822");
		t1 = new Teacher("Çağrı", "TÜRKMEN",false,"male",false,LocalDate.of(1993, 1, 10), LocalDate.of(2010, 6, 22), null, 15000, "05386517299", "03124448822");

		employeeList.add(t);
		t.incresaSalary();
		salaryList.put(t.getName(), t.getCurrentSalary());
		employeeList.add(t1);
		t1.incresaSalary();
		salaryList.put(t1.getName(), t1.getCurrentSalary());
		
		
		
		Janitor j = new Janitor("Berna", "BAYKAN",false, "female", true, LocalDate.of(1997, 5, 14), LocalDate.of(2015, 5, 15), null, 9000, "05368779032", "03125427790");
		Janitor j1 = new Janitor("Tarık", "YERLİ",false, "male", true, LocalDate.of(1991, 1, 10), LocalDate.of(2010, 6, 22), null, 8000, "05386517299", "03124448822");

		employeeList.add(j);
		j.incresaSalary();
		salaryList.put(j.getName(), j.getCurrentSalary());
		employeeList.add(j1);
		j1.incresaSalary();
		salaryList.put(j1.getName(), j1.getCurrentSalary());
	
	}
	public void addStudent() {
		Student s = new Student("Deniz","YÜREK",false,"female",false,LocalDate.of(1990, 1, 11),LocalDate.of(1997, 2, 12),LocalDate.of(2005, 2, 10),"05378559188", "03127778855","05325554321");
		Student s1 = new Student("Ayhan","IŞIK",false,"male",false,LocalDate.of(1990, 2, 22),LocalDate.of(1997, 2, 12),LocalDate.of(2005, 2, 10),"05310154322", "03129994321","05313435511");
	
		studentList.put(s.getId(), s);
		studentList.put(s1.getId(), s1);
		
	}
	
	public void newClass() {

		Course c1 = new Course("Java", t, t1, studentList, 2022, 45, DayOfWeek.of(5));
		Course c2 = new Course("C#", t, t1, studentList, 2022, 30, DayOfWeek.of(5));
		courseList.put(c1.getLessonName(),c1);
		courseList.put(c2.getLessonName(),c2);
	}
	
	
	public HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<Integer, String>();
		
		menu.put(1, "YENİ ÇALIŞAN");
		menu.put(2, "ÇALIŞAN LİSTESİ");
		menu.put(3, "ESKİ ÇALIŞANLAR");
		menu.put(4, "YENİ SINIF");
		menu.put(5, "ÖĞRENCİ ATAMA");
		menu.put(6, "SINIF - LİSTESİ");
		menu.put(7, "ÖĞRENCİNİN KATILDIĞI SINIFLAR");
		menu.put(8, "HEDİYE LİSTESİ");
		menu.put(9, "MAAŞ - LİSTESİ");
		menu.put(10,"PROGRAM BİTİRME");
		return menu;
	}
	
	public void olderEmployeeList() { //eski çalışan listesi
		System.out.println("Eski Çalışan Listesi:");
		
		for (Employee employee : employeeList) {
			if (employee.getFinishWork() != null) {
				oldEmployeeList.add(employee);
			} else {
			}
			
		}
		System.out.println(oldEmployeeList);
	}
	public void showEmployeeList() {
		
		System.out.println(employeeList);
	}
	public void showCourseList() {
		
		System.out.println(courseList);
	}
	public void showSalaryList() {
		System.out.println(salaryList);
	}

}
