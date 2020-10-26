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
	 return Name + "      " + Name + "的课程概述：" + Name+ "     课程编号：" + Num + "   上课地点：" + Place + "    课程时间：" + Time + "小时" + "     课程学分：" +  Score + "分";
	 }
}
