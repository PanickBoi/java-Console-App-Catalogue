package system;

import java.util.Scanner;

import java.util.ArrayList;


public class Main{
	
	String myPassword;
	
	static void showCreds(Users user) {
		String[] Roles = { "Student", "Teacher", "Secretariat", "Administration" };
		System.out.println("User Email: " + user.Email);
		System.out.println("User Name: " + user.WholeName);
		System.out.println("User ID: " + user.ID);
		System.out.println("User Access Level: " + Roles[user.AccessLevel]);
	}
	//Temp PolyMethod Location
	static void addUser(ArrayList<Users> UserList, Student Student) {
		Student USER = new Student(Student.WholeName,Student.Email,Student.Password,Student.AccessLevel,Student.ID);
		UserList.add(UserList.size(),USER);
	}

	static void addUser(ArrayList<Users> UserList, Teacher Teacher) {
		Teacher USER = new Teacher(Teacher.WholeName,Teacher.Email,Teacher.Password,Teacher.AccessLevel,Teacher.ID);
		UserList.add(UserList.size(),USER);
	}

	static void addUser(ArrayList<Users> UserList,Secretariat Secretariat) {
		Secretariat USER = new Secretariat(Secretariat.WholeName,Secretariat.Email,Secretariat.Password,Secretariat.AccessLevel,Secretariat.ID);
		UserList.add(UserList.size(),USER);
	}

	static void addUser(ArrayList<Users> UserList,Administration Administration) {
		Administration USER = new Administration(Administration.WholeName,Administration.Email,Administration.Password,Administration.AccessLevel,Administration.ID);
		UserList.add(UserList.size(),USER);
		
	}
	
	public static void main(String[] args) {
		// DB Deseriliazation

		
		ArrayList<Users> UserList = new ArrayList<Users>();
		Student student = new Student("PanickBoi", "Panickb@gmail.com", "1234", (byte) 0,UserList.size()+1);
		student.pf();
		// Fake Dummy User
		Administration fakeUser = new Administration("Koutelos", "Koutelos@gmail.com", "Koutoulakidion", (byte) 3,UserList.size()+1);
		
		addUser(UserList,student);
		addUser(UserList,fakeUser);
		// Introduction // 
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Hello to Skibitana Catalog lite");

		System.out.println("Please Provide an ID: ");
		int myID = myScanner.nextInt();
		System.out.println("Please Enter Password: ");
		Scanner myScanner2 = new Scanner(System.in);
		String myPass = myScanner2.nextLine();
		//Exit Scanner
		myScanner2.close();
		myScanner.close();
		
		// DB Search
		try {
			for (int i = 0; i < UserList.size(); i++) {
				if (UserList.get(i).ID == myID) {
					
					// Pass Handling
					
					if (UserList.get(i).Password.equals(myPass)) {

						System.out.println("Logged In");
						showCreds(UserList.get(i));
					}

					else {
						System.out.println("Wrong Password!");

					}
					break;
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
