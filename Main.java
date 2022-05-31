import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("how many students?");
		int numOfStudents = input.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int i=0; i<numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}

	}

}
