
public class StudentManager extends UserManager {
	public void Add() {
		System.out.println("Kurs eklendi.");
	}
	public void Completion(Student student) {
		System.out.println(student.getStudentNumber()+ " numarali ogrenci kursun %" + student.getCompletion()+"'unu tamamladi." );
	}
	
}
