package Xuankexitong;

public class Test {
	public static void main(String[] args) {
		Majorattribute majorattribute;
		Studens students;
		students = new Studens("��", 2018310736, "��");  
		students.setCourse(new Majorattribute ("��ɢ", 0321, "��301",1.5f,2.0f));
		System.out.println(students.toString());
		Teachers teachers;
		teachers = new Teachers("��", 20001024, "Ů", "�ߴ�");
		System.out.println(teachers.toString());
		}
}