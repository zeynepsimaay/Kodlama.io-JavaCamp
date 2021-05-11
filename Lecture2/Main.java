public class Main {
  public static void main(String[] args) {
    
    Course course1 = new Course("(C# + ANGULAR)", "Engin DEMİROG", 0.0, "Yazilim Gelistirici Yetistirme Kampi" );
    
    Course course2 = new Course("(JAVA + REACT)", "Engin DEMİROG", 0.0, "Yazilim Gelistirici Yetistirme Kampi" );

    Course course3 = new Course("Programlamaya Giris İcin Temel Kurs", "Engin DEMİROG", 0.0, "Temel programlama mantigini iceren kurs." );

    Course[] courses = {course1, course2, course3};

    for (Course course : courses){
       System.out.println( "The course is: " +  course.courseName);

    }
    
    CourseManager courseManager = new CourseManager();
    courseManager.takeTheCourse(course1);
    courseManager.takeTheCourse(course2);
    courseManager.takeTheCourse(course3);
   
    
    
   
  }
}
