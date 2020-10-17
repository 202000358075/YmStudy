package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainTask {
	
  public static void main(String[] arg) {
	    String filePath = "D:\\计算机基础\\GitStudy\\CooperationWork\\src\\data\\data.txt";
	    ArrayList<Person> list_txt=new ArrayList<Person>();

	    
	    list_txt=readTxt(filePath); 
	    System.out.println("表格数据："+list_txt);//读取txt中的数据，成为list
		 
  }
  public static ArrayList readTxt(String filePath) {

	  ArrayList list=new ArrayList();

	  try {
	    File file = new File(filePath);
	    if(file.isFile() && file.exists()) {//gbk
	      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "gbk");
	      BufferedReader br = new BufferedReader(isr);
	      String lineTxt = null;
	      int line=0;
	      while ((lineTxt = br.readLine()) != null) {
	    	 String[] person_txt=lineTxt.split("\\s+");		
			if(line>0) {
				
				  Person person=new Person(); person.setNo(Integer.parseInt(person_txt[0]));
				  person.setName(person_txt[1]);
				  person.setMath(Integer.parseInt(person_txt[2]));
				  person.setChinese(Integer.parseInt(person_txt[3]));
				  person.setEnglish(Integer.parseInt(person_txt[4]));
				  
				  list.add(person);

			}
			 line++;
	      }		
	      
	      br.close();
	    } else {
	      System.out.println("文件不存在!");
	    }
	  } catch (Exception e) {
	    System.out.println("文件读取错误!");
	  }
	  return list;
	  }

}
