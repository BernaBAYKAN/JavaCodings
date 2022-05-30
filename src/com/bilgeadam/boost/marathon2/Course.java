package com.bilgeadam.boost.marathon2;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;

public class Course {
	
	private String lessonName;
	private Teacher mainTeacher;
	private Teacher secondryTeacher;
	private HashMap<String, Student> studentList;
	private int year; //hangi yılsa
	private int hour; //haftalık saat
	private DayOfWeek day;
	
	public Course(String lessonName, Teacher mainTeacher, Teacher secondryTeacher, HashMap<String, Student> studentList,
			int year, int weeklyHour, DayOfWeek day) {
		super();
		this.lessonName = lessonName;
		this.mainTeacher = mainTeacher;
		this.secondryTeacher = secondryTeacher;
		this.studentList = studentList;
		this.year = year;
		this.hour = hour;
		this.day = day;
	}

	public String getLessonName() {
		return lessonName;
	}

	public Teacher getMainTeacher() {
		return mainTeacher;
	}

	public Teacher getSecondryTeacher() {
		return secondryTeacher;
	}

	public HashMap<String, Student> getStudentList() {
		return studentList;
	}

	public int getYear() {
		return year;
	}

	public int getHour() {
		return hour;
	}

	public DayOfWeek getDay() {
		return day;
	}

	@Override
	public String toString() {
		return "Course [lessonName=" + lessonName + ", mainTeacher=" + mainTeacher + ", secondryTeacher="
				+ secondryTeacher + ", studentList=" + studentList + ", year=" + year + ", hour=" + hour + ", day="
				+ day + "]";
	}

}
