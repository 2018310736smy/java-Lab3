package Xuankexitong;

public class Majorattribute {
	int Num;
	 String Name;
	 String Place;
	 String getPlace() {
	     return Place;
	   }
	 int getNum() {
	     return Num;
	   }
	 String getName() {
	     return Name;
	   }
	 float Time;
	 float getTime() {
	     return Time;
	   }
	 float Score;
	 float getScore() {
	     return Score;
	   }
	 public Majorattribute(String name,int num,String place,float time,float score) {
	  this.Name = name;
	  this.Num = num;
	  this.Place = place;
	  this.Time = time;
	  this.Score = score;
	  }
	 public String toString() {
	 return Name + "      " + Name + "�Ŀγ̸�����" + Name+ "     �γ̱�ţ�" + Num + "   �Ͽεص㣺" + Place + "    �γ�ʱ�䣺" + Time + "Сʱ" + "     �γ�ѧ�֣�" +  Score + "��";
	 }
}
