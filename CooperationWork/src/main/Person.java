package main;

public class Person {
private int no;
private String name;
private int math;
private int chinese;
private int english;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
public int getChinese() {
	return chinese;
}
public void setChinese(int chinese) {
	this.chinese = chinese;
}
public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
@Override
public String toString() {
	return "no=" + no + ", name=" + name + ", math=" + math + ", chinese=" + chinese + ", english=" + english;
}


}
