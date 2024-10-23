package system;

import java.util.ArrayList;
import java.io.*;

interface Menu {
	public void pf();

	public void actions();

	public void action_action(int action);
}

public class Users implements Menu, java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	final String[] RoleArray = { "Student", "Teacher", "Secretariat", "Administration" };
	String WholeName;
	String Email;
	private String Password;
	byte AccessLevel;
	private int ID;
	public static ArrayList<Users> UserList = new ArrayList<Users>();
	
	public Users(String WholeName, String Email, String Password, byte AccessLevel, int ID) {

		this.WholeName = WholeName;
		this.Email = Email;
		this.setPass(Password);
		this.AccessLevel = AccessLevel;
		this.setID(ID);

	}

	public void pf() {
	}

	public void actions() {
	}

	public void action_action(int action) {
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPass() {
		return Password;
	}

	public void setPass(String password) {
		Password = password;
	}

	static void savedata() {
		// saves data
		String filename = "DATABASE";
		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(Users.UserList);

			out.close();
			file.close();

			System.out.println("data kabobos");

		}

		catch (IOException ex) {
			System.out.println("yes");
		}
	}

	static void unsavedata() {
		String filename = "DATABASE";

		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			ArrayList<Users> object1 = (ArrayList<Users>) in.readObject();

			in.close();
			file.close();
		}

		catch (IOException ex) {
			System.out.println("no daataa");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("no clasasas");
		}
		catch (Exception ex) {
			System.out.println("no working");
		}
	}
	
	static Users searchByName(String Name) {
		for (int i = 0; i < Users.UserList.size(); i++) {
			
			Users foundUser = Users.UserList.get(i);
			if (foundUser.WholeName.equals(Name)) {
				return (Users) foundUser;
			}
		}
		Users non_existant = new Users("", "", "", (byte) 0,-1);
		return non_existant;
	}

}

class Student extends Users {

	Student(String WholeName, String Email, String Password, byte AccessLevel, int ID) {
		super(WholeName, Email, Password, AccessLevel, ID);
		super.AccessLevel = 0;
	}

	@Override
	public void pf() {
		System.out.println(super.WholeName + "'s Profile" + "\nEmail: " + super.Email + "\nMember Type: "
				+ super.RoleArray[super.AccessLevel]);
	}

	@Override
	public void actions() {
		System.out.println(super.RoleArray[super.AccessLevel] + " Action Menu for " + super.WholeName + ":");
		System.out.println("1. View Grades");
		System.out.println("2. Register for Classes");
		System.out.println("3. View Schedule");
		System.out.println("4. Logout");
		System.out.println("5. view men");
	}

	@Override
	public void action_action(int action) {
		switch (action) {
		case 1:
			System.out.println("Grades: Failed");
			break;
		case 2:
			System.out.println("no");
			break;
		case 3:
			System.out.println("all day");
			break;
		case 4:
			System.out.println("Logging out");
			savedata();
			System.exit(0);
			break;
		case 5:
			break;
		default:
			System.out.println("no work");
			break;
		}
	}
}

class Teacher extends Users {

	Teacher(String WholeName, String Email, String Password, byte AccessLevel, int ID) {
		super(WholeName, Email, Password, AccessLevel, ID);
		super.AccessLevel = 1;
	}

	@Override
	public void pf() {
		System.out.println(super.WholeName + "'s Profile" + "\nEmail: " + super.Email + "\nMember Type: "
				+ super.RoleArray[super.AccessLevel]);
	}

	@Override
	public void actions() {
		System.out.println(super.RoleArray[super.AccessLevel] + " Action Menu for " + super.WholeName + ":");
		System.out.println("1. View Grades");
		System.out.println("2. Register for Classes");
		System.out.println("3. View Schedule");
		System.out.println("4. Logout");
	}
}

class Secretariat extends Users {

	Secretariat(String WholeName, String Email, String Password, byte AccessLevel, int ID) {
		super(WholeName, Email, Password, AccessLevel, ID);
		super.AccessLevel = 2;
	}

	@Override
	public void pf() {
		System.out.println(super.WholeName + "'s Profile" + "\nEmail: " + super.Email + "\nMember Type: "
				+ super.RoleArray[super.AccessLevel]);
	}

	@Override
	public void actions() {
		System.out.println(super.RoleArray[super.AccessLevel] + " Action Menu for " + super.WholeName + ":");
		System.out.println("1. View Grades");
		System.out.println("2. Register for Classes");
		System.out.println("3. View Schedule");
		System.out.println("4. Logout");
	}
}

class Administration extends Users {

	Administration(String WholeName, String Email, String Password, byte AccessLevel, int ID) {
		super(WholeName, Email, Password, AccessLevel, ID);
		super.AccessLevel = 3;
	}

	@Override
	public void pf() {
		System.out.println(super.WholeName + "'s Profile" + "\nEmail: " + super.Email + "\nMember Type: "
				+ super.RoleArray[super.AccessLevel]);

	}

	@Override
	public void actions() {
		System.out.println(super.RoleArray[super.AccessLevel] + " Action Menu for " + super.WholeName + ":");
		System.out.println("1. View Grades");
		System.out.println("2. Register for Classes");
		System.out.println("3. View Schedule");
		System.out.println("4. Logout");
	}
}
