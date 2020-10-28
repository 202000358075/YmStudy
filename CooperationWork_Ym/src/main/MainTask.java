package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainTask {
	Abs_ReadFile ar;
	Ave_Max_Interface ami;
	Select_Interface sei;
	Sort_Interface soi;
	
	public Abs_ReadFile getAr() {
		return ar;
	}
	public void setAr(Abs_ReadFile ar) {
		this.ar = ar;
	}
	public Ave_Max_Interface getAmi() {
		return ami;
	}
	public void setAmi(Ave_Max_Interface ami) {
		this.ami = ami;
	}
	public Select_Interface getSei() {
		return sei;
	}
	public void setSei(Select_Interface sei) {
		this.sei = sei;
	}
	public Sort_Interface getSoi() {
		return soi;
	}
	public void setSoi(Sort_Interface soi) {
		this.soi = soi;
	}
	
	public void execute(String filepath) {
		Person p=new Person();
		ArrayList<Person> list1=new ArrayList<Person>();
		ArrayList<Person> list=ar.readFile(filepath);
		System.out.println("表格数据："+list);//读取txt中的数据，成为list
		System.out.println("--------------------------------------------------");
	    System.out.println("请输入学生姓名查询相应信息：");
		p=sei.select(list);
		System.out.println(p);
	    System.out.println("--------------------------------------------------");
	    float[] avenum = ami.getAve(list);
	    float[] maxnum = ami.getMax(list);
	    System.out.println("排序后的名单(从小到大排序)：");
	    list1=soi.sort(list);
	    for(int i=0;i<list1.size();i++) {
	    	 System.out.println(list1.get(i));
	    }	
		
		
	}
  public static void main(String[] arg) {
	    String filePath = "E:/git/repository2/CooperationWork/src/data/data.txt";
	    MainTask mt=new MainTask();
	    mt.setAr(new ReadFile());
	    mt.setAmi(new Ave_Max());
	    mt.setSei(new Select());
	    mt.setSoi(new Sort());
	    mt.execute(filePath);	 
  }

}