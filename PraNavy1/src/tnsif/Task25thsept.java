package tnsif;
public class Task25thsept {
		 private String name;
		private int employeeID;
		private double salary ;
		public Task25thsept(String name, int employeeID, double salary)
		{
			this.name=name;
			this.employeeID =employeeID;
			this.salary=salary;
		}
		public double calculateBonus(){
		return 0.75* salary;
		}
		 public static void main(String[] args)
		 {
			 Task25thsept  task25thsept= new Task25thsept("Navya",88,880000);
			 double bonus = task25thsept.calculateBonus();
			 System.out.println("Employee Name:" +task25thsept.name);
			 System.out.println("Employee ID:" +task25thsept.employeeID);
			 System.out.println("Employee salary:"+task25thsept.salary);
			 System.out.println("Bonus Amount:"+bonus);
		}
		}


