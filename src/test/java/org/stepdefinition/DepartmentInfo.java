package org.stepdefinition;

public class DepartmentInfo {
	private void ug(int id) {
		// TODO Auto-generated method stub
        System.out.println("Student id :" +id);
	}
	private void ug(String name , int age) {
		// TODO Auto-generated method stub
		 System.out.print("Student name :" +name);
		 System.out.println(" Student age =" + age);

	}
	private void ug(long phno) {
		// TODO Auto-generated method stub
		 System.out.println("Student phone no :" +phno);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentInfo sc=new DepartmentInfo();
		sc.ug(101);
		sc.ug("Thiyaneshwaran", 24);
		sc.ug(8148551976l);
	}

}
