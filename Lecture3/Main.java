
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setAbout("Yazılım Geliştirme Danışmanı");
		instructor.setCertificate("MCT,PMP,ITIL");
		
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Zeynep Simay");
		student.setLastName("KILINC");
		student.setEmail("kilinc.zeynepsimay@gmail.com");
		student.setStudentNumber(123);
		student.setCompletion(49);
		
		//User user = new User(); 
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.LogIn( instructor );
		instructorManager.List();
		instructorManager.LogOut(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.LogIn( student);
		studentManager.Add();
		studentManager.Completion(student);
		studentManager.LogOut(student);
		
		//UserManager userManager = new UserManager();
		//userManager.LogIn(user);
		//userManager.LogOut(user);
		

	}

}
