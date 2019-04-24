
public class Membership {
	public String welcome = "Welcome to FinalExam Fitness";
	
	private double annualFee;
	private String name;
	private int memberID;
	private int memberSince;
	private int discount;
	
	public Membership() {
		annualFee = 0.0;
		name = "Jane Doe";
		memberID = 0;
		memberSince = 0;
		discount = 0;
	}
	
	public Membership(String name, int memberID2, int memberSince) {
		this.name = name;
		this.memberID = memberID2;
		this.memberSince = memberSince;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a password to authorize the discount: ");
		String passwordYouEntered = sc.nextLine();
		
		String adminPassword = "password";
		if (password.equal(adminPassword)) {
			System.out.println("Your password is correct! Enter discount rate: ");
			this.discount = sc.nextInt();
		}
		else {
			System.out.println("Invalid password.");
		}
		
	}
	
	public void calculateAnnualFee() {
		annualFee = (1 - 0.01 * getDiscount()) * (100 + 12 * 30);
	}
	
	public void displayMemberInfo() {
		System.out.println("Member Name: " + this.name);
		System.out.println("Member ID: " + this.memberID);
		System.out.println("Member Since: " + this.memberSince);
		System.out.println("Member Fee: " + this.annualFee);
	}

}
