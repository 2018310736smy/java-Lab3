package Xuankexitong;

public class Teachers extends father{
	String Lesson;
	 String getLesson() {
	     return Lesson;
	   }
	 public Teachers(String name,int num,String sex,String Lesson) {
	  this.Name = name;
	  this.Num = num;
	  this.Sex = sex;
	  this.Lesson = Lesson;
	  }
	 public String toString() {
	 return "Teachers(教师信息):  姓名：" + Name+ "    工号：" + Num + "     性别：" + Sex + "     所授课程：" + Lesson;  
	 }
}