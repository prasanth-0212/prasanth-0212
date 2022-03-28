import java.util.*;

class Student {
	private int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String name;
	private int age;
	private String gender;

}

public class StudentDetails {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> Students = new ArrayList<Student>();

		System.out.println("Enter the Student count");
		int studentCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < studentCount; i++) {

			Student stu = new Student();
			System.out.println("Enter Name");
			stu.setName(sc.nextLine());

			System.out.println("Enter Roll Number");
			stu.setRollno(Integer.parseInt(sc.nextLine()));

			System.out.println("Enter the age");
			stu.setAge(Integer.parseInt(sc.nextLine()));

			System.out.println("Enter the Gender");
			stu.setGender(sc.nextLine());

			Students.add(stu);
		}
		System.out.println("+-------+-------+--------+--------+");
		System.out.println("|Name\t|Roll\t|Gender\t |Age\t |");
		System.out.println("+-------+-------+--------+--------+");
		for (int i = 0; i < Students.size(); i++) {

			System.out.println("|" + Students.get(i).getName() + "\t" + "|" + Students.get(i).getRollno() + "\t" + "|"
					+ Students.get(i).getAge() + "\t " + "|" + Students.get(i).getGender() + "\t " + "|");

			System.out.println("+-------+-------+--------+--------+");
		}
		int menuChoice;
		System.out.println("If you want add other Student details -> Click One");
		System.out.println();
		System.out.println("Or Else want to remove Student details -> Click Two");
		System.out.println();
		System.out.println("No Three ->Used to Close the Scanner");
		System.out.println();
		do {
			System.out.println("Enter a Choice");
			menuChoice = sc.nextInt();
			if (menuChoice == 1) {
				System.out.println("Enter Position");
				int position = sc.nextInt();
				int index = position - 1;
				Student stu = new Student();
				sc.nextLine();
				System.out.println("Enter the Name");
				stu.setName(sc.nextLine());
				System.out.println("Enter the Rollno");
				stu.setRollno(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter the Age");
				stu.setAge(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter the Gender");
				stu.setGender(sc.nextLine());
				
				if(index>Students.size()) {
				Students.add(stu);
				}
				System.out.println("+-------+-------+--------+--------+");
				System.out.println("|Name\t|Roll\t|Gender\t |Age\t |");
				System.out.println("+-------+-------+--------+--------+");
				for (int i = 0; i < Students.size(); i++) {

					System.out.println("|" + Students.get(i).getName() + "\t" + "|" + Students.get(i).getRollno() + "\t"
							+ "|" + Students.get(i).getAge() + "\t " + "|" + Students.get(i).getGender() + "\t " + "|");

					System.out.println("+-------+-------+--------+--------+");
				}
				System.out.println("######Successfully Added the Student Information######");

			} else if (menuChoice == 2) {
				System.out.println("Enter the Remove Roll");
				int roll = sc.nextInt();

				sc.nextLine();
				for (int i = 0; i < Students.size(); i++) {
					if (Students.get(i).getRollno() == roll) {
						Students.remove(i);
					}
				}
				System.out.println("+-------+-------+--------+--------+");
				System.out.println("|Name\t|Roll\t|Gender\t |Age\t |");
				System.out.println("+-------+-------+--------+--------+");
				for (int i = 0; i < Students.size(); i++) {

					System.out.println("|" + Students.get(i).getName() + "\t" + "|" + Students.get(i).getRollno() + "\t"
							+ "|" + Students.get(i).getAge() + "\t " + "|" + Students.get(i).getGender() + "\t " + "|");

					System.out.println("+-------+-------+--------+--------+");
				}
				System.out.println("You have Removed Someone Details ");
			} else if (menuChoice == 3) {
				sc.close();
				System.out.println("Scanner Closed");
				System.out.println("******Successfully Updated the Students Details******");

			}
		} while (menuChoice < 3);

	}
}
