package Xuankexitong;

public class Studens extends father {
	Majorattribute a ;

	 public Studens(String name,int num,String sex) {
	  this.Name = name;
	  this.Num = num;
	  this.Sex = sex;
	  }

	 public String toString() {
	 return "Students(学生信息):  姓名：" + Name+ "    学号：" + Num + "   性别：" + Sex + "     所选课程：" + a;
	 }
	 public void setName(String name){
	  Name = name;
	 }
	 public void setCourse(Majorattribute b){
	  a = b;
	 }
}