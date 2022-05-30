package com.bilgeadam.boost.marathon2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolManagementSystem {

	public static void main(String[] args) {
		
		School sch = new School();
		boolean cikis = false;
		int menu;
		
		while(!cikis ) {//cikis =false idi. !cikis dediğimizde trueya döner ve sonsuz döngü olur
			//Ancak kullanıcı 10a basarsa döngüden çıkar.
			
			System.out.println("Bir menu seçiniz...");
			Scanner scanner = new Scanner(System.in);
			menu = scanner.nextInt();
	
			scanner.nextLine();//Enter yaptığında burayı algılayarak hatayı önler.
		
			switch(menu) {//menu kontrolü 

			case 1:
				sch.addEmployee();
				break;
			case 2:
				sch.showEmployeeList();
				break;
			case 3:
				sch.olderEmployeeList();
				break;
			case 4:
				sch.newClass();
				break;
			case 5:
				sch.addStudent();
				break;
			case 6:
				sch.showCourseList();
				break;
			case 7:
				//sch.
				break;
			case 8:
				//sch.
				break;
			case 9:
				sch.showSalaryList();
				break;
			case 10:
				cikis = true ;
				System.out.println("Program Bitiyor...");
				break;
			
			}
	   }

   }
}