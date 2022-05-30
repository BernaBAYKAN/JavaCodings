package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {//Employee abstract superclass olarak tanımladım.
	private String name;
	private String lastName;
	private boolean isMiddle;//gobekadı
	private String gender;
	private boolean isMarried; 
	private LocalDate birthday;
	private LocalDate startWork;
	private LocalDate finishWork;
	private double firstSalary;
	private String mobile;
	private String home_phone;
	private LocalDate salaryUpdateDate;
	private double currentSalary;
	
	//constructor yapılarını oluşturdum.
	public Employee(String name, String lastName, boolean isMiddle, String gender, boolean isMarried, LocalDate birthday,
			LocalDate startWork, LocalDate finishWork, double firstSalary, String mobile, String home_phone) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.isMiddle = isMiddle;
		this.gender = gender;
		this.isMarried = isMarried;
		this.birthday = birthday;
		this.startWork = startWork;
		this.finishWork = finishWork;
		this.firstSalary = firstSalary;
		this.mobile = mobile;
		this.home_phone = home_phone;
		this.salaryUpdateDate = LocalDate.now();
		
	}

//constructor yapılarında değişmeyen özellikleri get ile almam yeterlidir. Ancak evlilik durumu ve soyad değişebileceği için setleri aldım.
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public String getName() {
		return name;
	}

	public boolean isMiddle() {
		return isMiddle;
	}
	public void setMiddle(boolean isMiddle) {
		this.isMiddle = isMiddle;
	}

	public String getGender() {
		return gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public LocalDate getStartWork() {
		return startWork;
	}

	public LocalDate getFinishWork() {
		return finishWork;
	}

	public double getFirstSalary() {
		return firstSalary;
	}

	public String getMobile() {
		return mobile;
	}

	public String getHome_phone() {
		return home_phone;
	}
	
	
	public LocalDate getSalaryUpdateDate() {
		return salaryUpdateDate;
	}

	public double getCurrentSalary() {
		return currentSalary;
	}
	

	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}

	public abstract void incresaSalary();
	
public void getDateInformationOfOldEmployees() {
		
		if(this.getFinishWork()!=null) {
		LocalDate startDate = this.getStartWork();
	    LocalDate finishDate = this.getFinishWork();
	 
	    Period intervalPeriod = Period.between(startDate, finishDate);
	 
	    System.out.println("Difference of days: " + intervalPeriod.getDays());
	    System.out.println("Difference of months: " + intervalPeriod.getMonths());
	    System.out.println("Difference of years: " + intervalPeriod.getYears());
		}
		else {}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastName=" + lastName + ", isMiddle=" + isMiddle+ ", gender=" + gender
				+ ", isMarried=" + isMarried + ", birthday=" + birthday + ", startWork=" + startWork + ", finishWork="
				+ finishWork + ", firstSalary=" + firstSalary + ", mobile=" + mobile + ", home_phone=" + home_phone
				+ "]";
	}
	
	
}

