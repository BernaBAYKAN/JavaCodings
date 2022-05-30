package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;
import java.time.Period;

public class Teacher extends Employee {
	
	private String Id;//sicil numarası için öğretmen için
	private int i= 0; //sayaç tanımladım.

	public Teacher(String name, String lastName, boolean isMiddle, String gender, boolean isMarried, LocalDate birthday,
			LocalDate startWork, LocalDate finishWork, int firstSalary, String mobile, String home_phone) {
		super(name, lastName, isMiddle, gender, isMarried, birthday, startWork, finishWork, firstSalary, mobile, home_phone);
		this.Id = this.generateID();
	}
	
	public  String generateID() {
		String idNo = String.format("%03d", ++i);
		return "T-" + idNo;
	
	}
	@Override
	public String toString() {
		return "Teacher [Id=" + Id + ", LastName=" + getLastName() + ", isMarried=" + isMarried()
				+ ", Name=" + getName() + ", isMiddle=" + isMiddle() + ", Gender=" + getGender()
				+ ", Birthday=" + getBirthday() + ", StartWork=" + getStartWork() + ", FinishWork="
				+ getFinishWork() + ", FirstSalary=" + getFirstSalary() + ", Mobile=" + getMobile()
				+ ", Home_phone=" + getHome_phone() + "]";
	}
	
	@Override
	public void incresaSalary() {
		LocalDate dateFrom = this.getSalaryUpdateDate();
	    LocalDate dateTo = LocalDate.now();
	 
	    Period intervalPeriod = Period.between(dateFrom, dateTo);
	 
	    if(intervalPeriod.getMonths()>=6) {
	    	this.setCurrentSalary(this.getCurrentSalary()*(1.10));
		
	}
  }
}