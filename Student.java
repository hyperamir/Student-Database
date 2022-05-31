import java.util.List;
import java.util.Scanner;

public class Student {
	
	private String name;
	private String studentID;
	private int gradeYear;
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private String courses = null;
	private static int id = 1000;
	
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name of student: ");
		this.name = input.nextLine();
		
		System.out.println("1-Freshman\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level: ");
		this.gradeYear = input.nextInt();
		
		setStudentID();
		
	}
	
	private void setStudentID() {
		id++;
		this.studentID = gradeYear+""+id;
	}

	public void enroll() {
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter course to enroll/ Q for quit:");
			String course = input.nextLine().toUpperCase();
			if(!course.equals("Q")) {
				courses = courses+"\n"+course;
				tuitionBalance+=costOfCourse;
			}else {break;}
		
		}while(1 != 0);
		System.out.println("Enrolled in: "+courses);
		System.out.println("Tuition balance: "+tuitionBalance);
		
	}
	
	public void payTuition() {
		System.out.println("How much you wanna pay for tuition?");
		Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
		tuitionBalance-=fee;
		System.out.println("Thank you for payment of $"+fee);
		viewBalance();
	}
	
	public void viewBalance() {
		System.out.println("Your balance is $"+tuitionBalance);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", tuitionBalance=" + tuitionBalance + ", courses=" + courses + "]";
	}
	
	
	
}
