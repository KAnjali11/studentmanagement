package studentmanagementsystem1;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class studentanagemnt {
	static List<student>students=new ArrayList<>();
	static Map<Integer,student>studentmap=new HashMap<>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("===Student Management Menu");
			System.out.println("1.Add student");
			System.out.println("2.Display All Students");
			System.out.println("3.Search Student By ID");
			System.out.println("4.Sort Students By Marks");
			System.out.println("5.Delete Student By ID");
			System.out.println("6.Update Student Details");
			System.out.println("7.Exit");
			System.out.print("Enter choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				AddStudent();
				break;
		case 2:
				DisplayStudents();
				break;
			case 3:
				SearchStudent();
				break;
			case 4:
				SortStudents();
				break;
			case 5:
				DeleteStudent();
				break;
			case 6:
				UpdateStudent();
				break;
			case 7:
				System.exit(0);
				default:
					System.out.println("Invali Input");
			}
		}
	}
	static void AddStudent(){
		System.out.print("Enter ID:");
		int id= sc.nextInt();
		if(studentmap.containsKey(id)) {
			System.out.println("Student With This Id Alreay exist!!!");
		}
		sc.nextLine();
		System.out.print("Enter Name:");
		String name=sc.nextLine();
		System.out.print("Enter Maks:");
		int marks=sc.nextInt();
		student s=new student(id,name,marks);
		students.add(s);
		studentmap.put(id,s);
		System.out.print("Student add Successfully!!");
		
	}
	static void DisplayStudents(){
		if(students.isEmpty()) {
			System.out.println("no student is found");
			return;
		}
		for(student s:students) {
			System.out.println(s);
			
		}
			}
	static void SearchStudent() {
		System.out.print("Enter search ID:");
		int id= sc.nextInt();
		student s= studentmap.get(id);
		if(s!=null) {
			System.out.println(s);
		}
		else {
			System.out.println("student not found");
		}
		
	}
	static void SortStudents() {
		students.sort(Comparator.comparingInt(student::getMarks));
        System.out.println("Students succesfully sored");
        
	}
	static void DeleteStudent() {
		System.out.print("Enter Id to Detelete");
		int id=sc.nextInt();
		student s= studentmap.remove(id);
		if(s!=null) {
			students.remove(s);
			System.out.println("Student Successfully deleted");
		}
			else {
				System.out.println("student not founded");
			}
		}
		static void UpdateStudent() {
			System.out.print("Enter your ID");
			int id =sc.nextInt();
			student s=studentmap.get(id);
			if(s==null) {
				System.out.println("student not found");
				return;																															
			}
			sc.nextLine();
			System.out.print("Enter Name:");
			String newname=sc.nextLine();
			System.out.println("Enter Marks");
			int newmarks=sc.nextInt();
			s.setName(newname);
			s.setMarks(newmarks);
			System.out.println("Student details updated successfully!");
		}
	}


