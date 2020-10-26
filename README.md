# java-Lab3

#实验三  学生选课模拟系统

#实验目的：
    初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
    掌握面向对象的类设计方法（属性、方法）；
    掌握类的继承用法，通过构造方法实例化对象；
    学会使用super()，用于实例化子类；
    掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
    
#业务要求:
    说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
    对象：人员（编号、姓名、性别……）
          教师（编号、姓名、性别、所授课程）
			    学生（编号、姓名、性别、所选课程）
			    课程（编号、课程名称、上课地点、时间、学分）

#实验要求：
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师）；模拟学生退课操作，再打印课程信息。

#实验过程：
    首先，需要建立一个package命名为“xuankexitong”。插入一个父类class，在class中定义 Num为int型，Name、Sex为string型。使用get分别获得Num、Name、Sex。
    再建立一个class名为“Majorattribute”。调用Majorattribute方法，获取姓名、编号、上课地点、时间、学分的值。然后用toString方法打印出课程的属性。
    建立一个class名为“students”。“students”继承“xuankexitong”的类、方法。通过toString方法打印出 "Students(学生信息):  姓名：" + Name + "学号：" + Num + "性别："+ Sex + "所选课程"+a。然后定义set函数用于修改名字。
    建立一个class名为“Teachers”。“Teachers”继承“xuankexitong”的类、方法。通过toString方法打印出 "Teachers(老师信息):  姓名：" + Name + "工号：" + Num + "性别："+ Sex + "教授课程"+lesson。
    Test：增加一个学生和一个教师的，分别使用System.out.println(students.toString())System.out.println(teachers.toString())输出信息。

#流程图：

![image](https://github.com/2018310736smy/java-Lab3/blob/main/liuchengtu.png)

#核心代码（部分）：
选课系统：
int   Num;
  String   Name;
  String   Sex;
 int getNum() {
      return Num;
    }
 String getName() {
      return Name;
    }
 String getSex() {
      return Sex;

Majorattribute：
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

#运行结果截图：

![image](https://github.com/2018310736smy/java-Lab3/blob/main/yunxingjieguo.jpg)

#
