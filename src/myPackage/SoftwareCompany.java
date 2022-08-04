package myPackage;

public class SoftwareCompany {
	String companyName;
	String companyLocation;
	int companyEmployees;
	boolean isActive;

	public SoftwareCompany() {
		System.out.println("This is default constructor");
	}

	public SoftwareCompany(String companyName, int companyEmployees, boolean isActive) {
		this.companyName = companyName;
		this.companyEmployees = companyEmployees;
		this.isActive = isActive;
	}

	public SoftwareCompany(String companyName, String companyLocation) {
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}

	 public SoftwareCompany(String companyName) {

		this.companyName = companyName;
	}
	//I want these constr into other class

}
