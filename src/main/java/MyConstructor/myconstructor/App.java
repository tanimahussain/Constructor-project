package MyConstructor.myconstructor;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	University Harvard= new University("harvard univerty","boston");
    	University Columbia=new University("columbia university","ny");
    	
    	Student Tanima= new Student("Tanima",1,Harvard);
    	Student Farha= new Student("farha",2,Columbia);
    	
    	Tanima.printstudentdetails();
    	Harvard.printuniversitydetails();
    
    }
}
