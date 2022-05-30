package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;

public class Student {
	private String nameStudent;
	private String lastNameStudent;
	private boolean isMiddleStudent;//gobekadı
	private String genderStudent; 
	private boolean isMarried; 
	private LocalDate birthdayStudent;
	private LocalDate startSchool;
	private LocalDate finishSchool;
	private String mobile1;
	private String home_phone1;
	private String parentsPhone;
		
	private String Id;//kayıt numarası için öğrenci için
	private int i= 0; //sayaç tanımladım.
	
	
	public Student(String nameStudent, String lastNameStudent, boolean isMiddleStudent, String genderStudent,
			boolean isMarried, LocalDate birthdayStudent, LocalDate startSchool, LocalDate finishSchool, String mobile1,
			String home_phone1, String parentsPhone) {
		super();
		this.nameStudent = nameStudent;
		this.lastNameStudent = lastNameStudent;
		this.isMiddleStudent = isMiddleStudent;
		this.genderStudent = genderStudent;
		this.isMarried = false;
		this.birthdayStudent = birthdayStudent;
		this.startSchool = startSchool;
		this.finishSchool = finishSchool;
		this.mobile1 = mobile1;
		this.home_phone1 = home_phone1;
		this.parentsPhone = parentsPhone;
		this.Id = this.generateID();
	}
	public  String generateID() {
		String idNo = String.format("%03d", ++i);
		return "2020-" + idNo;
	
	}

	public boolean isMiddleStudent() {
		return isMiddleStudent;
	}


	public void setMiddleStudent(boolean isMiddleStudent) {
		this.isMiddleStudent = isMiddleStudent;
	}


	public boolean isMarried() {
		return isMarried;
	}


	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}


	public String getNameStudent() {
		return nameStudent;
	}


	public String getLastNameStudent() {
		return lastNameStudent;
	}


	public String getGenderStudent() {
		return genderStudent;
	}


	public LocalDate getBirthdayStudent() {
		return birthdayStudent;
	}


	public LocalDate getStartSchool() {
		return startSchool;
	}


	public LocalDate getFinishSchool() {
		return finishSchool;
	}


	public String getMobile1() {
		return mobile1;
	}


	public String getHome_phone1() {
		return home_phone1;
	}


	public String getParentsPhone() {
		return parentsPhone;
	}

	public String getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Student " + "Id=" + this.Id + "[nameStudent=" + nameStudent + ", lastNameStudent=" + lastNameStudent + ", isMiddleStudent="
				+ isMiddleStudent + ", genderStudent=" + genderStudent + ", isMarried=" + isMarried
				+ ", birthdayStudent=" + birthdayStudent + ", startSchool=" + startSchool + ", finishSchool="
				+ finishSchool + ", mobile1=" + mobile1 + ", home_phone1=" + home_phone1 + ", parentsPhone="
				+ parentsPhone +  "]";
	}
	

	}
	


	

