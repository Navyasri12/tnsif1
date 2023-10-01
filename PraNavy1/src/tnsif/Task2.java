package tnsif;
public class Task2 {
	private String name;
	private int rollNumber;
	private static int totalStudents = 0;
	public Task2(String name, int rollNumber){
	this.name= name;
	this.rollNumber=rollNumber;
	totalStudents++;
	}
	public void displayDetails() { 
		System.out.println("Name:"+ name);
		System.out.println("Roll Number:"+ rollNumber);
	}
	public static int getTotalStudents() {
		return totalStudents;
	}
	public static void main(String[] args)
	{
		Task2 student1= new Task2("Navu", 88);
		Task2 student2= new Task2("Divu", 77);
		System.out.println("Student 1 Details:");
		student1.displayDetails();
		System.out.println();
		System.out.println("Student 2 Details:");
		student2.displayDetails();
		System.out.println();
		int total= Task2.getTotalStudents();
		System.out.println("Total Students: " + total);
	}
}
