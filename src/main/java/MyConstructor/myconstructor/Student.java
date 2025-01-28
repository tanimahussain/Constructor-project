package MyConstructor.myconstructor;

public class Student {
	private String name;
	private int id;
	public University studentuniversity;
	
	public Student(String name,int id, University studentuv) {
	this.name=name;
	this.id=id;
	this.studentuniversity=studentuv;
	}
	
	public String getname() {
		return this.name;
	}
	public int getid() {
		return this.id;
	}
	public void printstudentdetails() {
		System.out.println(name);
		System.out.println(id);
		studentuniversity.printuniversitydetails();
	}

}
