package com.hb.main;



import com.hb.domain.Adress;
import com.hb.domain.Course;
import com.hb.domain.Student;
import com.hb.domain.Teacher;
import com.hb.enums.BranchTypeEnum;
import com.hb.enums.CityEnums;
import com.hb.enums.ClassEnum;
<<<<<<< HEAD
=======
import com.hb.enums.CourseEnums;
import com.hb.enums.LocationEnums;
>>>>>>> master
import com.hb.services.IStudentService;
import com.hb.services.ITeacherService;
import com.hb.services.StudentServiceImpl;
import com.hb.services.TeacherServiceImpl;


public class Client {

	public static void main(String[] args) {

		IStudentService studentService = new StudentServiceImpl();
		ITeacherService teacherService = new TeacherServiceImpl();
		
		Adress adres1 = new Adress();
		Adress adres2 = new Adress();
		
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		
		Course course1 = new Course();
		Course course2 = new Course();
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		adres1.setAdress("Yorkshire Berkeley");
<<<<<<< HEAD
		adres1.setCity(CityEnums.ADANA);
=======
		adres1.setCity(CityEnums.IZMIR);
>>>>>>> master
		adres1.setStudent(student1);
		adres1.setTeacher(teacher1);
		
		adres2.setAdress("Red Boluevard");
<<<<<<< HEAD
		adres2.setCity(CityEnums.IZMIR);
=======
		adres2.setCity(CityEnums.ISTANBUL);
>>>>>>> master
		adres2.setStudent(student2);
		adres2.setTeacher(teacher2);
		
		teacher1.setName("Walter H.");
		teacher1.setSurname("White");
		teacher1.setAdres(adres1);
		teacher1.getCourse().add(course2);
		teacher1.getCourse().add(course1);
		teacher1.setBranch(BranchTypeEnum.FIZIK);
		
		teacher2.setName("Theodore");
		teacher2.setSurname("Bagwell");
		teacher2.setAdres(adres2);
		teacher2.getCourse().add(course2);
		teacher2.getCourse().add(course1);
		teacher2.setBranch(BranchTypeEnum.MATEMATIK);
		
<<<<<<< HEAD
//		course1.setCourseName(BranchTypeEnum.KIMYA);
//		course1.setLocation(LocationEnums.HOME);
//		course1.setTeacher(teacher2);
//		course1.getStudentList().add(student2);
//		course1.getStudentList().add(student1);
//		
//		course2.setCourseName(CourseEnums.BIOLOGY);
//		course2.setLocation(LocationEnums.PREPSCHOOL);
//		course2.setTeacher(teacher1);
//		course2.getStudentList().add(student2);
//		course2.getStudentList().add(student1);
//		
//		student1.setName("Boris");
//		student1.setSurName("Yeltsin");
//		student1.setClassNumber(ClassEnum.A);
//		student1.setAge(55);
//		student1.setAdress(adres1);
//		student1.getCourseList().add(course2);
//		student1.getCourseList().add(course1);
//		
//		student2.setName("Cahar");
//		student2.setSurName("Dudayev");
//		student2.setClassNumber(ClassEnum.B);
//		student2.setAge(45);
//		student2.setAdress(adres2);
//		student2.getCourseList().add(course2);
//		student2.getCourseList().add(course1);
//		
//		studentService.saveStudent(student2);
//		studentService.saveStudent(student1);
=======
		course1.setCourseName("PHYSICS");
		course1.setLocation(LocationEnums.HOME);
		course1.setTeacher(teacher2);
		course1.getStudentList().add(student2);
		course1.getStudentList().add(student1);
		
		course2.setCourseName("BIOLOGY");
		course2.setLocation(LocationEnums.PREPSCHOOL);
		course2.setTeacher(teacher1);
		course2.getStudentList().add(student2);
		course2.getStudentList().add(student1);
		
		student1.setName("Boris");
		student1.setSurName("Yeltsin");
		student1.setClassNumber(ClassEnum.A);
		student1.setAge(55);
		student1.setAdress(adres1);
		student1.getCourseList().add(course2);
		student1.getCourseList().add(course1);
		
		student2.setName("Cahar");
		student2.setSurName("Dudayev");
		student2.setClassNumber(ClassEnum.B);
		student2.setAge(45);
		student2.setAdress(adres2);
		student2.getCourseList().add(course2);
		student2.getCourseList().add(course1);
		
		studentService.createStudent(student2);
		studentService.createStudent(student1);
>>>>>>> master
		
//		adressService.saveAdress(adres2);
//		adressService.saveAdress(adres1);
		
//		courseService.saveCourse(course2);
//		courseService.saveCourse(course1);
		
		teacherService.createTeacher(teacher2);
		teacherService.createTeacher(teacher1);
		

	}

}
