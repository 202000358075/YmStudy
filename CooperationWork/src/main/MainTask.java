package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainTask {
	
  public static void main(String[] arg) {
	    String filePath = "E:/git/repository2/CooperationWork/src/data/data.txt";
	    ArrayList<Person> list_txt=new ArrayList<Person>();
	    Ave_Max am=new Ave_Max();
	    Select select=new Select();
	    list_txt=readTxt(filePath); 
	    Person p=new Person();
	    Read_Sort rs=new Read_Sort();
	    Sort s=new Sort();
	    System.out.println("表格数据："+list_txt);//读取txt中的数据，成为list
	    System.out.println("----------------------------------");
	    System.out.println("排序结果：");
	    int[] rds=new int[list_txt.size()];
	    rs.set_Sort_Interface(new Sort());
		rds=rs.readsort(list_txt); 
		for(int i=0;i<rds.length;i++) {
		System.out.println(rds[i]);
		}
		/*int[] sort_num=new int[list_txt.size()];
		sort_num=s.sort(rds); 
		for(int i=0;i<sort_num.length;i++) { 
			 System.out.println(sort_num[i]); 
		}*/		 
	    System.out.println("----------------------------------");
	    float[] avenum = am.getAve(list_txt);
	    float[] maxnum = am.getMax(list_txt);
	    System.out.println("----------------------------------");
		    System.out.println("请输入学生姓名查询相应信息：");
		    p=select.select(list_txt);
		    System.out.println(p);
		    
		 
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
