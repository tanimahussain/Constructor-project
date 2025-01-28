package MyConstructor.myconstructor;

public class University {
	private String name;
	private String location;
	
	public University(String name, String location) {
		this.name=name;
		this.location=location;
	}
	
	public void setname(String newname) {
		this.name=newname;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getlocation() {
		return this.location;
	}
	
	public void printuniversitydetails() {
		System.out.println(name);
		System.out.println(location);
		
	}

}
