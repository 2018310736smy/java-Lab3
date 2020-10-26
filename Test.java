package Xuankexitong;

public class Test {
	public static void main(String[] args) {
		Majorattribute majorattribute;
		Studens students;
		students = new Studens("孙", 2018310736, "男");  
		students.setCourse(new Majorattribute ("离散", 0321, "教301",1.5f,2.0f));
		System.out.println(students.toString());
		Teachers teachers;
		teachers = new Teachers("李", 20001024, "女", "线代");
		System.out.println(teachers.toString());
		}
}