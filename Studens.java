package Xuankexitong;

public class Studens extends father {
	Majorattribute a ;

	 public Studens(String name,int num,String sex) {
	  this.Name = name;
	  this.Num = num;
	  this.Sex = sex;
	  }

	 public String toString() {
	 return "Students(ѧ����Ϣ):  ������" + Name+ "    ѧ�ţ�" + Num + "   �Ա�" + Sex + "     ��ѡ�γ̣�" + a;
	 }
	 public void setName(String name){
	  Name = name;
	 }
	 public void setCourse(Majorattribute b){
	  a = b;
	 }
}