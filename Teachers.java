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
	 return "Teachers(��ʦ��Ϣ):  ������" + Name+ "    ���ţ�" + Num + "     �Ա�" + Sex + "     ���ڿγ̣�" + Lesson;  
	 }
}