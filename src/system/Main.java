package system;

import java.util.Scanner;

import java.util.ArrayList;


public class Main{
	
	public static void main(String[] args) {
		// DB Deseriliazation

		
		Student student = new Student("PanickBoi", "Panickb@gmail.com", "1234", (byte) 0,0);
		//student.pf();
		// Fake Dummy User
		Administration fakeUser = new Administration("Koutelos", "Koutelos@gmail.com", "Koutoulakidion", (byte) 3,1);
		
		Users.UserList.add(student);
		Users.UserList.add(fakeUser);
		// Introduction // 
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Hello to Skibitana Catalog lite");
		
		System.out.println("Please Provide an ID: ");
		int myID = myScanner.nextInt();
		
		System.out.println("Please Enter Password: ");
		Scanner myScanner2 = new Scanner(System.in);
		String myPass = myScanner2.nextLine();
		//Exit Scanner
		//myScanner.close();
		//myScanner2.close();
		
		// DB Search
		try {
			for (int i = 0; i < Users.UserList.size(); i++) {
				
				Users myUser = Users.UserList.get(i);
				int foundID = myUser.getID();
				
				if (foundID == myID) {
					
					// Pass Handling
					String foundPass = myUser.getPass();
					if (foundPass.equals(myPass)) {
						
						myUser.pf();
						myUser.actions();
						Scanner myScanner3 = new Scanner(System.in);
						System.out.println("Type Action Number: ");

						int action = myScanner3.nextInt();
						
						myUser.action_action(action);
						if (action==1) {
							Administration fakeUser2 = new Administration("Spoonos", "Spiniss@gmail.com", "Spanos", (byte) 3,1);
							Users.UserList.add(fakeUser2);
						}
						myScanner.close();
						myScanner2.close();
						myScanner3.close();
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
