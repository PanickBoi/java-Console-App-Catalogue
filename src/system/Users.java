package system;

interface Menu{
	public void pf();
	public void actions();
}
public class Users {
	final String[] RoleArray = {"Student","Teacher","Secretariat","Administration"};
	String WholeName;
	String Email;
	String Password;
	byte AccessLevel;
	int ID;
	
	public Users(String WholeName,String Email,String Password,byte AccessLevel,int ID){
		this.WholeName = WholeName;
		this.Email = Email;
		this.Password = Password;
		this.AccessLevel = AccessLevel;
		this.ID = ID;
	}
	}
	
class Student extends Users implements Menu {
	
	Student(String WholeName,String Email,String Password,byte AccessLevel,int ID) {
		super(WholeName,Email,Password,AccessLevel,ID);
		super.AccessLevel = 0;
	}
	
	@Override
    public void pf() {
        System.out.println(super.RoleArray[super.AccessLevel]+" Menu for " + super.WholeName + ":");
    }
	
    @Override
    public void actions() {
        System.out.println(super.RoleArray[super.AccessLevel]+" Action Menu for " + super.WholeName + ":");
        System.out.println("1. View Grades");
        System.out.println("2. Register for Classes");
        System.out.println("3. View Schedule");
        System.out.println("4. Logout");
    }
}
class Teacher extends Users implements Menu {
	
	Teacher(String WholeName,String Email,String Password,byte AccessLevel,int ID) {
		super(WholeName,Email,Password,AccessLevel,ID);
		super.AccessLevel = 0;
	}
	
	@Override
    public void pf() {
        System.out.println(super.RoleArray[super.AccessLevel]+" Menu for " + super.WholeName + ":");
    }
	
    @Override
    public void actions() {
        System.out.println(super.RoleArray[super.AccessLevel]+" Action Menu for " + super.WholeName + ":");
        System.out.println("1. View Grades");
        System.out.println("2. Register for Classes");
        System.out.println("3. View Schedule");
        System.out.println("4. Logout");
    }
}
class Secretariat extends Users implements Menu {
	
	Secretariat(String WholeName,String Email,String Password,byte AccessLevel,int ID) {
		super(WholeName,Email,Password,AccessLevel,ID);
		super.AccessLevel = 0;
	}
	
	@Override
    public void pf() {
        System.out.println(super.RoleArray[super.AccessLevel]+" Menu for " + super.WholeName + ":");
    }
	
    @Override
    public void actions() {
        System.out.println(super.RoleArray[super.AccessLevel]+" Action Menu for " + super.WholeName + ":");
        System.out.println("1. View Grades");
        System.out.println("2. Register for Classes");
        System.out.println("3. View Schedule");
        System.out.println("4. Logout");
    }
}
class Administration extends Users implements Menu {
	
	Administration(String WholeName,String Email,String Password,byte AccessLevel,int ID) {
		super(WholeName,Email,Password,AccessLevel,ID);
		super.AccessLevel = 0;
	}
	
	@Override
    public void pf() {
        System.out.println(super.RoleArray[super.AccessLevel]+" Menu for " + super.WholeName + ":");
    }
	
    @Override
    public void actions() {
        System.out.println(super.RoleArray[super.AccessLevel]+" Action Menu for " + super.WholeName + ":");
        System.out.println("1. View Grades");
        System.out.println("2. Register for Classes");
        System.out.println("3. View Schedule");
        System.out.println("4. Logout");
    }
}
